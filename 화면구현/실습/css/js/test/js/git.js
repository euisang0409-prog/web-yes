// 등록
const searchInput = document.getElementById("searchInput");
const searchBtn = document.getElementById("searchBtn");
const allBtn = document.getElementById("allBtn");
const message = document.getElementById("message");
const count = document.getElementById("count");
const productList = document.getElementById("productList");

// 페이지 로드
window.addEventListener("load", loadProducts);

// 유효성 검사
const validateSearch = () => {
  const value = searchInput.value.trim();

  const regex = /^[a-zA-Z0-9\s]+$/;

  if (value === "") {
    message.textContent = "검색어를 입력하세요.";
    message.className = "error";
    return false;
  }

  if (value.length < 2) {
    message.textContent = "검색어는 2글자 이상 입력하세요.";
    message.className = "error";
    return false;
  }

  if (!regex.test(value)) {
    message.textContent = "검색어에는 특수문자를 입력할 수 없습니다.";
    message.className = "error";
    return false;
  }

  message.textContent = "";
  message.className = "";

  return true;
};

// 전체 상품 조회
async function loadProducts() {
  try {
    message.textContent = "";
    message.className = "";

    const response = await fetch("https://dummyjson.com/products?limit=30");
    const data = await response.json();

    count.textContent = `전체 상품 : ${data.products.length}개`;

    printProducts(data.products);
  } catch (error) {
    message.textContent = "상품 정보를 불러오지 못했습니다.";
    message.className = "error";
  }
}

// 상품 출력
const printProducts = (products) => {
  productList.innerHTML = "";

  products.forEach((product) => {
    let stockText = "";
    let stockClass = "";

    if (product.stock < 10) {
      stockText = "재고 부족";
      stockClass = "stock-low";
    } else {
      stockText = "재고 정상";
      stockClass = "stock-normal";
    }

    productList.innerHTML += `
      <div class="product-card">

        <img src="${product.thumbnail}" alt="${product.title}">

        <h3>${product.title}</h3>

        <p>카테고리 : ${product.category}</p>

        <p>가격 : $${product.price}</p>

        <p>할인율 : ${product.discountPercentage}%</p>

        <p>평점 : ${product.rating}</p>

        <p class="${stockClass}">
          재고 : ${product.stock}개 (${stockText})
        </p>

      </div>
    `;
  });
};

// 검색
const searchProduct = async () => {
  if (!validateSearch()) {
    return;
  }

  const keyword = searchInput.value.trim();

  try {
    const response = await fetch(
      `https://dummyjson.com/products/search?q=${keyword}`,
    );

    const data = await response.json();

    if (data.products.length === 0) {
      message.textContent = "검색 결과가 없습니다.";
      message.className = "info";

      count.textContent = "";
      productList.innerHTML = "";

      return;
    }

    message.textContent = "검색 완료";
    message.className = "success";

    count.textContent = `검색 결과 : ${data.products.length}`;

    printProducts(data.products);
  } catch (error) {
    message.textContent = "상품 정보를 불러오지 못했습니다.";
    message.className = "error";
  }
};

// 검색 버튼
searchBtn.addEventListener("click", searchProduct);

// 전체보기
allBtn.addEventListener("click", () => {
  searchInput.value = "";

  loadProducts();
});

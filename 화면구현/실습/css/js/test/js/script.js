// 요소 가져오기
let searchInput = document.getElementById("searchInput");
let searchBtn = document.getElementById("searchBtn");
let allBtn = document.getElementById("allBtn");
let message = document.getElementById("message");
let count = document.getElementById("count");
let productList = document.getElementById("productList");

// 전체 상품 출력
window.addEventListener("load", loadProducts);

// 검색어 검사
function validateSearch() {
  let value = searchInput.value;
  value = value.trim();

  let regex = /^[a-zA-Z0-9\s]+$/;

  // 빈칸 검사
  if (value == "") {
    message.textContent = "검색어를 입력하세요.";
    message.className = "error";
    return false;
  }

  // 2글자 이상 검사
  if (value.length < 2) {
    message.textContent = "검색어는 2글자 이상 입력하세요.";
    message.className = "error";
    return false;
  }

  // 특수문자 검사
  if (!regex.test(value)) {
    message.textContent = "검색어에는 특수문자를 입력할 수 없습니다.";
    message.className = "error";
    return false;
  }

  message.textContent = "";
  message.className = "";

  return true;
}

// 전체 상품 조회
async function loadProducts() {
  message.textContent = "";
  message.className = "";
  count.textContent = "";

  try {
    let response = await fetch("https://dummyjson.com/products?limit=30");

    let data = await response.json();

    count.textContent = "상품 개수 : " + data.products.length;

    printProducts(data.products);
  } catch (error) {
    message.textContent = "상품 정보를 불러오지 못했습니다.";
    message.className = "error";
  }
}

// 상품 출력
function printProducts(products) {
  // 기존 목록 삭제
  productList.innerHTML = "";

  // 상품 개수만큼 반복
  for (let i = 0; i < products.length; i++) {
    let product = products[i];

    let stockText = "";
    let stockClass = "";

    // 재고 확인
    if (product.stock < 10) {
      stockText = "재고 부족";
      stockClass = "stock-low";
    } else {
      stockText = "재고 정상";
      stockClass = "stock-normal";
    }

    // 카드 출력
    productList.innerHTML += `
            <div class="product-card">

                <img src="${product.thumbnail}" alt="${product.title}">

                <h3>${product.title}</h3>

                <p>카테고리 : ${product.category}</p>

                <p>가격 : ${product.price}</p>

                <p>할인율 : ${product.discountPercentage}</p>

                <p>평점 : ${product.rating}</p>

                <p class="${stockClass}">
                    재고 : ${product.stock} 
                </p>
                ${stockText}
            </div>
        `;
  }
}

// 상품 검색
async function searchProduct() {
  // 유효성 검사
  if (validateSearch() == false) {
    return;
  }

  let keyword = searchInput.value;
  keyword = keyword.trim();

  try {
    let response = await fetch(
      "https://dummyjson.com/products/search?q=" + keyword,
    );

    let data = await response.json();

    // 검색 결과가 없는 경우
    if (data.products.length == 0) {
      message.textContent = "검색 결과가 없습니다.";
      message.className = "info";

      count.textContent = "";
      productList.innerHTML = "";

      return;
    }

    // 검색 성공
    message.textContent = "검색이 완료되었습니다.";
    message.className = "success";

    count.textContent = "검색 결과 : " + data.products.length + "개";

    printProducts(data.products);
  } catch (error) {
    message.textContent = "상품 정보를 불러오지 못했습니다.";
    message.className = "error";
  }
}

// 검색 버튼
searchBtn.addEventListener("click", function () {
  searchProduct();
});

// 전체보기 버튼
allBtn.addEventListener("click", function () {
  searchInput.value = "";

  message.textContent = "";
  message.className = "";

  loadProducts();
});

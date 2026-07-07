const keyword = document.getElementById("keyword");
const searchBtn = document.getElementById("searchBtn");
const message = document.getElementById("message");
const bookList = document.getElementById("bookList");

// 검색 버튼 클릭
searchBtn.addEventListener("click", searchBook);

function searchBook() {
  const text = keyword.value.trim();

  // 메시지 및 결과 초기화
  message.textContent = "";
  bookList.innerHTML = "";

  // 1. 빈 값 검사
  if (text === "") {
    message.textContent = "검색어를 입력하세요.";
    return;
  }

  // 2. 2자 이상
  if (text.length < 2) {
    message.textContent = "검색어는 2자 이상 입력하세요.";
    return;
  }

  // 3. 특수문자 검사
  const regex = /^[가-힣a-zA-Z0-9\s]+$/;

  if (!regex.test(text)) {
    message.textContent = "한글, 영어, 숫자, 공백만 입력 가능합니다.";
    return;
  }

  // API 요청
  fetch(`https://openlibrary.org/search.json?title=${text}`)
    .then((response) => response.json())

    .then((data) => {
      // 검색 결과 없음
      if (data.docs.length === 0) {
        message.textContent = "검색 결과가 없습니다.";
        return;
      }

      // 최대 10권 출력
      const books = data.docs.slice(0, 10);

      bookList.innerHTML = books
        .map(
          (book) => `
        <div class="card">
          <h3>${book.title ?? "제목 없음"}</h3>

          <p>
            <strong>저자 :</strong>
            ${book.author_name ? book.author_name.join(", ") : "정보 없음"}
          </p>

          <p>
            <strong>최초 출판연도 :</strong>
            ${book.first_publish_year ?? "정보 없음"}
          </p>

          <p>
            <strong>출판사 :</strong>
            ${book.publisher ? book.publisher[0] : "정보 없음"}
          </p>
        </div>
      `,
        )
        .join("");
    })

    .catch((error) => {
      message.textContent = "도서 정보를 불러오지 못했습니다.";
      console.log(error);
    });
}

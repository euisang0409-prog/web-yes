// 요소들을 등록

// 문의 유형 선택장
let type = document.getElementById("type");
// 제목
let title = document.getElementById("title");
// 이메일
let email = document.getElementById("email");
// 문의 내용
let content = document.getElementById("content");
// 체크박스
let agree = document.getElementById("agree");
// 버튼
let submitBtn = document.getElementById("submitBtn");
// 문의 목록
let list = document.getElementById("list");

let typeMsg = document.getElementById("typeMsg");
let titleMsg = document.getElementById("titleMsg");
let emailMsg = document.getElementById("emailMsg");
let contentMsg = document.getElementById("contentMsg");
let agreeMsg = document.getElementById("agreeMsg");

// 문의 유형 선택 검사

const validateType = () => {
  // 유형을 선택하지 않았다면
  if (type.value === "") {
    // 메시지
    typeMsg.innerContent = "문의 유형을 선택하세요.";
    return false;
  }

  typeMsg.innerContent = "선택 완료";
  typeMsg.className = "success";
};

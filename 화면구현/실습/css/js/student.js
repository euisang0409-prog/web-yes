const nameInput = document.getElementById("name");

const courseInput = document.getElementById("course");

const emailInput = document.getElementById("email");

const addBtn = document.getElementById("addBtn");

const loadBtn = document.getElementById("loadBtn");

const studentList = document.getElementById("studentList");

const URL = "http://localhost:10000/api/students";

// 목록 조회

loadBtn.addEventListener("click", () => {
  fetch(URL)
    .then((res) => res.json())
    .then((data) => {
      studentList.innerHTML = "";

      data.data.forEach((student) => {
        let tr = document.createElement("tr");

        tr.innerHTML = `

            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.course}</td>
            <td>${student.email}</td>

            `;

        studentList.appendChild(tr);
      });
    });
});

// 등록

addBtn.addEventListener("click", () => {
  const name = nameInput.value;

  const course = courseInput.value;

  const email = emailInput.value;

  // 검증

  if (name === "") {
    alert("이름을 입력하세요");

    return;
  }

  if (course === "") {
    alert("과정을 선택하세요");

    return;
  }

  if (email === "") {
    alert("이메일을 입력하세요");

    return;
  }

  if (!email.includes("@")) {
    alert("올바른 이메일 형식이 아닙니다");

    return;
  }

  const student = {
    name: name,

    course: course,

    email: email,
  };

  fetch(URL, {
    method: "POST",

    headers: {
      "Content-Type": "application/json",
    },

    body: JSON.stringify(student),
  })
    .then((res) => res.json())

    .then((data) => {
      alert(data.message);

      nameInput.value = "";

      courseInput.value = "";

      emailInput.value = "";

      loadBtn.click();
    });
});

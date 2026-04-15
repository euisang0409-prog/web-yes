# Java File 클래스 완전 정리 (주석 그대로 + 출력 포함)

```java
// 메모장까지의 경로
String path = "C:\\Users\\adminn\\Desktop\\web-yes\\test.txt";

// 준비된 경로로 File객체를 생성
// File 클래스
// 자바에서 파일과 디렉터리(폴더)를 다루기 위한 클래스
File f = new File(path);

// 주요 메서드
// getName()
// 파일명 또는 마지막 경로명을 반환한다.
System.out.println(f.getName());
// 출력: test.txt

// getPath()
// 생성할 때 넣은 경로를 반환한다.
System.out.println(f.getPath());
// 출력: C:\Users\adminn\Desktop\web-yes\test.txt

//getAbsolutePath();
// 절대 경로
System.out.println(f.getAbsolutePath());
// 출력: C:\Users\adminn\Desktop\web-yes\test.txt

// 절대경로
// 운영체제 기준으로 전체 위치가 명확한 경로

// 상대경로
// 현재 프로그램 실행 위치를 기준으로 한 경로
// 상대경로는 편하지만, 프로그램을 어디서 실행하느냐에 따라
// 기준위치가 달라질 수 있다.
// File f2 = new File("../test.txt");

// exist()
// 파일이나 폴더가 실제로 존재하는지 확인
if(f.exists()) {
    System.out.println("존재한다.");
}else {
    System.out.println("존재하지 않는다.");
}
// 출력: 존재한다. (파일이 있을 경우)

// isFile()
// 최종목적지가 파일인지 확인한다.
// System.out.println(f.isFile());

if(f.isFile()) {
    System.out.println("파일입니다.");
}else {
    System.out.println("파일이 아닙니다.");
}
// 출력: 파일입니다.

// isDirectorty()
// 최종 목적지가 폴더인지 확인
if(f.isDirectory()) {
    System.out.println("폴더입니다.");
}else {
    System.out.println("폴더가 아닙니다.");
}
// 출력: 폴더가 아닙니다.

// length()
// 파일 크기를 바이트 단위로 반환한다.
System.out.println("파일 크기: " + f.length());
// 출력: 파일 크기: (예: 1024)

// lastModified();
// 마지막 수정 시간을 밀리초(long)로 반환한다.
System.out.println(f.lastModified());
// 출력: (예: 1712345678900)

// createNewFile()
// 실제 빈 파일을 생성한다.
// 이미 있으면 false를 반환한다.
// 파일 이름이 겹치지 않으면 계속 만들어짐
File f2 = new File("하이.txt");
try {
    boolean result = f2.createNewFile();
    System.out.println(result ? "파일 생성 성공" : "이미 파일이 존재함");
} catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}

// mkdir()
// 폴더를 생성해준다.
File dir = new File("myFolder");
boolean result = dir.mkdir();
if(result) {
    System.out.println("폴더 생성");
}else {
    System.out.println("이미 존재하는 폴더");
}

// mkdirs()
// 필요한 상위 폴더까지 모두 생성
dir = new File("a/b/c");
result = dir.mkdirs();

if(result) {
    System.out.println("폴더들 생성");
}else {
    System.out.println("이미 존재하는 폴더");
}

// mkdirs()는 폴더 1개만 만드는것도 가능
// mkdir()은 폴더를 여러개 만드는것은 불가능

// delete()
// 파일 또는 빈 폴더를 삭제한다.
result = f2.delete();
if(result) {
    System.out.println("삭제 완료");
}else {
    System.out.println("없음");
}

// 폴더는 내부가 비어있어야 삭제 가능
// 안에 파일이 있는 폴더는 바로 삭제되지 않는다.

// list()
// 이름 목록을 문자열 배열로 반환한다.
// 목표 폴더의 바로밑에 있는 폴더와 파일만 반환
// dir = new File();
// String[] names = dir.list();
// if(names != null) {
//     System.out.println(Arrays.toString(names));
// }

// listFiles()
// File[] 배열로 반환
File[] files = dir.listFiles((d,name) -> name.endsWith(".txt"));

for(File file : files) {
    System.out.println(file.getName());
}
// 출력: 해당 폴더 안의 .txt 파일 이름들

// File로는 파일 안에 쓰여진 내용을 읽고 쓸 수는 없다는 점
// 파일 그 자체가 아니라 파일의 위치정보와 상태정보를 담당한다.


핵심 요약

getName() → 파일 이름
getPath() → 입력 경로
getAbsolutePath() → 절대 경로

exists() → 존재 여부
isFile() → 파일인지
isDirectory() → 폴더인지

length() → 파일 크기
lastModified() → 수정 시간

createNewFile() → 파일 생성
mkdir() → 폴더 1개 생성
mkdirs() → 여러 폴더 생성
delete() → 파일/빈 폴더 삭제

list() → 파일/폴더 이름 목록
listFiles() → File 객체 배열

File 클래스는 파일 내용이 아니라
파일의 위치와 상태를 다룬다
```

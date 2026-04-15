package ex3_bytestream.exam;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("아이디 입력: ");
        String inputId = sc.nextLine();

        System.out.print("비밀번호 입력: ");
        String inputPw = sc.nextLine();

        try {
            FileInputStream fis = new FileInputStream("member.txt");

            byte[] buffer = new byte[100];
            int length = fis.read(buffer);

            String data = new String(buffer, 0, length).trim();

            String[] arr = data.split("\n");

            String id = arr[0];
            String pw = arr[1];

            if(inputId.equals(id) && inputPw.equals(pw)) {
                System.out.println("로그인 성공");
            } else {
                if(!inputId.equals(id)) {
                    System.out.println("아이디 오류");
                } else {
                    System.out.println("비밀번호 오류");
                }
            }

            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
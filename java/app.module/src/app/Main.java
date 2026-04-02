package app;

import java.util.Scanner;
import member.Member;
import service.MemberService;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력: ");
        String name = sc.nextLine();

        System.out.print("나이 입력: ");
        int age = sc.nextInt();

        // Member 객체 생성
        Member m = new Member(name, age);

        // 서비스 객체 생성
        MemberService ms = new MemberService();

        // 회원 등록
        ms.register(m);
    }
}

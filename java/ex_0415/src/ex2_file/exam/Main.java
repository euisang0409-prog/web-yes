package ex2_file.exam;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		 // 1. 폴더가 없으면 생성
        File uploadDir = new File("uploads");

        // 2. 폴더 존재 여부 확인
        if(!uploadDir.exists()) {
            boolean created = uploadDir.mkdirs();

            if(created) {
                System.out.println("uploads 폴더 생성 성공");
            } else {
                System.out.println("uploads 폴더 생성 실패");
            }
        } else {
            System.out.println("이미 uploads 폴더 존재");
        }

        // 3. 내부 목록 조회
        String[] list = uploadDir.list();

        if(list != null) {
            for(String name : list) {
                System.out.println(name);
            }
        } else {
            System.out.println("폴더가 비어있거나 접근 불가");
        }
		
		
		
		
		
		
		
		
		
		
	}
}

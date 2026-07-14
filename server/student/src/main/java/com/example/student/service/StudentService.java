package com.example.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student.dto.StudentDTO;


@Service
public class StudentService {


    private ArrayList<StudentDTO> students = new ArrayList<>();


    public StudentService() {

        students.add(
            new StudentDTO(
                1,
                "김철수",
                "자바 개발 과정",
                "kim@test.com"
            )
        );


        students.add(
            new StudentDTO(
                2,
                "홍길동",
                "스프링부트 과정",
                "hong@test.com"
            )
        );

    }



    // 전체 조회
    public List<StudentDTO> getStudents(){

        return students;
    }



    // 등록
    public StudentDTO addStudent(StudentDTO studentDTO){


        int id = students.size() + 1;


        studentDTO.setId(id);


        students.add(studentDTO);


        return studentDTO;
    }


}
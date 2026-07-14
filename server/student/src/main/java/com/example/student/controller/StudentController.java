package com.example.student.controller;


import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.student.dto.ResponseDTO;
import com.example.student.dto.StudentDTO;
import com.example.student.service.StudentService;


@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {


    private final StudentService studentService;



    public StudentController(StudentService studentService){

        this.studentService = studentService;

    }



    // 조회
    @GetMapping
    public ResponseDTO<List<StudentDTO>> getStudents(){


        List<StudentDTO> students 
            = studentService.getStudents();


        return new ResponseDTO<>(
                true,
                "조회 성공",
                students
        );

    }



    // 등록
    @PostMapping
    public ResponseDTO<StudentDTO> addStudent(
            @RequestBody StudentDTO studentDTO
    ){

        StudentDTO student 
            = studentService.addStudent(studentDTO);



        return new ResponseDTO<>(
                true,
                "등록 성공",
                student
        );

    }


}
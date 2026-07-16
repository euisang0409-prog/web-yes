package com.korea.todo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.todo.service.BookService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArg
sConstructor
@RequestMapping("books")
public class BookController {

	private final BookService bookService;
	
	// 도서등록
	// 메서드명 : create
	@PostMapping
	public ResponseEntity<?>{
		
	}
		
	// 전체도서 조회 GET
	// 메서드명 : findAll
	
}

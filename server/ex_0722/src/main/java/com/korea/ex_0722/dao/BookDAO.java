package com.korea.ex_0722.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.ex_0722.vo.BookVO;

@Mapper
public class BookDAO {

	// 전체 조회
	List<BookVO> findAll();
	
	BookVO findById(Long id);
	
	int insert(BookVO book);
	
	int update(BookVO book);
	
	int delete(Long id);
	
	List<BookVO> findCategory(String name);
	
	List<BookVO> search(String title);
	
	List<BookVO> findByPrice(int min);
}

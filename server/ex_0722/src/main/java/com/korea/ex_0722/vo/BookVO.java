package com.korea.ex_0722.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookVO {
	private Long id;
	
	private String title;
	
	private String author;
	
	private String category;
	
	private int price;
	
	private int stick;
}

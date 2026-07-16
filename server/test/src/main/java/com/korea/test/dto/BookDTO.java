package com.korea.test.dto;

import com.korea.test.entity.BookEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDTO {

	private Long id;
	private String title;
	private String author;
	private int price;
	private String category;
	private int stock;


	public BookDTO(BookEntity entity) {

		this.id = entity.getId();
		this.title = entity.getTitle();
		this.author = entity.getAuthor();
		this.price = entity.getPrice();
		this.category = entity.getCategory();
		this.stock = entity.getStock();

	}
}
package com.korea.todo.repository;


//JapRepository<BookEntitiy, Long> 상속받으면 Repository로 취급한다.
public interface BookRepository extends JapRepository<BookEntitiy, Long>{

	private final BookRepository bookRepository;
	
}

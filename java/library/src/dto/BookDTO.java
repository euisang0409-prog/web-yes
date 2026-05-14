package dto;

public class BookDTO {

	private int bookid;
	private String title;
	private String author;
	private int stock;
	
	public BookDTO(int bookid, String title, String author,int stock) {
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.stock = stock;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	
	
	
	
	
	
	
	
}

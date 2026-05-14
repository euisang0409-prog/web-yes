package dto;

public class RentalDTO {
	private int rentalid;
	private int customerid;
	private int bookid;
	private String rentalDate;
	
	public RentalDTO(int rentalid, int customerid, int bookid, String rentalDate) {
		this.rentalid = rentalid;
		this.customerid = customerid;
		this.bookid = bookid;
		this.rentalDate = rentalDate;
	}

	public int getRentalid() {
		return rentalid;
	}

	public void setRentalid(int rentalid) {
		this.rentalid = rentalid;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(String rentalDate) {
		this.rentalDate = rentalDate;
	}
		
}

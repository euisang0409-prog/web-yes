package dto;

public class CustomerDTO {

	private int customerid;
	private String name;
	private String phone;
	
	public CustomerDTO(int customerid, String name, String phone) {
		this.customerid = customerid;
		this.name = name;
		this.phone = phone;		
	}

	
	public int getId() {
		return customerid;
	}

	public void setId(int customerid) {
		this.customerid = customerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

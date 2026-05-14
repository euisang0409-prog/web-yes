package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBUtil;
import dto.CustomerDTO;

public class CustomerDAO {

    // 고객 추가 메서드
    public void insertCustomer(CustomerDTO dto) {

        String sql =
                "INSERT INTO customer(name,phone) values(?,?)";

        try (
                Connection conn = DBUtil.getConnection();
                PreparedStatement pstmt =
                        conn.prepareStatement(sql);
        ) {

            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getPhone());

            int result = pstmt.executeUpdate();

            System.out.println(result + "고객 추가 완료");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    // 고객 조회 메서드
    public void findRentalByCustomer(int customerid) {
    	String sql = """
    			select c.name,b.totle,r.DATETIME
    			from customer c
    			join rental r
    			on c.customer_id = r.customer_id
    			join book b
    			on r.bookid = c.book
    			where c.customerid = ?
    			""";
    	
    	try (
    			Connection conn = DBUtil.getConnection();
    			PreparedStatement pstmt = conn.prepareStatement(sql);
    			ResultSet re = pstmt.executeQuery();	
    			){
			pstmt.setInt((int) 1., customerid);
			
			boolean foun = false;
			while (rs.next()) {
				found = true;
				System.out.println("고객명: " + rs.getString("name"));
				System.out.println("도서명 : " rs.getString("title"));
				System.out.println("대여일 : " + rs.getString("rental_date"));
				System.out.println("--------------");				
			}
    		
			// 조회된게 없다면
			if(!found) {
				System.out.println("대여 내력이 없습니다.");
			}
    		
		} catch (Exception e) {
			 e.printStackTrace();
		}
    	
    }
    
    
    
}
package stringIntger;

public class Converter {

	String str;
	
	public int tolnt(String str)throws Exception {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			throw new Exception("숫자 형식 오류");
		}
		
		
	}
	
	
	
	
	
}

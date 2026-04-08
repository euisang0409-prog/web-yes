package ex1_reflection.log;

public class DbLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("[DB] DB에 로그 저장: "+ message);
		
	}

}

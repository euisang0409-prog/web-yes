package ex1_lambda.exam;

@FunctionalInterface
public interface UserFilter {
	public boolean test(User user);
	
}

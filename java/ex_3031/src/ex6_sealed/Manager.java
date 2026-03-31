package ex6_sealed;

public non-sealed class Manager extends Person{

	@Override
	public void work() {
		System.out.println("생산관리를 합니다.");
	}
}

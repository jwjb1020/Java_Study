package Study3;

public class Archer extends Unit {
	public void arrow() {
		System.out.println("쏜다 화살");
	}
	@Override
	void run() {
		System.out.println("달린다 궁수");

	}
	
	@Override
	void walk() {
		System.out.println("걷는다 궁수");

	}
	


}

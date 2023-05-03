package Study3;

public class Worrior extends Unit {
	public void sword() {
		System.out.println("벤다 검");
	}

	@Override
	void run() {
		System.out.println("달린다 전사");

	}
	
	@Override
	void walk() {
		System.out.println("걷는다 전사");

	}


}

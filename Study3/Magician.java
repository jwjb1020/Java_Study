package Study3;

public class Magician extends Unit {
	public void magic() {
		System.out.println("쓴다 마법");
	}

	@Override
	void run() {
		System.out.println("달린다 법사");

	}
	
	@Override
	void walk() {
		System.out.println("걷는다 법사");

	}

}

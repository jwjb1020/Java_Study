package Study4;

public class Archer implements Unit {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("달린다 궁수");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("걷는다 궁수");
	}
	@Override
	public void attack() {
		System.out.println("공격한다 화살");
	}
	@Override
	public String toString() {
		return "궁수";
		
	}
}

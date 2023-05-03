package Study4;
//abstract 를 쓰고 싶으면 둘다 써야함
public abstract class Unit2 {
	abstract void run();
	abstract void walk();
	abstract void attack();

	public void talk() {
		System.out.println("말한다");
	}
}

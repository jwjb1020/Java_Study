package Study4;

import java.util.ArrayList;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Archer a = new Archer();
		Worrior w = new Worrior();
		Magician m = new Magician();
		
		ArrayList<Unit> unitArr = new ArrayList<Unit>();
		
		unitArr.add(a);
		unitArr.add(w);
		unitArr.add(m);
		
		for (int i = 0; i < 3; i++) {
			unitArr.get(i).run();
			unitArr.get(i).walk();
			unitArr.get(i).attack();
			System.out.println(unitArr.get(i).toString());
			
		}
		Object o;
	}

}

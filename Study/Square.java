package Study;

public class Square {
	public static void main(String[] args) {
		int value = 0;
		int sqare = 1;
		int sum = 0;
		while(value <= 1000) {
			value = (int) Math.pow(2, sqare);
			if(value>= 1000) {
				break;
			}
			System.out.println("value=" + value);
			sum +=value;
			sqare++;
		}
		System.out.println(sum);
	}

}

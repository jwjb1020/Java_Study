package Study;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
	//피보나치 수열
	int[] b = new int[a];
	b[0] = 0;
	b[1] = 1;
	b[2] = 1;
	
	for (int i = 3; i < b.length; i++) {
		b[i] = b[i-2] + b[i-1];
		
		
	}
	
	System.out.println(Arrays.toString(b));
	System.out.println(a);
	sc.close();
	}

}

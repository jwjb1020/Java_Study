package Study제네릭;

import java.util.Arrays;
import java.util.Random;

public class testM {
	static <T> void showMatrix(T[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
	}
	static <T> T getNumber(T n) {
		return n;
	}
//	static void showMatrix(int[][] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//
//				System.out.print(arr[i][j] + " ");
//
//			}
//			System.out.println();
//		}
//	}
//
//	static void showMatrix1(int[][] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//
//				System.out.print(arr[i][j] + " ");
//
//			}
//			System.out.println();
//		}
//	}
//
//	static void showMatrix2(int[][] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//
//				System.out.print(arr[i][j] + " ");
//
//			}
//			System.out.println();
//		}
//	}

	public static void main(String[] args) {
		Random rd = new Random(System.currentTimeMillis());

		Integer[][] arr = new Integer[2][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rd.nextInt(10);

			}

		}

		Double[][] arr1 = new Double[2][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr1[i][j] = rd.nextDouble(10);

			}

		}

		Long[][] arr2 = new Long[2][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr2[i][j] = rd.nextLong(10);

			}

		}
		
		 Integer a = Test13.<Integer>getNumber(intMatrix[0][0]);

		showMatrix(arr);

	}

}

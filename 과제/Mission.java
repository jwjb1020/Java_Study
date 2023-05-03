package 과제;

public class Mission {
	private static void matrix() {
		int a1 = 3;
		int b1 = 4;
		int a2 = 4;
		int b2 = 3;

		int[][] arr1 = new int[a1][b1];
		int num = 1;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = num++;
				System.out.print(arr1[i][j]);
				System.out.print("\t");

			}
			System.out.println("\n");

		}
		System.out.println("-".repeat(30));
		int[][] arr2 = new int[a2][b2];
		int num1 = 13;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = num1++;
				System.out.print(arr2[i][j]);
				System.out.print("\t");

			}
			System.out.println("\n");

		}
		System.out.println("-".repeat(30));
		int [][]arr3 = new int[a1][b2];
		for (int i = 0; i < b2; i++) {
			for (int j = 0; j < b2; j++) {
				int value = 0;
				for (int k = 0; k < b1; k++) {
					value += arr1[i][k] * arr2[k][j];
					
					
				}
				arr3[i][j]= value;
				System.out.print(arr3[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}
	public void matrix1() {
		int a1 = 3;
		int b1 = 4;
		int a2 = 4;
		int b2 = 3;

		int[][] arr1 = new int[a1][b1];
		int num = 1;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = num++;
				System.out.print(arr1[i][j]);
				System.out.print("\t");

			}
			System.out.println("\n");

		}
		System.out.println("-".repeat(30));
		int[][] arr2 = new int[a2][b2];
		int num1 = 13;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = num1++;
				System.out.print(arr2[i][j]);
				System.out.print("\t");

			}
			System.out.println("\n");

		}
		System.out.println("-".repeat(30));
		int [][]arr3 = new int[a1][b2];
		for (int i = 0; i < b2; i++) {
			for (int j = 0; j < b2; j++) {
				int value = 0;
				for (int k = 0; k < b1; k++) {
					value += arr1[i][k] * arr2[k][j];
					
					
				}
				arr3[i][j]= value;
				System.out.print(arr3[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}
}


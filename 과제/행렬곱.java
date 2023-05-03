package 과제;

public class 행렬곱 {
	public static void main(String[] args) {
		System.out.println("-".repeat(30));
		int[][] arr1 = new int[3][4];
		int num = 1;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = num++;

			}

		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j]);
				System.out.print("\t");

			}
			System.out.println("\n");

		}
		System.out.println("-".repeat(30));
		int[][] arr2 = new int[4][3];
		int num2 = 13;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = num2++;

			}

		}
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]);
				System.out.print("\t");

			}
			System.out.println("\n");

		}
		System.out.println("-".repeat(30));
		int[][] result = new int[arr1.length][arr2[0].length];
		for (int i = 0; i < arr1.length; i++) {
		    for (int j = 0; j < arr2[0].length; j++) {
		        for (int k = 0; k < arr2.length; k++) {
		            result[i][j] += arr1[i][k] * arr2[k][j];
		            System.out.print(result[i][j]);
					System.out.print("\t");
		        }
		        System.out.println("\n");
		    }
		}

//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr1[i].length; j++) {
//				for (int k = 0; k < arr2.length; k++) {
//					for (int l = 0; l < arr2[k].length; l++) {
//						if(j==k) {
//						int multi = arr1[i][j] * arr2[k][l];
//						
//						
//						System.out.println(multi);
//						}
//						
//					}
//					
//				}
//				
//			}
//			
//		}
	
	}
}

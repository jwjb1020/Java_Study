package Study;

public class Agooo {
	public static void main(String[] args) {
		int[] arr = new int[] { 11, 12, 13, 14, 15 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[arr.length - i - 1]);

		}
//		for (int i = arr.length -1; i >= 0 ; i--) {
//			System.out.println(arr[i]);
//			
//		}
		System.out.println(arr.toString());

		 for (int i = 0; i < arr.length; i++) {
		        System.out.println("arr[" + i + "] = " + arr[i]);
		    }
		    System.out.println("arr = " + arr);
		    System.out.println();
	}

}

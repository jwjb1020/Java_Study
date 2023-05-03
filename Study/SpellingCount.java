package Study;

import java.util.Scanner;

public class SpellingCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String spell = sc.nextLine();
		String arr1 = spell.toLowerCase().replaceAll("[^a-z]", "");
		char[] arr = arr1.toCharArray();
		char[] letter = { 'a', 'e', 'i', 'o', 'u' };
		int big = 0;
		int small = 0;
		// int space = 0;
		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] == ' ') {
//				space++;
//
//			}
			for (int j = 0; j < letter.length; j++) {
				if (arr[i] == letter[j]) {
					small++;

				}

			}

		}
		big = arr.length - small; // - space;
		System.out.print(spell);
		System.out.print(" 모음 :" + small);
		System.out.print(" 자음 :" + big);

	}

}

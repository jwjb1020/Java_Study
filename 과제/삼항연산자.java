package 과제;

import java.util.Scanner;

public class 삼항연산자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("-".repeat(30));
			System.out.println("음수값이나 100이상을 입력하면 프로그램을 종료합니다.");
			System.out.println("국어의 점수를 입력해주세요.");
			int Language = sc.nextInt();
			if (Language < 0 || 100 < Language) {
				System.out.println("잘못된 점수입니다.");
				break;
			}

			System.out.println("영어의 점수를 입력해주세요.");
			int English = sc.nextInt();
			if (English < 0 || 100 < English) {
				System.out.println("잘못된 점수입니다.");
				break;
			}

			System.out.println("수학의 점수를 입력해주세요.");
			int Math = sc.nextInt();
			if (Math < 0 || 100 < Math) {
				System.out.println("잘못된 점수입니다.");
				break;
			}

			int Sum = Language + English + Math;
			int Aver = Sum / 3;

			System.out.println("총계:" + Sum);
			System.out.println("평균:" + Aver);

			if (60 > Language || 60 > English || 60 > Math) {
				System.out.println("과락");

			}

			else if (70 <= Aver) {
				System.out.println("통과");
			} else {
				System.out.println("탈락");
			}
		}
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	

	}
}

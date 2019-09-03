package chapterOne;

import java.util.Scanner;

public class Second {
	public static void main(String args[]) {
		Second s = new Second();
		s.processStart();
	}

	public static void seekMinNumber(int[] targetNumbers) {
		int tempMinNumber = targetNumbers[0];
		for (int i = 0; i < targetNumbers.length; i++) {
			if (tempMinNumber > targetNumbers[i]) {
				tempMinNumber = targetNumbers[i];
			}
		}
		System.out.println(tempMinNumber);
	}

	void inputNumbers(int[] targetNumbers) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1番目の数字を入力してください");
		targetNumbers[0] = sc.nextInt();
		System.out.println("2番目の数字を入力してください");
		targetNumbers[1] = sc.nextInt();
		System.out.println("3番目の数字を入力してください");
		targetNumbers[2] = sc.nextInt();
		sc.close();
	}

	void processStart() {
		int[] targetNumbers = new int[3];
		inputNumbers(targetNumbers);
		seekMinNumber(targetNumbers);
	}
}

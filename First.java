package chapterOne;

public class First {
	public static void main(String[] args) {
		System.out.println(seekMaxNumber(5, 1, 8, 2));
	}

	static int seekMaxNumber(int a, int b, int c, int d) {
		int[] targetNumbers = new int[] { a, b, c, d };
		int tempMax = a;
		for (int i = 0; i < targetNumbers.length; i++) {
			if (tempMax < targetNumbers[i]) {
				tempMax = targetNumbers[i];
			}
		}
		return tempMax;
	}
}

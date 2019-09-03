package chapterOne;

public class Fifteen {

	public static void main(String[] args) {
		TriangleLeftBehind tlb = new TriangleLeftBehind();
		tlb.triangle();
	}

}

abstract class Triangle {
	public abstract void triangle();
}

class TriangleLeftBehind extends Triangle {

	@Override
	public void triangle() {
		int height = 5;
		int teihen = 5;
		for (int i = 0; i < height; i++) {
			for (int j = teihen - i -1; j < teihen; j++) {
				System.out.print("●");
			}
			System.out.print("\r");
		}
	}
}

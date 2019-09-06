package chapterOne;

public class Sixth {
	public static void main(String[] args) {
		AddedTillTarget addedTillTarget = new AddedTillTarget(20, 5);
		addedTillTarget.startProcessing();
	}
}

class AddedTillTarget {
	int fromThisNumber;
	int towardThisNumber;
	int additionResult;

	public AddedTillTarget(int fromThisNumber, int towardThisNumber) {
		this.fromThisNumber = fromThisNumber;
		this.towardThisNumber = towardThisNumber;
	}

	public void startProcessing() {
		this.judgeScaleOwnNumbers();
		this.sumBetweenAll();
		this.imformateAddtionResult();
	}

	public void judgeScaleOwnNumbers() {
		int temp = 0;
		if (this.fromThisNumber > this.towardThisNumber) {
			temp = this.fromThisNumber;
			this.fromThisNumber = this.towardThisNumber;
			this.towardThisNumber = temp;
		}
	}

	public void sumBetweenAll() {
		for (int i = fromThisNumber; i < this.towardThisNumber + 1; i++) {
			this.additionResult += i;
		}
	}

	public void imformateAddtionResult() {
		for (int i = fromThisNumber; i < this.towardThisNumber + 1; i++) {
			if (i < this.towardThisNumber) {
				System.out.print(i + "+");
			}
			if (i == this.towardThisNumber) {
				System.out.print(i);
			}
		}
		System.out.print("の和は" + this.additionResult + "です。");
	}
}

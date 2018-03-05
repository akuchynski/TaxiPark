package by.htp.taxipark.model;

public class Wheel {

	private int number;
	private int replacementCount;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getReplacementCount() {
		return replacementCount;
	}

	public void setReplacementCount(int replacementCount) {
		this.replacementCount = replacementCount;
	}
	
	public Wheel() {
	}

	public Wheel(int number, int replacementCount) {
		this.number = number;
		this.replacementCount = replacementCount;
	}
}

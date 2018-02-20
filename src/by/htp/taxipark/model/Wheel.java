package by.htp.taxipark.model;

public class Wheel {
	
	private int size;
	private int number;
	private int replacementCount;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

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


	public Wheel(int size, int number, int replacementCount) {

		setSize(size);
		setNumber(number);
		setReplacementCount(replacementCount);

	}

}

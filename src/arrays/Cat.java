package arrays;

public class Cat {
	
	public Cat (int numPaws, String strColor) {
		paws = numPaws;
		color = strColor;
	}
	

	private int paws;
	private String color;
	
	public int getPaws() {
		return paws;
	}
	public void setPaws(int paws) {
		this.paws = paws;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}

package practical;

public class Clicker {
public static void main(String[] args) {}
	private int value;
	public Clicker(int value) {
		this.value = value;
	}
	public void click() {
		value = value + 1;
	}
	public void undo() {
		value = value - 1;
	}
	public int getValue() {
		return value;
	}
}

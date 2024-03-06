package Method_chain;

public class Chain_test {
	private int number;

	public Chain_test(int number) {
		this.number = number;
	}
	
	public Chain_test setter(int number) {
		this.number = number;
		return this;
	}
	
	public int getter() {
		return this.number;
	}
	
	public Chain_test add (int number) {
		this.number += number;
		return this;
	}
	
	
}

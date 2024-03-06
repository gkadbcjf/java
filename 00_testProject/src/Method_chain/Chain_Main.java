package Method_chain;

public class Chain_Main {

	public static void main(String[] args) {
		Chain_test value = new Chain_test(5);
		System.out.println(value.getter());
		value.setter(10).add(20);
		System.out.println(value.getter());
		
	}

}

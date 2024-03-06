package Test10;

public class Sales extends Employee implements Bonus{

	public Sales() {
		
	}
	public Sales(String name, int number, String department,int salary) {
		super(name,number,department,salary);
	}
	
	@Override
	public double tax() {
		
		return getSalary()*(0.1);
	}

	@Override
	public void incentive(int pay) {
		super.setSalary((int)(getSalary()+pay*(0.8)));  
		
	}

}

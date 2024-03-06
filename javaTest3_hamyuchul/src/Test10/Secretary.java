package Test10;

public class Secretary extends Employee implements Bonus{
	
	public Secretary() {
		
	}
	public Secretary(String name, int number, String department,int salary) {
		super(name,number,department,salary);
	}
	
	@Override
	public double tax() {
		
		return getSalary()*0.13;
	}
	
	@Override
	public void incentive(int pay) {
		// TODO Auto-generated method stub
		setSalary((int)(getSalary()+pay*(1.2)));  
		
	}
	
}

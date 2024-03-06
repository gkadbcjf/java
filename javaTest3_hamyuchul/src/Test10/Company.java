package Test10;

import Test9.Airplane;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Employee[] employees = new Employee[2];
		employees[0] =new Secretary("Clinten",2,"sales",1200);
		employees[1] =new Sales("Hilery",1,"secretary",800);
		
		System.out.println("name      department    salary");
		System.out.println("---------------------------------");
		
		
		for(Employee ep : employees) {
			if(ep instanceof Sales) {
				System.out.println(ep.getName() +"    " +ep.getDepartment()+"     "+
			ep.getSalary());
			}
			else if(ep instanceof Secretary) {
				System.out.println(ep.getName() +"   "+ep.getDepartment()+"         "+
			ep.getSalary());
			}
		}
		
		System.out.println();
		
		System.out.println("인센티브 100 지금");
		Sales sl=(Sales) employees[1];
		sl.incentive(100);
		Secretary st = (Secretary)employees[0];
		st.incentive(100);
		
		
		System.out.println("name      department    salary    tax");
		System.out.println("----------------------------------------");
		
		for(Employee ep : employees) {
			if(ep instanceof Sales) {
				System.out.println(sl.getName() +"    " +sl.getDepartment()+"     "+
			sl.getSalary()+"       " +sl.tax());
			}
			else if(ep instanceof Secretary) {
				System.out.println(ep.getName() +"   "+ep.getDepartment()+"         "+
			ep.getSalary()+"      "+st.tax());
			}
		}
		
		
		
		System.out.printf("%-14s %s\n","안녕하세","요들송");
		System.out.printf("%-15s %s","반가","워싱시");
		
		
	
		
		
	}

}

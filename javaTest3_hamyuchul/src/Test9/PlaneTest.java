package Test9;

public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airplane ap =new Airplane("L747",1000);
		Cargoplane cp =new Cargoplane("C40",1000);
		System.out.println("Plane         fuelSize");
		System.out.println("----------------------");
		System.out.println("L747           "+ap.getFuelSize());
		System.out.println("C40            "+cp.getFuelSize());
		System.out.println("100운항");
		ap.flight(100);
		cp.flight(100);
		
		System.out.println("Plane         fuelSize");
		System.out.println("----------------------");
		System.out.println("L747            "+ap.getFuelSize());
		System.out.println("C40             "+cp.getFuelSize());
		System.out.println("200 주유");
		ap.refuel(200);
		cp.refuel(200);
		
		
		System.out.println("----------------------");
		System.out.println("L747            "+ap.getFuelSize());
		System.out.println("C40             "+cp.getFuelSize());
		
	}

}

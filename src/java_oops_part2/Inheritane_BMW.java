package java_oops_part2;

public class Inheritane_BMW extends Inheritance_Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inheritane_BMW bmw= new Inheritane_BMW();
		bmw.start();
		bmw.method1();
		bmw.method2();
	
		
	}
	public void theftSafety(){
		System.out.println("theftSafety_bmw ");
		
	}
}

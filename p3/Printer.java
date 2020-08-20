package p3;

public class Printer extends ElectronicDevice implements Wifi{
	private int power = 100;
	@Override
	public void doOn() {
		// TODO Auto-generated method stub
		System.out.println("Printer is On");
		
	}

	@Override
	public void doOff() {
		// TODO Auto-generated method stub
		System.out.println("PRESSED ALT+F4");
		System.out.println("Printer is Off");
	}

	@Override
	public void ConsumePower(CircuitBoard cb) {
		// TODO Auto-generated method stub
		power = power+cb.getPower();
		System.out.println("Power Consumed by the circuitboard is: "+ power);
	}
	public void Connection() {
		System.out.println("Printer is Connected to Laptop");
		System.out.println("Press Ctrl+P to print");
	

}

	@Override
	public void dataConnection(String password) {
		// TODO Auto-generated method stub
		System.out.println("Enter the password to connect");
		if(password == "Bravura_123") {
			System.out.println("....Wifi Connected....");
		}
		else {
			System.out.println("Printer is not connected to wifi......");
			System.out.println("Please Enter the correct password");
		}
	}
	
	public void P_model(String name) {
		System.out.println("The Printer name is : "+ name);
	}

	
}
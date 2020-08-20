package p3;

public class Laptop extends ElectronicDevice implements Bluetooth,Wifi {
	
	

	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("Bluetooth is connected");
		
	}

	@Override
	public void doOn() {
		// TODO Auto-generated method stub
		System.out.println("Machine is on ");
		timer(10);
		
	}

	@Override
	public void doOff() {
		// TODO Auto-generated method stub
		System.out.println("PRESSED ALT+F4");
		System.out.println("Closing all applications.....");
		timer(0);
		
	}

	@Override
	public void ConsumePower(CircuitBoard cb) {
		// TODO Auto-generated method stub
		int cbpower = cb.getPower();
		// --- add laptop related code
		cbpower+=10;
		
		System.out.println("Laptop circuit board consume "+cbpower);
	}

	@Override
	public void dataConnection(String password) {
		// TODO Auto-generated method stub
		System.out.println("Enter the password to connect");
		if(password == "Bravura_123") {
			System.out.println("....Wifi Connected....");
		}
		else {
			System.out.println("Please Enter the correct password");
			System.out.println("Wifi not is connected to Laptop!!!!");
	}
	
	}
	
	public void L_model(String name) {
		System.out.println("The Laptop name is : "+ name);
	}

}

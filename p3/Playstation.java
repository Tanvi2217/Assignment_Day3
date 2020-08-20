package p3;

public class Playstation extends ElectronicDevice implements Wifi{
	private int power = 100;
	@Override
	public void doOn() {
		// TODO Auto-generated method stub
		System.out.println("Playstation is On");
		
	}

	@Override
	public void doOff() {
		// TODO Auto-generated method stub
		System.out.println("PRESSED ALT+F4");
		System.out.println("Playstation is Off");
	}

	@Override
	public void ConsumePower(CircuitBoard cb) {
		// TODO Auto-generated method stub
		power = power*cb.getPower();
		System.out.println("Power Consumed by the circuitboard is: "+ power);
	}
	public void Connection() {
		System.out.println("Playstation is Connected to Device");
		System.out.println("Press Enter to start the game....");
		
}
	

	@Override
	public void dataConnection(String password) {
		// TODO Auto-generated method stub
		System.out.println("Enter the password to connect");
		if(password == "Bravura_123") {
			System.out.println("....Wifi Connected....");
			PlayGame();
		}
		else {
			System.out.println("Playstation is not connected to wifi......");
			System.out.println("Please Enter the correct password");
		}
		
	} 
	
	public void PS_model(String name) {
		System.out.println("The Playstation name is : "+ name);
	}
		
	
}

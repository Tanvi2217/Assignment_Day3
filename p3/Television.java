package p3;

public class Television extends ElectronicDevice implements Bluetooth,Wifi {

	@Override
	public void dataConnection(String password) {
		// TODO Auto-generated method stub
		System.out.println("Enter the password to connect");
		if(password == "Bravura_123") {
			System.out.println("....Wifi Connected....");
		}
		else {
			System.out.println("Please Enter the correct password");
		}
		
	} 

	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("Bluetooth is connected");
		
	}

	@Override
	public void doOn() {
		// TODO Auto-generated method stub
		System.out.println("TV is on ");
		timer(10);
		
	}

	@Override
	public void doOff() {
		// TODO Auto-generated method stub
		System.out.println("PRESSED OFF BUTTON ON REMOTE");
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
	
	public void OpenApp(String appname) {
		System.out.println(appname + "is opened now!!");
	}
	
	public void TV_model(String name) {
		System.out.println("The Television name is : "+ name);
	}
	

}


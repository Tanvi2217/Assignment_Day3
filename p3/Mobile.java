package p3;

public class Mobile extends ElectronicDevice implements Bluetooth,Wifi {
	private int p;
	

	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("...Bluetooth device is connected...");
	}

	@Override
	public void doOn() {
		// TODO Auto-generated method stub
		System.out.println("Mobile Screen Unlocked!");
		
	}

	@Override
	public void doOff() {
		// TODO Auto-generated method stub
		System.out.println("PRESSED LOCK BUTTON");
		System.out.println("Mobile Screen is now locked!");
	}

	@Override
	public void ConsumePower(CircuitBoard cb) {
		// TODO Auto-generated method stub
		p = cb.getPower();
		System.out.println("Mobile circuit board consumes : "+p);
		}
	
	
	public void name(String name) {
		System.out.println("Name Of Mobile is: "+ name);
	}
	
	
	public void Battery(int battery_amt) {
		if(battery_amt <= 20) {
			System.out.println("**BATTERY LOW**");
		}
		else {
			if (battery_amt == 100) {
				System.out.println("**BATTERY FULL**");
			}
		else {
			System.out.println("**BATTERY NOT LOW**");
		}
		}
			
	}
	
	public void OpenApp(String appname) {
		System.out.println(appname + "is opened now!!");
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
			System.out.println("...Wifi is not connected to mobile...");
		}
	}
	

}

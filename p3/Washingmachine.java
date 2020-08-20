package p3;

public class Washingmachine extends ElectronicDevice{

	@Override
	public void doOn() {
		System.out.println(" Hard point Button for Machine On");
		
	}

	@Override
	public void doOff() {
		System.out.println(" Hard point Button for Machine Off");
		
	}


	@Override
	public void ConsumePower(CircuitBoard cb) {
		// TODO Auto-generated method stub
		int cbpower = cb.getPower();
		// --- add washing Machine related code
		cbpower= cbpower+18489;
		
		System.out.println("Washing Machine circuit board consume "+cbpower);
	}
	
	public void W_model(String name) {
		System.out.println("The Washing Machine name is : "+ name);

	
}
}

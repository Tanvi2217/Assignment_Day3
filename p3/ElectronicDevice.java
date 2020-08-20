package p3;

abstract public class ElectronicDevice {
	private String nm;
	abstract public void doOn();
	abstract public void doOff();
	abstract public void ConsumePower(CircuitBoard cb);
	//private String version;
	public void timer(int Valuetimer) {
		if(Valuetimer == 0) {
			System.out.println("Machine off");
			this.doOff();
		}
		else{
			System.out.println("Machine working......");
		}
	
	}
	
	public void PlayGame() {
		System.out.println("Game is Begun");
	}
	
	public void set_name(String name) {
		nm = name;
	}
	public void Update(String version) {
		
		if (version == "new") {
			System.out.println(nm + " Device Does not need upadate");
		}
		else {
			System.out.println(nm + " Device Does need an upadate");
			System.out.println("Please restart the device to update........");
		}
		
	}
}

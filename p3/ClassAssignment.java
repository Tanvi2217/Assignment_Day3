package p3;

import java.util.Scanner;

public class ClassAssignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// scanf() / cin>>
		ClassAssignment operations = new ClassAssignment();
		while(true)
		{
			System.out.println("\n1. For Laptop");
			System.out.println("\n2. For Washing Machine");
			System.out.println("\n3. For Mobile");
			System.out.println("\n4. For Printer");
			System.out.println("\n5. For PlayStation");
			System.out.println("\n6. For Television");
			System.out.println("0 For Exit\n");
			
			int userChoice = sc.nextInt();
			
			switch(userChoice)
			{	
				case 0: System.exit(0);
				break;
				case 1: Laptop hpLaptop = new Laptop();
				hpLaptop.set_name("Laptop");
				System.out.println("****THIS IS A LAPTOP****");
				hpLaptop.L_model("Dell");
				operations.useMachine(hpLaptop);
				hpLaptop.connection();
				break;
				
				case 2: Washingmachine whirlpool = new Washingmachine();
				whirlpool.set_name("Washing Machine");
				System.out.println("****THIS IS A WAHING MACHINE****");
				whirlpool.W_model("Whirlpool");
				operations.useMachine(whirlpool);
				break;
				
				case 3: Mobile mobile = new Mobile();
				mobile.set_name("Mobile");
				System.out.println("****THIS IS A MOBILE****");
				mobile.name("OnePlus8");
				operations.useMachine(mobile);
				break;
				
				case 4: Printer printer = new Printer();
				printer.set_name("Printer");
				System.out.println("****THIS IS A PRINTER****");
				printer.P_model("HP printer");
				operations.useMachine(printer);
				break;
				
				case 5: Playstation ps = new Playstation();
				ps.set_name("PlayStation");
				System.out.println("****THIS IS A PLAYSTATION****");
				ps.PS_model("PS-4");
				operations.useMachine(ps);
				break;
				
				case 6: Television tv = new Television();
				tv.set_name("Television");
				System.out.println("****THIS IS A TELEVISION****");
				tv.TV_model("Samsung");
				operations.useMachine(tv);
				
			}
		}//end while
		
	}//end main
	                     ///  ElectronoicDevice device = new Laptop();
	public void useMachine(ElectronicDevice device)
	{	
		CircuitBoard cb = new CircuitBoard();
		if (device instanceof Laptop) {
			System.out.println("---------------------");
			device.doOn();
			System.out.println("---------------------");
			device.ConsumePower(cb);
			System.out.println("---------------------");
			Laptop laptop = (Laptop)device;
			laptop.connection();
			System.out.println("---------------------");
			laptop.dataConnection("Bravura_123");
			System.out.println("---------------------");
			device.Update("new");
			System.out.println("---------------------");
			device.doOff();
			
		}
		else if(device instanceof Washingmachine) {
			System.out.println("---------------------");
			device.doOn();
			System.out.println("---------------------");
			device.ConsumePower(cb);
			System.out.println("---------------------");
			device.Update("old");
			System.out.println("---------------------");
			device.doOff();
			
		}
		else if(device instanceof Mobile){
			System.out.println("---------------------");
			device.doOn();
			System.out.println("---------------------");
			device.timer(10);
			System.out.println("---------------------");
			Mobile mob = (Mobile)device;
			mob.dataConnection("Bravura_123");
			System.out.println("---------------------");
			mob.connection();
			System.out.println("---------------------");
			mob.OpenApp("Instagram");
			System.out.println("---------------------");
			device.Update("old");
			System.out.println("---------------------");
			mob.Battery(0);
			System.out.println("---------------------");
			mob.ConsumePower(cb);
			System.out.println("---------------------");
			device.doOff();
			
		}
		
		else if(device instanceof Printer) {
			System.out.println("---------------------");
			device.doOn();
			System.out.println("---------------------");
			device.timer(10);
			System.out.println("---------------------");
			Printer print = (Printer)device;
			print.dataConnection("Bravura_123");
			System.out.println("---------------------");
			print.Connection();
			System.out.println("---------------------");
			device.Update("new");
			System.out.println("---------------------");
			device.ConsumePower(cb);
			System.out.println("---------------------");
			device.doOff();
		}
		
		else if(device instanceof Playstation) {
			System.out.println("---------------------");
			device.doOn();
			System.out.println("---------------------");
			Playstation ps1 = (Playstation)device;
			ps1.Connection();
			System.out.println("---------------------");
			ps1.dataConnection("Bravura_123");
			System.out.println("---------------------");
			device.Update("new");
			System.out.println("---------------------");
			device.ConsumePower(cb);
			System.out.println("---------------------");
			device.doOff();
			System.out.println("---------------------");
			device.timer(0);
			
		}
		
		else if(device instanceof Television) {
			System.out.println("---------------------");
			device.doOn();
			System.out.println("---------------------");
			Television tv1 = (Television)device;
			tv1.dataConnection("Bravura");
			System.out.println("---------------------");
			device.timer(10);
			System.out.println("---------------------");
			tv1.connection();
			System.out.println("---------------------");
			tv1.OpenApp("YouTube");
			System.out.println("---------------------");
			device.Update("new");
			System.out.println("---------------------");
			device.ConsumePower(cb);
			System.out.println("---------------------");
			device.doOff();
		}
	
	}	
}

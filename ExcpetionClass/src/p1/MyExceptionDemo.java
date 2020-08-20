package p1;
import java.util.Scanner;

public class MyExceptionDemo{
	
	

	public void ticket(int ticket) throws OutOfTicketException {
		if(ticket >= 6) {
			throw new OutOfTicketException();
		}
		
		else {
			System.out.println("You have "+ ticket + " tickets");
		}
	}
	
	public static void main(String args[]) throws OutOfTicketException {
		System.out.println("Enter the amount of tickets you have:");
		
		MyExceptionDemo obj = new MyExceptionDemo();
		Scanner sc = new Scanner(System.in);
		int tickets = sc.nextInt();
		
		obj.ticket(tickets);
		
	}
	
}

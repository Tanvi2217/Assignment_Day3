package p1;

public class OutOfTicketException extends Exception {
	
	OutOfTicketException(){
		System.out.println("Out Of Ticket Exception Raised");
		System.out.println("You have more than 6 tickets ");
	}
	
}

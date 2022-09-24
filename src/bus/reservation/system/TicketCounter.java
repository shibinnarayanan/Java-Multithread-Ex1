package bus.reservation.system;

public class TicketCounter {
	
	public int availableSeat =  5;
	
	public synchronized void bookTicket(String name,int noOfSeats)
	{
		if(availableSeat>=noOfSeats && noOfSeats != 0)
		{
			System.out.println("Congrats "+name+" "+noOfSeats+"seats booked successfully");
			availableSeat = availableSeat-noOfSeats;
		}
		else
		{
			System.out.println("Hi "+name+" Seats not available");
		}
	}
	

}

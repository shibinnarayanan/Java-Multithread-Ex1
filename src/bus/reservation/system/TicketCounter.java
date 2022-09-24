package bus.reservation.system;

public class TicketCounter {
	
	public int availableSeat =  5;
	
	public synchronized void bookTicket(String name,int noOfSeats) throws InterruptedException
	{
		
		System.out.println("executing thread --- "+Thread.currentThread().getName());
		if(availableSeat>=noOfSeats && noOfSeats != 0)
		{
			System.out.println(" -> Congrats "+name+" "+noOfSeats+"seats booked successfully");
			availableSeat = availableSeat-noOfSeats;
			Thread.sleep(5000);
		}
		else
		{
			System.out.println(" -> Hi "+name+" Seats not available");
			Thread.sleep(3000);
		}
	}
	

}

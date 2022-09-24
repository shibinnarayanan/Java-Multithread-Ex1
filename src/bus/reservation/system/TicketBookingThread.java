package bus.reservation.system;

public class TicketBookingThread extends Thread{
	
	private TicketCounter ticketCntr;
	private String name;
	private int noOfTicket;
	
	public TicketBookingThread(TicketCounter ticketCntr, String name, int noOfTicket) {
		super();
		this.ticketCntr = ticketCntr;
		this.name = name;
		this.noOfTicket = noOfTicket;
	}
	
	@Override
	public void run() {
		ticketCntr.bookTicket(name, noOfTicket);
	}

}

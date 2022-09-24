package bus.reservation.client;

import bus.reservation.system.TicketBookingThread;
import bus.reservation.system.TicketCounter;

public class TicketBookingClient {
	
	public static void main(String[] args) {
		
		TicketCounter tc = new TicketCounter();
		
		TicketBookingThread t1 = new TicketBookingThread(tc, "Swetha",2);
		
		TicketBookingThread t2 = new TicketBookingThread(tc, "Shibin",2);
		
		TicketBookingThread t3 = new TicketBookingThread(tc, "Sayu",8);
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}

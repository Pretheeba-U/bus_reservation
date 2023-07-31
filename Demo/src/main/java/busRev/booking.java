package busRev;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class booking {

        String passengername;
        int busno;
        String date;
        
        
        booking()
        {
        	Scanner sc = new Scanner(System.in);
        	
        	System.out.println("Enter the Name of the Passenger:");
        	passengername = sc.next();
        	
        	System.out.println("Enter the BusNo:");
        	busno = sc.nextInt();
        	
        	System.out.println("Enter date:");
        	 date= sc.next();
        
        }
        public boolean isAvailable(ArrayList<booking>Booking,ArrayList<bus>buses)
        {
        	int capacity = 0;
        	for(bus b:buses)
        	{
        		if(b.getBusno()==busno)
        		     capacity = b.getCapacity();
        		
        	}
        	int booked = 0;
        	for(booking B:Booking) {
        		if(B.busno == busno && B.date.equals(date))
        			booked++;
        	}
			return booked<capacity?true:false;
        }
	

}

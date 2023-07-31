package busRev;

import java.util.ArrayList;
import java.util.Scanner;

public class busdemo {

	public static void main(String[] args) {
		ArrayList<bus> buses = new ArrayList<>();
		ArrayList<booking> bookings = new ArrayList<>();

		
		buses.add(new bus(1,true,2));
		buses.add(new bus(2,false,50));
		buses.add(new bus(3,true,48));

		
        int useropt = 1;
        Scanner sc = new Scanner(System.in);
        
        for(bus b:buses)
        {
        	b.displayBusInfo();
        }
        
        
		while(useropt == 1)
		{
		System.out.println("Enter 1 to Book and 2 to Exit");
		useropt = sc.nextInt();
		
		if(useropt == 1)
		{
            booking Booking = new booking();
            if(Booking.isAvailable(bookings,buses))
            {
            	bookings.add(Booking);
            	System.out.println("your booking is confrimed....");
            }
            else
            {
            	System.out.println("sorry,bus is full");
            }
		
		
		}
		}
	}

}

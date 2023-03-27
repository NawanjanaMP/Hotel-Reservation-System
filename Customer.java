package hotelmanagement;

import java.util.Scanner;

public class Customer {
	//Declaration of variables
	int no;
	String name;
	String bookingno;
	double indate;
	int outdate;
	int nod,type,ld,d;
	int q;
	boolean status;
	
	Customer()
	{
		no=-1;
		name=null;
		bookingno=null;
		nod=type=ld=q=d=-1;
		status=false;
	}
	
	public void setInitialDetails(int c)
	{
		//Booking details of the customer
		no=c;
		while(true){
		Scanner in = new Scanner(System.in);
		if(LoginPortal.rc==2) {
		System.out.println("Enter Name");}
		
		name = in.nextLine();
		System.out.println("Enter Check-in date (mm.dd)");
		indate = in.nextDouble();
		System.out.println("Enter room type?1 for Luxury,2 for Deluxe,3 for superdeluxe");
	    type = in.nextInt();
	    System.out.println("Enter occupancy(max 3 per room)?");
	    q = in.nextInt();
	    System.out.println("Enter Number Of Rooms?");
	    ld= in.nextInt();
	    if(3<q/ld) {
	    	 System.out.println("Error....");
	    	 break;
	    }
	    System.out.println("Enter Number of Days?");
	    d = in.nextInt();
	    break;
		}
	}
	
	public void setBookingNo(String b)
	{
		bookingno=b;
	}
	
	
}

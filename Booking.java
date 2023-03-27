package hotelmanagement;
import java.io.Serializable;
import java.util.Scanner;

public class Booking implements Serializable{
	String bookno;
	
	int ff;
	Customer cust;
	int s1=0,s2=0;
	LoginPortal lpl;
	
	public String getBookingNumber()
	{
		return bookno;
	}
	
	public void BookNew(Customer c,Luxury ly,Deluxe dx,SuperDeluxe sdx,int ily,int flag1,int idx,int flag2,int isdx,int flag3)
	
	{
		cust=c;
	    Fare f=new Fare();
	    int no,i;
	    
    
    	//checking of availablity of rooms
	    if(c.type==1)
	    {
	    			if(flag1==0)
	    			{
	    				System.out.println("No Luxury Rooms Available");
	    				Scanner in5=new Scanner(System.in);
	    				
	    			}
	    			if(flag1==1)
	    				BookLuxury(c,ly,c.type,ily,c.ld,c.d);
	    }
	    if(c.type==2)
	    {
	    			if(flag2==0)
	    			{
	    				System.out.println("No Deluxe Room Available");
	    				Scanner in6=new Scanner(System.in);
	    				
	    			}

	    			
	    			if(flag2==1)
	    				BookDeluxe(c,dx,c.type,idx,c.ld,c.d);
	    }
	    
	    
	    if(c.type==3)
	    {
	    			if(flag3==0)
	    			{
	    			System.out.println("No SuperDeluxe Room Available");
	    			Scanner in5=new Scanner(System.in);
    		
	    			}

	    			if(flag3==1)
	    				BookSuperDeluxe(c,sdx,c.type,isdx,c.ld,c.d);
	    }
	    
	    
	}
	
	
	//No of rooms booked in the luxury category
	public void BookLuxury(Customer c,Luxury ly,int type,int ily,int ld,int d)
	{
		Fare f=new Fare();
		ly.statuschange();
		if(ld==1)
		{
			System.out.println("One Luxury Room is booked");
			ff= f.farecalculator(d,ly.rate,ld);
			bookno=ily+"lx1";
			BookDisplay(ff,c.name,bookno);
			
		}
		if(ld==2)
		{
			System.out.println("Two Luxury Rooms are booked");
			ff= f.farecalculator(d,ly.rate,ld);
			bookno=ily+"lx2";
			BookDisplay(ff,c.name,bookno);
		}
		if(ld==3)
		{
			System.out.println("Three Luxury Rooms are booked");
			ff= f.farecalculator(d,ly.rate,ld);
			bookno=ily+"lx1";
			BookDisplay(ff,c.name,bookno);
			
		}

		
	}
	//No of rooms booked in the Deluxe category
	public void BookDeluxe(Customer c,Deluxe dx,int type,int idx,int ld,int d)
	{
		dx.statuschange();
		Fare f=new Fare();
		if(ld==1)
		{
			System.out.println("One Deluxe Room is booked");
			ff= f.farecalculator(d,dx.rate,ld);
			bookno=idx+"dx1";
			BookDisplay(ff,c.name,bookno);
		}
		if(ld==2)
		{
			System.out.println("Two Deluxe Rooms are booked");
			ff= f.farecalculator(d,dx.rate,ld);
			bookno=idx+"dx2";
		BookDisplay(ff,c.name,bookno);
		}
		if(ld==3)
		{
			System.out.println("Three Deluxe Rooms are booked");
			ff= f.farecalculator(d,dx.rate,ld);
			bookno=idx+"dx2";
		BookDisplay(ff,c.name,bookno);
		}
		if(ld==4)
		{
			System.out.println("Four Deluxe Rooms booked");
			ff= f.farecalculator(d,dx.rate,ld);
			bookno=idx+"dx2";
		BookDisplay(ff,c.name,bookno);
		}
		
	}
	//No of rooms booked in the Super Deluxe category
	public void BookSuperDeluxe(Customer c,SuperDeluxe sdx,int type,int isdx,int ld,int d)
	{
		Fare f=new Fare();
		
		sdx.statuschange();
		if(ld==1)
		{
			System.out.println("One Super Deluxe Room is booked");
			ff= f.farecalculator(d,sdx.rate,ld);
			bookno=isdx+"sdx1";
			BookDisplay(ff,c.name,bookno);
			
		}
		if(ld==2)
		{
			System.out.println("Two Super Deluxe Room is booked");
			ff= f.farecalculator(d,sdx.rate,ld);
			bookno=isdx+"sdx2";
			BookDisplay(ff,c.name,bookno);
			
		}
			
				
		
			}
	//Display booked room details
	public void BookDisplay(int ff,String name,String b)
	{
		System.out.println("Booking number "+bookno);
		
		System.out.println("Customer number "+cust.no);
		
		System.out.println("Booking Name "+name);
		
		System.out.println("Booking Date "+cust.indate);
	
		System.out.println("Fare is "+ ff);
		
		
	}
	
	
	public int getFare()
	{
		return ff;
	}
	
	public String getName()
	{
		return cust.name;
	}
}
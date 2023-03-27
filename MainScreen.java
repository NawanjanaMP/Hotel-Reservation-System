package hotelmanagement;
import java.io.Serializable;
import java.util.Scanner;

public class MainScreen implements Serializable{
	
	
	
	public static void main(String args[])
	{
		int nod,type,bookingno,ld,d,rc,q;
	    char ch='y';
	    double ff;
	    String name;
		String uname;
	   
	    //Declaration of arrays
	    Luxury[] ly = new Luxury[3];
	    Deluxe[] dx = new Deluxe[4];
	    SuperDeluxe[] sdx= new SuperDeluxe[5];
	    Customer c[] = new Customer[20];
	    Booking b[]=new Booking[20];
	    LoginPortal lp[]=new LoginPortal[10];
	    
		
	    int i=0;
	    
	    for(i=0;i<3;i++)
	    {
	    	
	    	ly[i]=new Luxury();
			ly[i].set(5000,false);
			
	    }
	    for(i=0;i<4;i++)
	    { 
	    	dx[i]=new Deluxe();
			dx[i].set(10000,false);
			
	    }
	    for(i=0;i<5;i++)
	    { 
	    	sdx[i]=new SuperDeluxe();
			sdx[i].set(15000,false);
			
	    }
	    
	    for(i=0;i<20;i++)
	    {
	    	c[i]=new Customer();
	    	
	    }
	    
	    for(i=0;i<20;i++)
	    {
	    	b[i]=new Booking();
	    }
	    
	    
	    //Display main menu
	    String no;
	    int ic=0,ily=0,ilr=0,itr1=0,itr2=0,isdx=0,idx=0,ilp=0;
	    
	    int flag1=0,flag2=0,flag3=0;

	    while(true)
	    {
	    	
	    int is=0,js=0,ks=0;
	    int id=0,jd=0,kd=0;
	    System.out.println("What do you want to do?");
	    System.out.println("Book a room(b)");
	    System.out.println("Facilities(s)");
	    System.out.println("Cancel a booked room(c)");
	    System.out.println("Exit Menu(e)");
	    
	    Scanner in = new Scanner(System.in);
		ch = in.next(".").charAt(0);
		 //book a room 
	    if(ch=='b')
	    {

		    for(i=0;i<3;i++)
		    {
		    	if(ly[i].getStatus()==false)
		    	{
		    		ily=i;
		    		flag1=1;
		    		break;
		    	}
		    	else
		    	flag1=0;
		    }
		    
		    for(i=0;i<4;i++)
		    {
		    	if(dx[i].getStatus()==false)
		    	{
		    		idx=i;
		    		flag2=1;
		    		break;
		    	}
		    	else
		    	flag2=0;
		    }
		    
		    for(i=0;i<5;i++)
		    {
		    	if(sdx[i].getStatus()==false)
		    	{
		    		isdx=i;
		    		flag3=1;
		    		break;
		    	}
		    	else
		    	flag3=0;
		    }
		   
		   LoginPortal   cl= new LoginPortal(); 
		    cl.register(); 
		    
	    	c[ic].setInitialDetails(ic);
	    	b[ic].BookNew(c[ic],ly[ily],dx[idx],sdx[isdx],ily,flag1,idx,flag2,isdx,flag3);
	    	c[ic].setBookingNo(b[ic].getBookingNumber());
	     
	      
	    	ic++;


	    }
	    //cancel a booked room
	    if(ch=='c')
        {
            ic--;
            Scanner in2 = new Scanner(System.in);
            System.out.println("Enter your booking no");
            no = in2.nextLine();
           
            int no1=(int)no.charAt(0)-48;
            int no2;
         
            System.out.println("Enter type(1-lux,2-delux,3-super)");
            no2= in2.nextInt();
           
            if(no2==1)
            {
                ly[no1].statuschange();
               
            }
            if(no2==2)
            {
                dx[no1].statuschange();   
           
            }
            if(no2==3)
            {
                sdx[no1].statuschange();
            }  
           
            System.out.println("Cancelled");
           
       
        }
	    
	   //to exit
	    if(ch=='e')
		    break;
	    //Display Facilities.....
		if(ch=='s') 
		    {
		    	System.out.println("Facilities.....");
				System.out.println("Free Wi-Fi is available throughout the property to keep you connected, while we also provide dedicated internet, e-mail, and I.D.D. facilities should you require them on the premises. \r\n"
						+ "Beyond, we can arrange for a hired car to take you on your Sri Lankan adventures, while we offer to look after your belongings with our left luggage facility.\r\n"
						+"•	24-Hour Room Service \n"
						+ "•	Wine Cellar\r\n" 
						+ "•	Doctor On Call\r\n" 
						+ "•	Car Hires and Parking Facilities\r\n" 
						+ "•	Laundry/Dry Cleaning\r\n" 
						+ "•	Daily Housekeeping\r\n" 
						+ "•	Custom-made toiletries created by Link Natural\r\n" 
						+ "•	Postal Facilities\r\n" 
						+ "•	Left Luggage Facility\r\n" 
						+ "•	Daily Newspaper (On Request)\r\n"
						+ "•	Bellari Jewellery Shop\r\n" 
						+ "•	Spa Ceylon Boutique\r\n" 
						+ "•	Conference Facilities\r\n" 
						+ "•	Two Swimming Pools\r\n" 
						+ "•	Gym\r\n" 
						+ "•	Spa\r\n" 
						+ "•	Tennis \r\n"
						+ "•	Foreign Exchange Encashment\r\n" );
		    }
	}
	}
	

	   }


package hotelmanagement;
import java.util.Scanner;
public class LoginPortal {
	static int rc;

String custom[]=new String[30];
int v=0;
int z=0;
String fname, uname, cnum,tt,userName,password;
	public void register() {
		//Display booking menu
		Scanner rcb = new Scanner(System.in);
		System.out.println("Book As a Registered Customer(1) or Book As A Guest(2) or Register As A Customer(3)");
		rc = rcb.nextInt();
		//Book as a registered customer
		if(rc==1)
		{Scanner rcb1 = new Scanner(System.in);
		int p = 0;
			System.out.println("Welcome....");
			System.out.println("Enter Your Username");
			String un = rcb1.nextLine(); 	
			 boolean isExists = false;
		  
		      for (int i = 0; i < custom.length; i++) {
		    
			 String arrayValue = custom[i];
			
			 if (un.equals(arrayValue)) {
			    isExists = true;
			    i=p;
			   
			    break;
			 }
		      }
		      if (isExists) {
		         System.out.println("Hello "+custom[p+1]);
		         System.out.println("Press ENTER to continue");
		      } else {
		    	  System.out.println("Error");
		    	  register();
		      }
	
			}
		//Book as a guest
		if(rc==2)
		{
			System.out.println("Welcome");
		}
		//Register as a customer
		if(rc==3)
		{	Scanner rcb2 = new Scanner(System.in);
			
		System.out.println("Name...");
			 fname = rcb2.nextLine();
			System.out.println("Username...");
			uname = rcb2.nextLine();
			System.out.println("Email address...");
			cnum = rcb2.nextLine();
		    	
				custom[z] = fname;
		    	custom[z+1] = uname;
		    	custom[z+2] = cnum;
		   z=z+4;

		    	
		    System.out.println("Succesfully Registered ");
		  
		    register();
		}
}
		
	}

	

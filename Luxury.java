package hotelmanagement;

public class Luxury extends Room{
	
	//get and set data

    
	public void set(int r,boolean s)
	{
		rate=r;
		status=s;
	}
	
	public int getRate()
	{
		return rate;
	}
	
	public boolean getStatus()
	{
		return status;
	}

	public void statuschange() {
		
		if(status==true)
			status= false;
		else
			status=true;
		
	}

	
	
}

package hotelmanagement;

public class SuperDeluxe extends Room{
//get and set data
	public void set(int r,boolean s)
	{
		rate=r;
		status=s;
	}

	public boolean getStatus()
	{
		return status;
	}

	public int getRate()
	{
		return rate;
	}

	public void statuschange() {
	
		if(status==true)
			status= false;
		else
			status=true;
		
	}
}

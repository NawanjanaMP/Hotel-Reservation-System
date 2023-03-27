package hotelmanagement;

public class Fare {
//Fare calculator
	public int farecalculator(int days,int rate,int s)
	{
			if(s==1)
			{
				return days*rate;
			}
			
			if(s==2)
			{
				return days*rate*2;
			}
			if(s==3)
			{
				return days*rate*3;
			}
			if(s==4)
			{
				return days*rate*4;
			}
			if(s==5)
			{
				return days*rate*5;
			}
	
	return 0;
}
}

public class Advance extends Ticket
{
	private int daysLeft;

	public Advance () 
	{
		super();
		daysLeft = 0;
	}
	
	public Advance (int days)
	{
		super();
		daysLeft = days;
	}
	
	public double getPrice()
	{
		if (daysLeft > 10)
		{
			return 30.00;
		}
		else
		{
			return 40.00;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
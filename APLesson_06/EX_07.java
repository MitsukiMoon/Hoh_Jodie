import java.util.Scanner;
public class EX_07
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);


		System.out.println ("Please enter String: ");
		
		String user = keyboard.next();
		


		for (int i = user.length(); 0 <= user.length(); i--)
		{
			
			System.out.println(user.substring(i,user.length()));
			
		}
	}
	

	
	
}
	
	
	
	

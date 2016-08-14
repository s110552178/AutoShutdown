import java.awt.List;
import java.util.Scanner;

public class AutoShutdown {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		List Message = new List();
		Message.add("Insert Hours: ");
		Message.add("Insert Minutes: ");
		
		List tempDateTime = new List();
		
		
		for(int i = 0; i <=1; i++)
		{
			try
			{
				System.out.println(Message.getItem(i));
				tempDateTime.add(String.valueOf(scan.nextInt()));
				System.in.read();
			}
			catch(Exception ex)
			{
				
				
			}
		}
		
		
		for(int j = 0; j < tempDateTime.getItemCount(); j++)
		{
			System.out.println(tempDateTime.getItem(j));
			 
		}
		scan.close();
	}

}

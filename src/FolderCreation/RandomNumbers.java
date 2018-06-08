package FolderCreation;
import java.util.Random;

public class RandomNumbers
{
	public static void main(String[] args)
	{				
		RandNumInRange(65,99);
	}
	private static void RandNumInRange(int min, int max) 
	{	
		for (int i = 0; i < 10; i++)
		{
		
		Random rand = new Random();
		int random= rand.nextInt((max - min) + 1) + min;
		System.out.println(random);
		}
}
						
}	

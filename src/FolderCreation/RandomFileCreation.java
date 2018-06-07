package FolderCreation;

import java.io.File;
import java.io.IOException;

public class RandomFileCreation 
{	
	public static void main(String[] args) throws IOException
	{
		int increase=1 ;
		
		File newfile= new File("D:\\Random\\" + "Android1" + ".txt");
		newfile.createNewFile();
		while(increase<25)
		{
			increase++;
			newfile = new File("D:\\Random\\" + "Android" + increase + ".txt");
			newfile.createNewFile();
		}
	}
	
}

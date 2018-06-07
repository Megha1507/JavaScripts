/*Program To Create Text Files in a Folder with Random Names*/
package FolderCreation;

import java.io.File;
import java.io.IOException;
import java.util.Random;


public class RandonTextFileCreation 
{
	public static void main(String[] args) throws IOException
	{ 
		File newfile;
		
		Random rand = new Random();

		int  increase = rand.nextInt(90) + 65;
		
		while(increase<=90)
		{
		    String strAsciiTab = Character.toString((char) increase);
		    increase++;
			newfile = new File("D:\\Random1\\"+ strAsciiTab + ".txt");
			newfile.createNewFile();
		}
	}
	
}

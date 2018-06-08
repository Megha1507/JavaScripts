package FolderCreation;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import org.apache.commons.io.FileUtils;


public class MoveFileToFolder 
{	
	public static void main(String[] args) throws IOException
		{
			for (int i = 0; i < 10; i++)
			{
				int max=90;
				int min=65;
				Random rand = new Random();
				int random= rand.nextInt((max - min) + 1) + min;
				System.out.println(random);
			
				File newfile = new File("D:\\Random\\"+ random + ".txt");
				newfile.createNewFile();
		
				File newFolder= new File("D:\\Random\\" + random + "\\");
				newFolder.mkdir();	
						
				FileUtils.copyFileToDirectory(newfile, newFolder);
						
			}
		}	
		
}

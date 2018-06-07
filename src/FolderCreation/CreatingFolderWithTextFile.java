package FolderCreation;

import java.io.File;
import java.io.IOException;

public class CreatingFolderWithTextFile 
{

	public static void main(String[] args) throws IOException 
	{
	
// Creating a single file
	File text=new File("D:\\Random\\Text.txt");
	text.createNewFile();
		
		
// Creating Folder and a Text file
	File file = new File("D:\\Random");
		
		if(!file.exists())
		{
			if(file.mkdir())
			{
				System.out.println("Directory Created");
				File textfile=new File("D:\\Random\\TextFile.txt");
				textfile.createNewFile();
				
			}
			else
			{
				System.out.println("No Directory Created");
			}
		}
		
	}

}

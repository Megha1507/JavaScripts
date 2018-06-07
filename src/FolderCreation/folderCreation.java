package FolderCreation;

import java.io.File;

public class folderCreation {

	public static void main(String[] args)
	{
// Create a Single Directory
		File file = new File("D:\\JavaFilecreated");
		
		if(!file.exists())
		{
			if(file.mkdir())
			{
				System.out.println("Directory Created");
				
			}else
			{
				System.out.println("No Directory Created");
			}
		}
		
// Create Multiple Directory		
		File MultiFile = new File("D:\\JavaFilecreated\\Android\\Cupcake");
		
		if(!MultiFile.exists())
		{
			if(MultiFile.mkdir())
			{
				System.out.println("Directory Created");
				
			}else
			{
				System.out.println("No Directory Created");
			}
		}
	}

}

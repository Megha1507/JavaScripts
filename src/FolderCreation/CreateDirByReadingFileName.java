package FolderCreation;

import java.io.File;
import java.io.IOException;

public class CreateDirByReadingFileName 
{
	public static void main(String[] args) throws IOException
	{
		File folder = new File("D://Random1");
		File[] listOfFiles = folder.listFiles();
		System.out.println(listOfFiles.length);
		    for (int i = 0; i < listOfFiles.length; i++) 
		    {
		    	String FileName= listOfFiles[i].getName();
		        System.out.println("File " + FileName);
		        char A=FileName.charAt(0);
		        System.out.println(A);
		       
		        File createFolder= new File("D:\\Random1\\" + A );
		        createFolder.mkdir();
		        
		    }
		    
	}

}

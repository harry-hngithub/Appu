package crawler;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Cache {
	
	//separate class name?  
	public static Path move(Path source, Path target,CopyOption... options)
	            throws IOException{
	    	
	    	Path temp= Files.move(Paths.get("/src"), Paths.get("/dest"), StandardCopyOption.ATOMIC_MOVE);
	    	if (temp!=null)
	    	{
	    		System.out.println("Cache success");
	    	}
	    	else
	    	{
	    		System.out.println("File already exists in cache");
	    	}
			return temp;
	    	
	    }
	
	public static void  delCache(){
    	File file1 = new File("C:\\Users\\Mayank\\Desktop\\1.txt");
        
        if(file1.delete())
        {
            System.out.println("File deleted successfully");
        }
        else
        {
            System.out.println("Failed to delete the file");
        }
    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    	System.out.println("Do u want to save the page?");
    	//input = y or no
    	File f= new File("/opened page file in processed text");
    	if(//y)
    	{
    		if(f.exists())
    		{
    			//call Path move mentioned above
    		}
    		else
    		{
    			System.out.println("Page does not exist");
    		}
    	}
    	else
    	{
    		break;
    	}
	}

}

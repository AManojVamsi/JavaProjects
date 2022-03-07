package FileHandling;
import java.io.IOException;
import java.io.File;
public class DeleteFileDemo {

	public static void main(String[] args)
	{
		File myFile = new File("data1.txt");
		if(myFile.delete())
		{
			System.out.println("File deleted: "+myFile.getName()+" successfully");
		}
		else
		{
			System.out.println("Failed to delete a file.");
		}
		}
	}


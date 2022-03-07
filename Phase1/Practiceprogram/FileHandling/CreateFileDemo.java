package FileHandling;
import java.io.File;
import java.io.IOException;
public class CreateFileDemo {

	public static void main(String[] args)
	{
		
		File myFile = new File("datanew.txt");
		
		try {
			if(myFile.createNewFile())
			{
				System.out.println("File created successfully");
			}
			else
			{
				System.out.println("File creation error");
			}
			
		}
		catch (IOException ex)
		{
			System.out.println("File error...");
		}
			}
			}
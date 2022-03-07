package FileHandling;
import java.io.IOException;
import java.io.FileWriter;
public class FileWriteDemo {

	
	public static void main(String[] args)
	{
		
		String data = "GROUP B,CSK, RCB, SRH, GT, KKR.";
		
		try
		{
		FileWriter output = new FileWriter("datanew.txt");
		output.write(data);
		System.out.println("Data is written successfully.");
		output.close();
		}
		
		catch (IOException ex)
		{
			System.out.println("File write Error..");
		}
		}
}

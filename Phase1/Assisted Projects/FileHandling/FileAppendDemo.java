package FileHandling;
import java.io.IOException;
import java.io.FileWriter;
public class FileAppendDemo {

	public static void main(String[] args)
	{
		String data = "This data is appended..";
		try
		{
		FileWriter output = new FileWriter("datanew.txt", true);
		output.write(data);
		System.out.println("Data appended successfully.");
		output.close();
		}
		catch (IOException ex)
		{
			System.out.println("file append error..");
			
		}
	}
}

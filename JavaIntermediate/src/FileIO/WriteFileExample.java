package FileIO;//creating the file first 
//and after reading it from
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileExample {
	public static void main(String[] args) {
		try {
			Writer w=new FileWriter ("Upasana.txt");
			String content="Welcome to the world of Java, I will take you to great places";
			w.write(content);
			w.close();
			System.out.println("File written successfully");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
//upasana.txt
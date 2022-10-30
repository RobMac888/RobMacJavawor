package FileIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

	public static void main(String[] args) {
		  Path path = Path("/Users/robmac/Desktop/JavaQA.260922/Temp.rtf");
	      System.out.println("Absolute Path:"+path.isAbsolute());
	      System.out.println("FileName:"+path.getFileName());
	      System.out.println("Absolute Path:"+path.toAbsolutePath().toString());
	      System.out.println("Root:"+path.getRoot());
	      System.out.println("Parent:"+path.getParent());
	      System.out.println("Name Count:"+path.getNameCount());
	      System.out.println("Get first name:"+path.getName(0));
	      System.out.println("Subpath:" +path.subpath(0, 3));
	      System.out.println("Names in path:"+path.getNameCount());}

	private static Path Path(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	}


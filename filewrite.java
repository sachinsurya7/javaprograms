import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;

public class filewrite {
	void filewriter()throws IOException
	{ 
		try {
		FileWriter fw=new FileWriter("D:\\s1.txt");
		fw.write("welcome");
		System.out.println("FileInserted");
		fw.close();
	}
	catch(FileNotFoundException t)
		{
		System.out.println(t);
		
		}
	}
	public static void main(String[] args) throws IOException{
		filewrite f1=new filewrite();
		f1.filewriter();
		

	}

}

package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties p=new Properties();
		
		p.load(new FileInputStream("./p.properties"));
		
		String data = p.getProperty("country");
		
		System.out.println(data);
		
		
		
		
		
		
		
		
		

	}

}

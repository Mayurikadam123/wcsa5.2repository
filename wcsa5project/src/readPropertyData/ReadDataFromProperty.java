package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		// read the data from confic.properties file
		 FileInputStream fis = new FileInputStream("./Data/config.properties");
		 
		 Properties prop = new Properties(); 
		 
		 prop.load(fis);
		 
		  String data = prop.getProperty("Password");
		 System.out.println(data);
		 String data1 = prop.getProperty("Url");
		 System.out.println(data1);
		 String data2 = prop.getProperty("Username");
		 System.out.println(data2);
		
		 

	}

}

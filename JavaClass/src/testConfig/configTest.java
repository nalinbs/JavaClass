package testConfig;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class configTest {
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fils = new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\object.properties");
		prop.load(fils);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(System.getProperty("user.dir"));
		
	}

}

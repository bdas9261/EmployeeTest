package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {
	public static Properties prop;
	
	   public Base() {
		   try {
			   FileInputStream fi=new FileInputStream(System.getProperty("user.dir")+TestingConstraint.propertiespath);
			   prop=new Properties();
			   prop.load(fi);
		} 
		   catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}   
		   catch (IOException e) {
				
				e.printStackTrace();
			}
	   }
}

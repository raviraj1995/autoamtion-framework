package Reusable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetProperties {
	public static Properties prop=new Properties();
	public static FileInputStream fis;
	
	public static String getProperty(String key) {
		String path="C:\\Users\\Raviraj\\eclipse-workspace\\Framework6\\src\\test\\resources\\config.properties";
		try {
			fis=new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
	

}

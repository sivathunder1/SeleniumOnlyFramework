package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNGDemo;

public class PropertiesFile {
	static Properties prop;
	static String projectpath;
	
	public static void main(String[] args) throws IOException {
		getProperties();
		setProperties();

	}
	
	public static void getProperties() throws IOException{
		prop = new Properties();
		projectpath = System.getProperty("user.dir");
		InputStream input = new FileInputStream(projectpath+"\\src\\test\\java\\config\\config.properties");
		prop.load(input);
		String browser = prop.getProperty("browser");
		System.out.println("Selected browser "+browser);
		TestNGDemo.browsername =browser;
		
	}
	
	public static void setProperties() throws IOException{
		OutputStream output = new FileOutputStream(projectpath+"\\src\\test\\java\\config\\config.properties");
		prop.setProperty("browser", "chrome");
		prop.store(output,null);
		
	}

}

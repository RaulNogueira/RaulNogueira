package environment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperties {
	public static Properties property;
	private static String path = "config/projectConfig.properties";
	
	public static void inicializaProperties() {
		property = new Properties();
		try {
			InputStream input = new FileInputStream(path);
			property.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}

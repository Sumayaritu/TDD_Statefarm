package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Configuration {
	Properties properties;
	
	public Configuration() {
		loadProperties();
	}

	private void loadProperties() {
		properties=new Properties();
		InputStream iStream=getClass().getClassLoader().getResourceAsStream("config.properties");
		try {
			properties.load(iStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getProp(String key) {
		return properties.getProperty(key);
		
	}
	public int getPropNum(String key) {
		return Integer.parseInt(getProp(key));
	}
	
}

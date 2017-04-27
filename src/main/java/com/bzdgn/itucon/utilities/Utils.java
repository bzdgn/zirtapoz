package com.bzdgn.itucon.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utils {
	
	private static final String DEFAULT_CONFIG_FILE_NAME = "config.properties";
	
	public static String getPropertyFromConfigFile(String key) {
		return getPropertyFromConfigFile(DEFAULT_CONFIG_FILE_NAME, key);
	}
	
	public static String getPropertyFromConfigFile(String propFileName, String key) {
		Properties props = new Properties();
		
		// Read from classpath
		try(InputStream input = Utils.class.getClassLoader().getResourceAsStream(propFileName)) {
			if(input != null) {
				props.load(input);
				
				return props.getProperty(key);
			} else {
				System.out.println("ERROR: File does not exist inthe classpath.");
			}

		} catch(IOException ex) {
			ex.printStackTrace();
			System.out.println("ERROR: Unable to read config.properties");
		}
		
		return null;
	}
	
	public static String[] getStaticMessages() {
		int count = Integer.parseInt(getPropertyFromConfigFile("MOTH_static_messages.properties", "message_count"));
		
		String[] messages = new String[count];
		
		for(int i = 0; i < count; i++) {
			messages[i] = getPropertyFromConfigFile("MOTH_static_messages.properties", Integer.toString(i));
		}
		
		return messages;
	}

}

package com.bzdgn.itucon;

import com.bzdgn.itucon.utilities.Utils;

public class PropsExample {

	public static void main(String[] args) {
		int count = Integer.parseInt( Utils.getPropertyFromConfigFile("MOTH_static_messages.properties", "message_count") );
		
		for(int i = 0; i < count; i++) {
			System.out.println(Utils.getPropertyFromConfigFile("MOTH_static_messages.properties", Integer.toString(i)));
		}
	}

}

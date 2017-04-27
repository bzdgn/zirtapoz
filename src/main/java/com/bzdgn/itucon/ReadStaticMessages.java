package com.bzdgn.itucon;

import com.bzdgn.itucon.utilities.Utils;

public class ReadStaticMessages {

	public static void main(String[] args) {
		String[] messages = Utils.getStaticMessages();
		
		for(String m : messages) {
			System.out.println(m);
		}
	}

}

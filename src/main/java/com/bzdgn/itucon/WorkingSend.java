package com.bzdgn.itucon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

import com.bzdgn.itucon.utilities.Utils;

public class WorkingSend {

	public static void main(String[] args) throws IOException {
		String token = Utils.getPropertyFromConfigFile("access-token");
//		String channel = "#general";
		String channel = "C547B92TB";
		String as_user = "zirtapoz";
		String message = "Son deneme" + new Date();
		String urlParameters = String.format("token=%s&channel=%s&as_user=%s&text=%s", token, channel, as_user, message);

		URL url = new URL("https://slack.com/api/chat.postMessage");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setDoOutput(true);
		con.getOutputStream().write(urlParameters.getBytes("UTF-8"));
		con.getInputStream();
		
		
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		//print result
		System.out.println(response.toString());
	}

}

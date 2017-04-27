package com.bzdgn.itucon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.bzdgn.itucon.model.ChannelHistory;
import com.bzdgn.itucon.model.Message;
import com.bzdgn.itucon.utilities.Utils;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadHistory {

	public static void main(String[] args) throws IOException {
		String token = Utils.getPropertyFromConfigFile("access-token");
		String channel = Utils.getPropertyFromConfigFile("channel");

		String urlParameters = String.format("token=%s&channel=%s", token, channel);

		URL url = new URL("https://slack.com/api/channels.history");
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

		//print json result
		System.out.println(response.toString());
		
		// parse response
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {

			// Convert JSON string to Object
			ChannelHistory channelHistory = mapper.readValue(response.toString(), ChannelHistory.class);
			
			if(channelHistory.isOk()) {
				printMessages(channelHistory);
			}

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void printMessages(ChannelHistory channelHistory) {
		Message messages[] = channelHistory.getMessages();
		
		for(Message m: messages) {
			System.out.println(m.getUser() + ": " + m.getText());
		}
	}

}

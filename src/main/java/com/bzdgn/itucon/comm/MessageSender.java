package com.bzdgn.itucon.comm;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class MessageSender {
	
	private static final String URL_STRING = "https://slack.com/api/chat.postMessage";
	
	private final String token;
	private final String channel;
	private final String user;
	
	public MessageSender(final String token, final String channel, final String user) {
		this.token = token;
		this.channel = channel;
		this.user = user;
	}
	
	public void sendMessage(final String message) throws IOException {
		String urlParameters = String.format("token=%s&channel=%s&as_user=%s&text=%s", token, channel, user, message);

		URL url = new URL(URL_STRING);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("POST");
		con.setDoOutput(true);
		con.getOutputStream().write(urlParameters.getBytes("UTF-8"));
		con.getInputStream();
	}
	
}

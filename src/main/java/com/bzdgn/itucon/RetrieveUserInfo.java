package com.bzdgn.itucon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.bzdgn.itucon.model.User;
import com.bzdgn.itucon.model.UserInfo;
import com.bzdgn.itucon.utilities.Utils;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RetrieveUserInfo {

	public static void main(String[] args) throws IOException {
		String token = Utils.getPropertyFromConfigFile("access-token");
		String userCode = "U54V1U3DK";

		String urlParameters = String.format("token=%s&user=%s", token, userCode);

		URL url = new URL("https://slack.com/api/users.info");
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
			UserInfo userInfo = mapper.readValue(response.toString(), UserInfo.class);
			
			if(userInfo.isOk()) {
				User user = userInfo.getUser();
				printUser(user);
			}

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void printUser(User user) {
		System.out.println("User Id: " + user.getId() + "\nUser Name: " + user.getName());
	}

}

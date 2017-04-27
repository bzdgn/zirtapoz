package com.bzdgn.itucon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.bzdgn.itucon.model.Team;
import com.bzdgn.itucon.model.TeamInfo;
import com.bzdgn.itucon.utilities.Utils;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RetrieveTeamInfo {

	public static void main(String[] args) throws IOException {
		String token = Utils.getPropertyFromConfigFile("access-token");
		String teamId = Utils.getPropertyFromConfigFile("team-id");

		String urlParameters = String.format("token=%s&user=%s", token, teamId);

		URL url = new URL("https://slack.com/api/team.info");
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
			TeamInfo teamInfo = mapper.readValue(response.toString(), TeamInfo.class);
			
			if(teamInfo.isOk()) {
				Team team = teamInfo.getTeam();
				printTeam(team);
			}

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void printTeam(Team team) {
		System.out.println("Team Id: " + team.getId() + "\nTeam Name: " + team.getName());
	}

}

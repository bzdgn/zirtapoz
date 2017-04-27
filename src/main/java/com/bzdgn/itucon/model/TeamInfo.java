package com.bzdgn.itucon.model;

public class TeamInfo {

	private boolean ok;
	private Team team;
	
	/* No-arg default constructor */
	public TeamInfo() {}

	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}

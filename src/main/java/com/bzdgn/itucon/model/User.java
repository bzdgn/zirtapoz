package com.bzdgn.itucon.model;

public class User {

	private String id;
	private String team_id;
	private String name;
	private boolean deleted;
	private String status;
	private String color;
	private String real_name;
	private String tz;
	private String tz_label;
	private String tz_offset;
	private Profile profile;
	private boolean is_admin;
	private boolean is_owner;
	private boolean is_primary_owner;
	private boolean is_restricted;
	private boolean is_ultra_restricted;
	private boolean is_bot;
	private String updated;

	public User() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTeam_id() {
		return team_id;
	}

	public void setTeam_id(String team_id) {
		this.team_id = team_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getReal_name() {
		return real_name;
	}

	public void setReal_name(String real_name) {
		this.real_name = real_name;
	}

	public String getTz() {
		return tz;
	}

	public void setTz(String tz) {
		this.tz = tz;
	}

	public String getTz_label() {
		return tz_label;
	}

	public void setTz_label(String tz_label) {
		this.tz_label = tz_label;
	}

	public String getTz_offset() {
		return tz_offset;
	}

	public void setTz_offset(String tz_offset) {
		this.tz_offset = tz_offset;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public boolean isIs_admin() {
		return is_admin;
	}

	public void setIs_admin(boolean is_admin) {
		this.is_admin = is_admin;
	}

	public boolean isIs_owner() {
		return is_owner;
	}

	public void setIs_owner(boolean is_owner) {
		this.is_owner = is_owner;
	}

	public boolean isIs_primary_owner() {
		return is_primary_owner;
	}

	public void setIs_primary_owner(boolean is_primary_owner) {
		this.is_primary_owner = is_primary_owner;
	}

	public boolean isIs_restricted() {
		return is_restricted;
	}

	public void setIs_restricted(boolean is_restricted) {
		this.is_restricted = is_restricted;
	}

	public boolean isIs_ultra_restricted() {
		return is_ultra_restricted;
	}

	public void setIs_ultra_restricted(boolean is_ultra_restricted) {
		this.is_ultra_restricted = is_ultra_restricted;
	}

	public boolean isIs_bot() {
		return is_bot;
	}

	public void setIs_bot(boolean is_bot) {
		this.is_bot = is_bot;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

}

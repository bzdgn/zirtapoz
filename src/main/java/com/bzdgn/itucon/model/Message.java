package com.bzdgn.itucon.model;

public class Message {

	private String type;
	private String subtype;
	private String text;
	private File file;
	private String user;
	private String upload;
	private String display_as_bot;
	private String username;
	private String bot_id;
	private String ts;
	private String purpose;
	private Attachment[] attachments;
	private Reaction[] reactions;

	public Message() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUpload() {
		return upload;
	}

	public void setUpload(String upload) {
		this.upload = upload;
	}

	public String getDisplay_as_bot() {
		return display_as_bot;
	}

	public void setDisplay_as_bot(String display_as_bot) {
		this.display_as_bot = display_as_bot;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBot_id() {
		return bot_id;
	}

	public void setBot_id(String bot_id) {
		this.bot_id = bot_id;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Attachment[] getAttachments() {
		return attachments;
	}

	public void setAttachments(Attachment[] attachments) {
		this.attachments = attachments;
	}

	public Reaction[] getReactions() {
		return reactions;
	}

	public void setReactions(Reaction[] reactions) {
		this.reactions = reactions;
	}

}

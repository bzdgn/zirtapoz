package com.bzdgn.itucon.model;

public class ChannelHistory {

	private boolean ok;
	private Message messages[];
	private boolean has_more;
	
	public ChannelHistory() {}

	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}

	public Message[] getMessages() {
		return messages;
	}

	public void setMessages(Message[] messages) {
		this.messages = messages;
	}
	
	public boolean isHas_more() {
		return has_more;
	}

	public void setHas_more(boolean has_more) {
		this.has_more = has_more;
	}
	
}

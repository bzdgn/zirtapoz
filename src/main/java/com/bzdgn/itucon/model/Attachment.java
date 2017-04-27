package com.bzdgn.itucon.model;

public class Attachment {

	private String service_name;
	private String title;
	private String title_link;
	private String text;
	private String fallback;
	private String from_url;
	private String thumb_url;
	private int thumb_width;
	private int thumb_height;
	private String service_icon;
	private long id;

	public Attachment() {
	}

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle_link() {
		return title_link;
	}

	public void setTitle_link(String title_link) {
		this.title_link = title_link;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getFallback() {
		return fallback;
	}

	public void setFallback(String fallback) {
		this.fallback = fallback;
	}

	public String getFrom_url() {
		return from_url;
	}

	public void setFrom_url(String from_url) {
		this.from_url = from_url;
	}

	public String getThumb_url() {
		return thumb_url;
	}

	public void setThumb_url(String thumb_url) {
		this.thumb_url = thumb_url;
	}

	public int getThumb_width() {
		return thumb_width;
	}

	public void setThumb_width(int thumb_width) {
		this.thumb_width = thumb_width;
	}

	public int getThumb_height() {
		return thumb_height;
	}

	public void setThumb_height(int thumb_height) {
		this.thumb_height = thumb_height;
	}

	public String getService_icon() {
		return service_icon;
	}

	public void setService_icon(String service_icon) {
		this.service_icon = service_icon;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}

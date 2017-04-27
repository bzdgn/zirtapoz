package com.bzdgn.itucon.model;

import java.util.Date;

public class File {

	private String id;
	private Date created;
	private Date timestamp;
	private String name;
	private String title;
	private String mimetype;
	private String filetype;
	private String pretty_type;
	private String user;
	private boolean editable;
	private int size;
	private String mode;
	private boolean is_external;
	private String external_type;
	private boolean is_public;
	private boolean public_url_shared;
	private boolean display_as_bot;
	private String username;
	private String url_private;
	private String url_private_download;
	private String permalink;
	private String permalink_public;
	private String preview;
	private Date updated;
	private String editor;
	private String last_editor;
	private String state;
	private String[] channels;
	private String[] groups;
	private String[] ims;
	private int comments_count;

	/* No arg default constructor */
	public File() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMimetype() {
		return mimetype;
	}

	public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}

	public String getFiletype() {
		return filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public String getPretty_type() {
		return pretty_type;
	}

	public void setPretty_type(String pretty_type) {
		this.pretty_type = pretty_type;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public boolean isIs_external() {
		return is_external;
	}

	public void setIs_external(boolean is_external) {
		this.is_external = is_external;
	}

	public String getExternal_type() {
		return external_type;
	}

	public void setExternal_type(String external_type) {
		this.external_type = external_type;
	}

	public boolean isIs_public() {
		return is_public;
	}

	public void setIs_public(boolean is_public) {
		this.is_public = is_public;
	}

	public boolean isPublic_url_shared() {
		return public_url_shared;
	}

	public void setPublic_url_shared(boolean public_url_shared) {
		this.public_url_shared = public_url_shared;
	}

	public boolean isDisplay_as_bot() {
		return display_as_bot;
	}

	public void setDisplay_as_bot(boolean display_as_bot) {
		this.display_as_bot = display_as_bot;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUrl_private() {
		return url_private;
	}

	public void setUrl_private(String url_private) {
		this.url_private = url_private;
	}

	public String getUrl_private_download() {
		return url_private_download;
	}

	public void setUrl_private_download(String url_private_download) {
		this.url_private_download = url_private_download;
	}

	public String getPermalink() {
		return permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public String getPermalink_public() {
		return permalink_public;
	}

	public void setPermalink_public(String permalink_public) {
		this.permalink_public = permalink_public;
	}

	public String getPreview() {
		return preview;
	}

	public void setPreview(String preview) {
		this.preview = preview;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getLast_editor() {
		return last_editor;
	}

	public void setLast_editor(String last_editor) {
		this.last_editor = last_editor;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String[] getChannels() {
		return channels;
	}

	public void setChannels(String[] channels) {
		this.channels = channels;
	}

	public String[] getGroups() {
		return groups;
	}

	public void setGroups(String[] groups) {
		this.groups = groups;
	}

	public String[] getIms() {
		return ims;
	}

	public void setIms(String[] ims) {
		this.ims = ims;
	}

	public int getComments_count() {
		return comments_count;
	}

	public void setComments_count(int comments_count) {
		this.comments_count = comments_count;
	}

}

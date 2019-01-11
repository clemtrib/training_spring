package com.clemtrib.post;

public class Post {

	private final long id;

	private final String title;
	
	private final String content;

	public Post(long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
	
	public long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	

	public String getContent() {
		return content;
	}
	
	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", content=" + content + "]";
	}

}

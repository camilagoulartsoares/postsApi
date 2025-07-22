package com.postsapi.model;

public class Post {
    private Long id;
    private String date;
    private String title;
    private String description;
    private int likes;

    public Post() {}

    public Post(Long id, String date, String title, String description, int likes) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.description = description;
        this.likes = likes;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getLikes() { return likes; }
    public void setLikes(int likes) { this.likes = likes; }
}

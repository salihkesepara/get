package com.example.kesepara.get;

public class News {
    /* The id of news */
    private int id;

    /* The title of news */
    private String title;

    /* The imageUrl of news */
    private String src;

    /* The link of news */
    private String link;

    public News(int id, String title, String src, String link) {
        this.id = id;
        this.title = title;
        this.src = src;
        this.link = link;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getSrc() {
        return src;
    }

    public String getLink() {
        return this.link;
    }
}

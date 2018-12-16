package com.example.kesepara.get;

public class News {
    /* The id of news */
    private int id;

    /* The title of news */
    private String title;

    /* The imageUrl of news */
    private int imgUrl;

    /* The link of news */
    private String link;

    public News(int id, String title, int imgUrl, String link) {
        this.id = id;
        this.title = title;
        this.imgUrl = imgUrl;
        this.link = link;
    }

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public int getImgUrl() {
        return this.imgUrl;
    }

    public String getLink() {
        return this.link;
    }
}

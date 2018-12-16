package com.example.kesepara.get;

public class News {
    /* The id of news */
    private int id;

    /* The title of news */
    private String title;

    /* The imageUrl of news */
    private String imgUrl;

    /* The link of news */
    private String link;

    public News(int id, String title, String imgUrl, String link) {
        this.id = id;
        this.title = title;
        this.imgUrl = imgUrl;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getLink() {
        return link;
    }
}

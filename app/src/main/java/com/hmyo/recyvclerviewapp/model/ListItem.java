package com.hmyo.recyvclerviewapp.model;

public class ListItem {

    private String title;
    private String description;

    private String rating;
    public ListItem(String title, String description, String rating) {
        this.title = title;
        this.description = description;
        this.rating = rating;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }


}

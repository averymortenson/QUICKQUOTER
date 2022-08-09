package com.mdo.quickquoter.Models;

import android.net.Uri;

import java.net.URI;

public class VideoItem {

    String link;
    String likes;
    String comments;
    String shares;
    String saves;
    Uri uri;
    String caption;

    VideoItem(){}

    public VideoItem(String link, String likes, String comments, String shares, String saves, String caption, Uri uri) {
        this.link = link;
        this.likes = likes;
        this.comments = comments;
        this.shares = shares;
        this.saves = saves;
        this.caption = caption;
        this.uri = uri;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getShares() {
        return shares;
    }

    public void setShares(String shares) {
        this.shares = shares;
    }

    public String getSaves() {
        return saves;
    }

    public void setSaves(String saves) {
        this.saves = saves;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }
}

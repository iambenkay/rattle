package com.benkaysnotes.rattle;

public class Post extends RVObject {
    private String name, username, body;
    private boolean owner, liked, reposted;


    public boolean isReposted() {
        return reposted;
    }

    public void setReposted(boolean reposted) {
        this.reposted = reposted;
    }

    public Post(String name, String username, String body, boolean owner) {
        this.name = name;
        this.username = username;
        this.body = body;
        this.owner = owner;
        this.liked = false;
        this.reposted = false;


    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public boolean isOwner() {
        return owner;
    }

    public void setOwner(boolean owner) {
        this.owner = owner;
    }
}

package com.benkaysnotes.rattle;

import java.util.Locale;

public class Profile extends RVObject {
    private String name, username, bio;
    private long followers, following, visits;


    public Profile(String name, String username, String bio, int followers, int following, int visits) {
        this.name = name;
        this.username = username;
        this.bio = bio;
        this.followers = followers;
        this.following = following;
        this.visits = visits;
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

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getFollowers() {
        String result;
        float f;

        if ((followers > 9999) && (followers <= 99999)) {
            f = followers / 1000;
            result = String.format(Locale.getDefault(), "%2.1fK", f);
        }else if((followers > 99999) && (followers <= 999999)) {
            f = followers / 1000;
            result = String.format(Locale.getDefault(), "%3.0fK", f);
        }else if ((followers > 999999) && (followers <= 99999999)){
            f = followers / 1000000;
            result = String.format(Locale.getDefault(), "%2.1fM", f);
        }else if ((followers > 99999999) && (followers <= 999999999)){
            f = followers / 1000000;
            result = String.format(Locale.getDefault(), "%3.1fM", f);
        }else{
            result = String.format(Locale.getDefault(), "%d", followers);
        }

        return result;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public String getFollowing() {
        String result;
        float f;
        
        if ((following > 9999) && (following <= 99999)) {
            f = following / 1000;
            result = String.format(Locale.getDefault(), "%2.1fK", f);
        }else if((following > 99999) && (following <= 999999)) {
            f = following / 1000;
            result = String.format(Locale.getDefault(), "%3.0fK", f);
        }else if ((following > 999999) && (following <= 99999999)){
            f = following / 1000000;
            result = String.format(Locale.getDefault(), "%2.2fM", f);
        }else if ((following > 99999999) && (following <= 999999999)){
            f = following / 1000000;
            result = String.format(Locale.getDefault(), "%3.1fM", f);
        }else{
            result = String.format(Locale.getDefault(), "%d", following);
        }

        return result;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public String getVisits() {
        String result;
        float f;

        if ((visits > 9999) && (visits <= 99999)) {
            f = visits / 1000;
            result = String.format(Locale.getDefault(), "%3.1fK", f);
        }else if((visits > 99999) && (visits <= 999999)) {
            f = visits / 1000;
            result = String.format(Locale.getDefault(), "%3.0fK", f);
        }else if ((visits > 999999) && (visits <= 99999999)){
            f = visits / 1000000;
            result = String.format(Locale.getDefault(), "%3.1fM", f);
        }else if ((visits > 99999999) && (visits <= 999999999)){
            f = visits / 1000000;
            result = String.format(Locale.getDefault(), "%4.1fM", f);
        }else{
            result = String.format(Locale.getDefault(), "%d", visits);
        }

        return result;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }
}

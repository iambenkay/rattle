package com.benkaysnotes.rattle;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

class ProfileHolder extends RecyclerView.ViewHolder {
    ImageView profile = null;
    TextView name = null, username = null, followers = null, following = null, visits = null, bio = null;

    ProfileHolder(View row) {
        super(row);
        this.profile = row.findViewById(R.id.profile);
        this.name = row.findViewById(R.id.name);
        this.username = row.findViewById(R.id.username);
        this.followers = row.findViewById(R.id.followers);
        this.following = row.findViewById(R.id.following);
        this.visits = row.findViewById(R.id.visits);
        this.bio = row.findViewById(R.id.bio);
    }

    void bindModel(Profile profile) {
        // this.profile.setImageResource(R.drawable.ic_account_circle_black_24dp);
        this.name.setText(profile.getName());
        this.username.setText(String.format(Locale.getDefault(), "@%s", profile.getUsername()));
        this.followers.setText(profile.getFollowers());
        this.following.setText(profile.getFollowing());
        this.visits.setText(profile.getVisits());
        this.bio.setText(profile.getBio());
    }
}

package com.benkaysnotes.rattle;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

class PostHolder extends RecyclerView.ViewHolder {
    ImageView profile = null, like = null, repost = null;
    TextView display_name = null, username = null, body = null, noLikes = null, noReposts = null;
    LinearLayout like_btn = null, repost_btn = null;

    PostHolder(View row) {
        super(row);
        this.profile = row.findViewById(R.id.profile);
        this.display_name = row.findViewById(R.id.display_name);
        this.username = row.findViewById(R.id.username);
        this.body = row.findViewById(R.id.body);
        this.like_btn = row.findViewById(R.id.like_button);
        this.noLikes = row.findViewById(R.id.like_no);
        this.like = row.findViewById(R.id.like);
        this.repost = row.findViewById(R.id.repost);
        this.noReposts = row.findViewById(R.id.no_repost);
        this.repost_btn = row.findViewById(R.id.repost_button);
    }

    void bindModel(Post post) {
        this.profile.setImageResource(R.drawable.ic_account_circle_black_24dp);
        this.display_name.setText(post.getName());
        this.username.setText(post.getUsername());
        this.body.setText(post.getBody());
        this.noLikes.setText("33.3K");
    }
}

package com.benkaysnotes.rattle;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

class PostAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    RVObject[] items = null;
    AppCompatActivity activity = null;

    public PostAdapter(Context context, RVObject[] items){
        this.activity = (AppCompatActivity) context;
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == R.layout.profile_header) {
            return (new ProfileHolder(getActivity().getLayoutInflater().inflate(R.layout.profile_header, parent, false)));
        } else if (viewType == R.layout.post) {
            return (new PostHolder(getActivity().getLayoutInflater().inflate(R.layout.post, parent, false)));
        }
        return new FooterHolder(getActivity().getLayoutInflater().inflate(R.layout.footer, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof PostHolder) {
            ((PostHolder) holder).bindModel((Post) items[position]);
        } else if (holder instanceof ProfileHolder) {
            ((ProfileHolder) holder).bindModel((Profile) items[position]);
        } else {
            ((FooterHolder) holder).bindModel((Footer) items[position]);
        }
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    @Override
    public int getItemViewType(int position) {
        if (items[position] instanceof Profile) {
            return R.layout.profile_header;
        } else if (items[position] instanceof Post) {
            return R.layout.post;
        }
        return R.layout.footer;
    }
    private AppCompatActivity getActivity(){
        return this.activity;
    }
}

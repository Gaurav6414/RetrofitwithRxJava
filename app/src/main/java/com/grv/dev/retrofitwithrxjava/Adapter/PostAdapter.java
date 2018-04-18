package com.grv.dev.retrofitwithrxjava.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grv.dev.retrofitwithrxjava.Model.Post;
import com.grv.dev.retrofitwithrxjava.R;

import java.util.List;

/**
 * Created by GRV on 4/18/2018.
 */

public class PostAdapter extends RecyclerView.Adapter<PostsViewHolder> {

    Context context;
    List<Post> postList;

    public PostAdapter(Context context, List<Post> postList) {
        this.context = context;
        this.postList = postList;
    }

    @Override
    public PostsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postlayout,parent,false);
        return new PostsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostsViewHolder holder, int position) {

        holder.txt_title.setText(String.valueOf(postList.get(position).title));
        holder.txt_author.setText(String.valueOf(postList.get(position).userId));
        holder.txt_content.setText(new StringBuilder(postList.get(position).body.substring(0,20)).append(toString()));


    }

    @Override
    public int getItemCount() {
        return postList.size();
    }
}

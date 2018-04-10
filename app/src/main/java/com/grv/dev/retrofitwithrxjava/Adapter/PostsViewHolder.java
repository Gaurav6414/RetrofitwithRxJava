package com.grv.dev.retrofitwithrxjava.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.grv.dev.retrofitwithrxjava.R;

/**
 * Created by GRV on 4/10/2018.
 */

public class PostsViewHolder extends RecyclerView.ViewHolder {

    TextView txt_title,txt_content,txt_author;

    public PostsViewHolder(View itemView) {
        super(itemView);

        txt_author = (TextView)itemView.findViewById(R.id.author_view);
        txt_content = (TextView)itemView.findViewById(R.id.content_view);
        txt_title = (TextView)itemView.findViewById(R.id.txt_view);
    }
}

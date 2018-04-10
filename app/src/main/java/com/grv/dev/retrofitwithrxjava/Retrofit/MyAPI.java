package com.grv.dev.retrofitwithrxjava.Retrofit;

import android.database.Observable;

import com.grv.dev.retrofitwithrxjava.Model.Post;

import java.util.List;


import retrofit2.http.GET;

/**
 * Created by GRV on 4/10/2018.
 */

public interface MyAPI {
    @GET ("posts")
    Observable<List<Post>> getPosts();
}

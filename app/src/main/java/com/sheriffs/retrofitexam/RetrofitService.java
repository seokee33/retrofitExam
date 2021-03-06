package com.sheriffs.retrofitexam;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RetrofitService {
    // @GET( EndPoint-μμμμΉ(URI) )
    @GET("posts/{post}")
    Call<PostResult> getPosts(@Path("post") String post);

    @GET("get")
    Call<getTemp> getTemp(@Path("get") String get);
}

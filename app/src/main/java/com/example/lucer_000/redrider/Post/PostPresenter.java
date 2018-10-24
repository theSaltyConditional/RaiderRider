package com.example.lucer_000.redrider.Post;


import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;

import com.example.lucer_000.redrider.Data.Driver;
import com.example.lucer_000.redrider.Data.Rider;
import com.example.lucer_000.redrider.Data.PostRepository;

public class PostPresenter implements PostContract.Presenter {



    @NonNull
    private final PostContract.View mPostView;

    PostRepository postRepository;


    public PostPresenter(PostRepository postRepository,@NonNull PostContract.View postView){
        // mMatchView = checkNotNull(matchView, "matchView cannot be null!");
        mPostView = postView;
        this.postRepository = postRepository;
        mPostView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void submitNewPost(String dest,String date, String time){
        //public Rider(String date, String destination, int riderId, String time)
        Rider riderPost = new Rider(dest,date, 1234, time);
        postRepository.savePost(riderPost);

        System.out.println("inside rider submit post");
        mPostView.submitPostSuccess();
        //come back to this later and create a Post class with a user post list
    }
    @Override
    public void submitNewPost(String dest, String date, String seats, String time, String vehicle){

        //String dest, String date, int driverId, int seats, String time, String vehicle
        Driver driverPost = new Driver(dest,date,1234,1,time,vehicle);
        //postRepository.savePost(driverPost);

        System.out.println("inside driver submit post");
        mPostView.submitPostSuccess();
        //come back to this later and create a Post class with a user post list
    }

    @Override
    public void setSubmitBtn(){
        mPostView.setSubmitBtn();
    }
}


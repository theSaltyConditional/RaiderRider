package com.example.lucer_000.redrider.MatchPage;
import android.content.Intent;

import com.example.lucer_000.redrider.BasePresenter;
import com.example.lucer_000.redrider.BaseView;
import com.example.lucer_000.redrider.Data.Post;

public interface MatchContract {

    interface View extends BaseView<Presenter>{

        void showAddPost();
        void showPost(String[] postArray);
        //void onActivityResult(int requestCode, int resultCode, Intent data);
    }

    interface Presenter extends BasePresenter{

        String getValue();

        void addPost();

        void makeRequest();


    }
}

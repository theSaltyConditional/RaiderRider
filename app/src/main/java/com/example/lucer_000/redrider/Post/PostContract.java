package com.example.lucer_000.redrider.Post;

import com.example.lucer_000.redrider.BasePresenter;
import com.example.lucer_000.redrider.BaseView;

public interface PostContract {

    interface View extends BaseView<Presenter>{

        void setRiderView();
        void setDriverView();
    }
    interface Presenter extends BasePresenter{

    }
}

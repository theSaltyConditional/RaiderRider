package com.example.lucer_000.redrider.Data;


import android.content.Context;

import com.example.lucer_000.redrider.Data.PostRepository;

public class Injection {

    public static PostRepository provideTasksRepository(Context context) {

        return PostRepository.getInstance();
    }
}

package com.example.cuongphan.multithreadedproramming1_separateclass;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CoinFlippingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_flipping);

    }

    public void flipCoin(View view){
        for(int i=0; i<5; i++){
            ExecutorService taskList = Executors.newFixedThreadPool(5);
            taskList.execute(new FipCoin());
        }
    }
}


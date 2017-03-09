package com.example.cuongphan.multithreadedproramming1_separateclass;

import android.util.Log;

import java.util.Random;

/**
 * Created by CuongPhan on 3/9/2017.
 */

class FipCoin implements Runnable {
    @Override
    public void run() {
        int coin_sum = 0;
        int coin;
        Random rd = new Random();
        for (int i=0; i<1000; i++){
             coin = rd.nextInt(2);
            if(coin_sum == (coin_sum + coin)){
                coin_sum = 0;
            }
            else {
                coin_sum += coin;
                if(coin_sum >= 3){
                    System.out.println(""+ Thread.currentThread().getName() +"" +i);
                    //Log.d("CoinFlippingActivity", Thread.currentThread().getName());
                }

            }
        }
    }
}

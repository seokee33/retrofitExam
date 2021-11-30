package com.sheriffs.retrofitexam;

import com.google.gson.annotations.SerializedName;

public class getTemp {

    @SerializedName("tmp_signal_id")
    String temp_signal_id;

    @SerializedName("current_temp")
    String current_temp;

    @SerializedName("baby_id")
    String baby_id;


    // toString()을 Override 해주지 않으면 객체 주소값을 출력함
    @Override
    public String toString() {
        return "PostResult{" +
                "temp_signal_id=" + temp_signal_id +
                "current_temp=" + current_temp +
                ", baby_id=" + baby_id +
                '}';
    }

}

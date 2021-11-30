package com.sheriffs.retrofitexam;

import com.google.gson.annotations.SerializedName;

public class PostResult {

    @SerializedName("input_id")
    private String input_id;

    @SerializedName("input_pw")
    private String input_pw;

    @SerializedName("input_name")
    private String input_name;

    @SerializedName("input_email")
    private String input_email;

    @SerializedName("input_contact")
    private String input_contact;



    // toString()을 Override 해주지 않으면 객체 주소값을 출력함
    @Override
    public String toString() {
        return "PostResult{" +
                "input_id=" + input_id +
                "input_pw=" + input_pw +
                ", input_name=" + input_name +
                ", input_email='" + input_email + '\'' +
                ", input_contact='" + input_contact + '\'' +
                '}';
    }
}

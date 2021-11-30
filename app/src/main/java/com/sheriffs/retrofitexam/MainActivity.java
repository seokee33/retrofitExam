package com.sheriffs.retrofitexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private String URL = "34.64.212.164:3000";
    private String TAG = "DB";
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getResult();
            }
        });
    }

    private void getResult(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitService service = retrofit.create(RetrofitService.class);
        Call<getTemp> call = service.getTemp("login");

        call.enqueue(new Callback<getTemp>() {
            @Override
            public void onResponse(Call<getTemp> call, Response<getTemp> response) {
                if(response.isSuccessful()){
                    getTemp result = response.body();
                    Log.d(TAG,"onResponse: 성공, 결과\n"+result.toString());
                }else{
                    Log.d(TAG,"onResponse: 실패");
                }
            }

            @Override
            public void onFailure(Call<getTemp> call, Throwable t) {
                Log.d(TAG,"onFailure: "+t.getMessage());
            }
        });
    }




}
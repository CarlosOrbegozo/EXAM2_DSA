package edu.upc.eetac.dsa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    DibaAPI dibaAPI;
    private RecyclerView list;
    Callback<Elements> getAllApi = new Callback<Elements>(){

        @Override
        public void onResponse(Call<Elements> call, Response<Elements> response) {
            if (response.isSuccessful()) {
                Elements data = response.body();
                list.setAdapter(new RecyclerViewAdapter(data));
            }
        }

        @Override
        public void onFailure(Call<Elements> call, Throwable t) {

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (RecyclerView) findViewById(R.id.recyclerView);
        list.setHasFixedSize(true);
        list.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        createDibaAPI();
        dibaAPI.getAllApi().enqueue(getAllApi);
    }

    private void createDibaAPI() {
        Gson gson = new GsonBuilder().create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(DibaAPI.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        dibaAPI = retrofit.create(DibaAPI.class);
    }
}

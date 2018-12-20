package edu.upc.eetac.dsa;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private String token;
    private API dibaAPI;

    private RecyclerViewAdapter recycler;
    private RecyclerView recyclerView;
    TextView ineText;
    TextView nameTownText;
    ImageView image;
    ProgressDialog progressDialog;

    Callback<Cities> getAll = new Callback<Cities>(){

        @Override
        public void onResponse(Call<Cities> call, Response<Cities> response) {
            if (response.isSuccessful()) {
                Cities cities = response.body();

                List<Element> listElements = cities.getElements();

                for(Element e : listElements){
                    Log.i("Nom municipi: " + e.getMunicipiNom(), response.message());
                }
                if(listElements.size() != 0){
                    recycler.addElements(listElements);
                }
                progressDialog.hide();
            }
        }

        @Override
        public void onFailure(Call<Cities> call, Throwable t) {

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recycler = new RecyclerViewAdapter(this);
        recyclerView.setAdapter(recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ineText = findViewById(R.id.ineName);
        nameTownText = findViewById(R.id.municipiName);
        image = findViewById(R.id.escutMunicipi);
        //
        Intent intent = getIntent();

        //Progress loading
        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Loading...");
        progressDialog.setMessage("Waiting for the server");
        progressDialog.setCancelable(false);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.show();

        createDibaAPI();
        dibaAPI.getCities().enqueue(getAll);
    }

    private void createDibaAPI() {
        Gson gson = new GsonBuilder().create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        dibaAPI = retrofit.create(API.class);
    }
    @Override
    protected void onResume() {
        super.onResume();
        if (token != null) {
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK && requestCode == 1) {
            token = data.getStringExtra("token");
        }
    }
}

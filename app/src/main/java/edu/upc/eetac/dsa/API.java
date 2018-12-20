package edu.upc.eetac.dsa;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface API {
    String BASE_URL = "https://do.diba.cat/api/dataset/municipis/format/json/pag-ini/1/pag-fi/";

    @GET("11")
    Call<Cities> getCities();

}

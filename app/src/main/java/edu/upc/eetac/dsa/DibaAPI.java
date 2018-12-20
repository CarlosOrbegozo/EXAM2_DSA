package edu.upc.eetac.dsa;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DibaAPI {
    String BASE_URL = "https://do.diba.cat/api/dataset/municipis/format/json/pag-ini/1/pag-fi/11/";

    /* we need to GET user's profile information:
    - number of followers
    - number of followings
    - user's profile picture
    - list name and picture of his followers

    */
    @GET("")
    Call<Elements> getAllApi();

}

package com.example.pavel.myapplication.clientapi.CryptoCompareAPI;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Pavel on 7/28/2018.
 */

public interface CryptoCompareService {

    @GET("/data/all/coinlist")
    Call<CoinListResponse> getCoinList();

    @GET("/data/price?fsym={coin}&tsyms={currency}")
    Call<Integer> getPrice(@Path("coin") String coin, @Path("currency") String currency);
}

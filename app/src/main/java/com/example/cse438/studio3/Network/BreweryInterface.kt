package com.example.cse438_rest_studio.Network

import com.example.cse438_rest_studio.data.Brewery
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

//interface to denote different calls with arguements
interface BreweryInterface {

    //TODO #4: Create a function signature for accessing breweries by city
    //TODO #5: Create a function signature that provides a search term for breweries
    @GET("breweries/search")
    suspend fun getBreweries():Response<Brewery>


    @GET("breweries")
    suspend fun getBreweriesBySearch(@Query("city") city: String):Response<Brewery>
}
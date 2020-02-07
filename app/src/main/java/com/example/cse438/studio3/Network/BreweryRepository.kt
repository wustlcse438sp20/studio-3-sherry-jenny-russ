package com.example.cse438_rest_studio.Network

import androidx.lifecycle.MutableLiveData
import com.example.cse438_rest_studio.data.Brewery
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import retrofit2.Response

class BreweryRepository {
    val service = ApiClient.makeRetrofitService()
    //TODO #6: Create a function that launches a coroutine for searching by city
    fun getBreweries(resBody: MutableLiveData<Brewery>) {
        CoroutineScope(Dispatchers.IO).launch {
            val response = service.getBreweries()

            withContext(Dispatchers.Main) {
                try{
                    if(response.isSuccessful) {
                        resBody.value = response.body()
                    }
                } catch (e: HttpException) {
                    println("Http error")
                }
            }
        }
    }
    //TODO #7: Create a function that launches a coroutine for searching by a generic term
    fun getBreweriesBySearch(resBody: MutableLiveData<Brewery>, category: String, amount: String) {
        CoroutineScope(Dispatchers.IO).launch {
            val response = service.getBreweriesBySearch(category)

            withContext(Dispatchers.Main) {
                try{
                    if(response.isSuccessful) {
                        resBody.value = response.body()
                    }
                } catch (e: HttpException) {
                    println("Http error")
                }
            }
        }
    }
}
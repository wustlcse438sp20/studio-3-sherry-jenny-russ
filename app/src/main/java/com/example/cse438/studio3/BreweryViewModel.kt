package com.example.cse438.studio3

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.cse438_rest_studio.Network.BreweryRepository
import com.example.cse438_rest_studio.data.Brewery


class BreweryViewModel(application: Application): AndroidViewModel(application) {
    public var breweryList: MutableLiveData<Brewery> = MutableLiveData()
    public var breweryRepository: BreweryRepository = BreweryRepository()

    fun getBrewery() {
        breweryRepository.getBrewery(breweryList)
    }

    fun getQuestionsBySearch(category: String, amount: String) {
        triviaRepository.getQuestionsBySearch(questionList, category, amount)
    }
    //TODO #8: Create a livedata object for tracking breweries

    //TODO #9: Write functions to access the two brewery API calls from the repository

}
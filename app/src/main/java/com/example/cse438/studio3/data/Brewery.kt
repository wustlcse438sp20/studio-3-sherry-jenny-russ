package com.example.cse438_rest_studio.data


    //TODO #3: Generate a data class to represent a brewery based on the JSON output from the API

data class Brewery(
    val id: Int,
    val name: String,
    val brewery_type: String,
    val street: String,
    val city: String,
    val state: String,
    val postal_code: String,
    val country: String,
    val longitude: String,
    val latitude: String,
    val phone: String,
    val website_url: String,
    val updated_at: String,
    val tag_list: Array<String>
)


package com.example.dogfull

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface DogApi {
    @GET
    suspend fun getDogByeBreed (@Url url:String) :Response<ImgBreedDog>
}
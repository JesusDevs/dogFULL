package com.example.dogfull


import androidx.room.Entity
import com.google.gson.annotations.SerializedName
@Entity
data class ImgBreedDog(
    @SerializedName("message")
    val imagenesDOg: List<String> = listOf(),
    @SerializedName("status")
    val status: String = "success"
)
package id.my.okisulton.kotlinretrofit.retrofit

import id.my.okisulton.kotlinretrofit.MainModel
import retrofit2.Call
import retrofit2.http.GET

/**
 *Created by osalimi on 24-09-2020.
 **/
interface ApiEndpoint {
    @GET("photos")
    fun getPhotos(): Call<List<MainModel>>
}
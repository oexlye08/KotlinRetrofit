package id.my.okisulton.kotlinretrofit.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 *Created by osalimi on 24-09-2020.
 **/
object ApiService {
    val BASE_URL: String = "https://jsonplaceholder.typicode.com/"
    val endpoint: ApiEndpoint
        get() {
            val retrofit = Retrofit.Builder()
                .baseUrl( BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit.create(ApiEndpoint::class.java)
        }

}
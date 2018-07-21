package pe.softhy.showartists.entidades.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    companion object {

        var retrofit : Retrofit? = null
        fun getClient(baseUrl : String) = if(retrofit == null) {
            retrofit = Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            retrofit
        } else {
            retrofit
        }
    }

}
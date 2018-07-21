package pe.softhy.showartists.entidades.data.api

import pe.softhy.showartists.entidades.data.pojos.ResponseLogin
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("getDatosLogin")
    fun login(@Query("bd")   escuela: String,
              @Query("user") user   : String,
              @Query("pass") pass   : String): Call<ResponseLogin>

}
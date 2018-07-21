package pe.softhy.showartists.entidades.data.pojos

import com.google.gson.annotations.SerializedName

data class ResponseLogin(

        @field:SerializedName("code")
        val code: Int? = null,

        @field:SerializedName("response")
        val response: Response? = null
)
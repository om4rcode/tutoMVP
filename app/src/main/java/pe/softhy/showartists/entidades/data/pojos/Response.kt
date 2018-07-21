package pe.softhy.showartists.entidades.data.pojos

import com.google.gson.annotations.SerializedName

/**
 * Created by Sebastian on 22/02/2018.
 */
data class Response(

        @field:SerializedName("nombre_completo")
        val nombreCompleto: String? = null,

        @field:SerializedName("id_persona")
        val idPersona: String? = null,

        @field:SerializedName("foto_usuario")
        val fotoUsuario: String? = null,

        @field:SerializedName("msj")
        val msj: String? = null,

        @field:SerializedName("logo")
        val logo: String? = null,

        @field:SerializedName("color")
        val color: String? = null,

        @field:SerializedName("email")
        val email: String? = null,

        @field:SerializedName("cod_familiar")
        val codFamiliar: String? = null
)
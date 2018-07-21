package pe.softhy.showartists.entidades.data.api

class ApiUtiL {

    companion object {

        val BASE_URL : String = "http://store_api.smiledu.pe/service/"
        fun getApiServices() : ApiService? {
            return RetrofitClient.getClient(BASE_URL)?.create(ApiService::class.java)
        }
    }
}
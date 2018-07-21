package pe.softhy.showartists.entidades.login.data

import android.util.Log
import pe.softhy.showartists.entidades.data.api.ApiService
import pe.softhy.showartists.entidades.data.api.ApiUtiL
import pe.softhy.showartists.entidades.data.pojos.ResponseLogin
import pe.softhy.showartists.entidades.login.presenter.ILoginPresenter
import pe.softhy.showartists.entidades.login.presenter.LoginPresenter
import retrofit2.Call

import retrofit2.Callback
import retrofit2.Response

class LoginInteractor(presenter : LoginPresenter) : ILoginInteractor {

    lateinit var ipresenter : ILoginPresenter
    var api : ApiService? = null

    init {
        ipresenter = presenter
    }

    override fun login(email: String, password: String) {

        api = ApiUtiL.getApiServices()
        val call = api?.login("miescuela", email, password)

        Log.d("PRUEBA", email +" "+ password)
        call?.enqueue(object : Callback<ResponseLogin> {

            override fun onFailure(call: Call<ResponseLogin>?, t: Throwable?) {
                Log.d("PRUEBA", t?.printStackTrace().toString() + "error")
            }

            override fun onResponse(call: Call<ResponseLogin>?, response: Response<ResponseLogin>?) {
                if(response?.code() == 200) {
                    var nombre = response?.body()?.response?.nombreCompleto
                    ipresenter.showDialog(nombre.toString())
                } else {
                    Log.d("PRUEBA", response?.errorBody().toString())
                }
            }

        })
    }
}
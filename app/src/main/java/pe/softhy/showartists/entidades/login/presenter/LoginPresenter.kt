package pe.softhy.showartists.entidades.login.presenter

import pe.softhy.showartists.entidades.login.data.ILoginInteractor
import pe.softhy.showartists.entidades.login.data.LoginInteractor
import pe.softhy.showartists.entidades.login.view.ILoginView
import pe.softhy.showartists.entidades.login.view.Login

class LoginPresenter(view : Login) : ILoginPresenter {

    lateinit var intfaceLoginInteractor : ILoginInteractor
    lateinit var intfaceLogin           : ILoginView

    init {
        intfaceLogin = view
        intfaceLoginInteractor = LoginInteractor(this)
    }

    override fun login(email: String, password: String) {
            intfaceLoginInteractor.login(email, password)
    }

    override fun showDialog(result : String) {
        intfaceLogin.showDialog(result)
    }

    override fun hideDialog() {
        intfaceLogin.hideDialog()
    }
}
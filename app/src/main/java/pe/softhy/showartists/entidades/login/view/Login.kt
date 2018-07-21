package pe.softhy.showartists.entidades.login.view

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import pe.softhy.showartists.R
import pe.softhy.showartists.entidades.login.presenter.LoginPresenter

class Login : AppCompatActivity(), ILoginView {

    lateinit var presenter : LoginPresenter

    override fun showDialog(result : String) {
        toast(result)
    }

    override fun hideDialog() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        presenter = LoginPresenter(this)

    }

    fun login(view : View) {
        presenter.login("rmendozat", "123")
    }
}

fun Context.toast(message : String) {
    Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
}

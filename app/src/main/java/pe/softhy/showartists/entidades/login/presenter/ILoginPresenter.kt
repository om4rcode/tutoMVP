package pe.softhy.showartists.entidades.login.presenter

interface ILoginPresenter {

    fun login(email : String, password : String)

    fun showDialog(result : String)

    fun hideDialog()
}
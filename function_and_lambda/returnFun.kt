fun main(){
    println("======= Higher Order Function =======")

    fun createClickListner(buttonName: String): () -> Unit {
        return {
            println("Button '$buttonName' clicked!")
        }
    }

    val loginButtonClick = createClickListner("Login")
    val signUpButtonClick = createClickListner("SignUp")

    loginButtonClick()
    signUpButtonClick()
}
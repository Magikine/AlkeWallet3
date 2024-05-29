
package marjoriemoya.miniguamvvm
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import marjoriemoya.miniguamvvm.databinding.ActivityLoginPageBinding
import marjoriemoya.miniguamvvm.model.UserData

class LoginViewModel :  ViewModel() {




    private lateinit var binding: ActivityLoginPageBinding
    private lateinit var viewModel: LoginViewModel

    //variable que almacena el resultado del login
    val loginResultLiveData = MutableLiveData<Boolean>()

    /**
     * funcion que implementa una corrutina para
     */
    fun login(email: String, password: String) {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val registeredUser = UserData.registerResponse
                if (registeredUser == null && email == "admin@test.cl" && password == "admin") {
                    loginResultLiveData.postValue(true)
                } else if (registeredUser != null && email == registeredUser.email && password == registeredUser.password) {
                    // Si hay un usuario registrado, comprobar si las credenciales coinciden
                    loginResultLiveData.postValue(true)
                } else {
                    loginResultLiveData.postValue(false)
                }

            } catch (e: Exception) {
                //codigo de erorr
                loginResultLiveData.postValue(false)

            }

        }
    }
}
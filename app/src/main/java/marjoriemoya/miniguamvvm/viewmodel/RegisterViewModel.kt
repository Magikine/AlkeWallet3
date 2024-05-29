package marjoriemoya.miniguamvvm.viewmodel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import marjoriemoya.miniguamvvm.model.RegisterRequest
import marjoriemoya.miniguamvvm.model.RegisterResponse

class RegisterViewModel : ViewModel() {

    private val registerRepository = RegisterRepository()

    private val _registerResult = MutableLiveData<RegisterResponse>()
    val registerResponse: LiveData<RegisterResponse> = _registerResult

    fun register(registerRequest: RegisterRequest) {
        viewModelScope.launch {
            val response = registerRepository.register(registerRequest)
            _registerResult.value = response
        }
    }

    class RegisterRepository {
        suspend fun register(registerRequest: RegisterRequest): RegisterResponse {
            // Simulando una llamada a una API con un retardo
            delay(2000)

            // Simulando una respuesta exitosa
            return RegisterResponse(
                registerRequest.first_name,
                registerRequest.last_name,
                registerRequest.email,
                registerRequest.password,
                registerRequest.roleId,
                registerRequest.points,
                null,
                200
            )
        }
    }


}






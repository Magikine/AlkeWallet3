package marjoriemoya.miniguamvvm.view.adapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import marjoriemoya.miniguamvvm.databinding.ActivityHomePageBinding
import marjoriemoya.miniguamvvm.model.ListUserResponse
import marjoriemoya.miniguamvvm.model.UserData


class HomePageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomePageBinding
    private lateinit var imageAdapter: ListUserResponse
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el diseño de la actividad y establecerlo como contenido de la vista
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtener los datos de registro del usuario desde UserData
        val registerResponse = UserData.registerResponse

        // Verificar si hay datos de registro del usuario
        if (registerResponse != null) {

            // Obtener el nombre del usuario desde la respuesta del registro
            val nombre = registerResponse.first_name


        } else {


        }

        // Inicializar el RecyclerView con una lista de imágenes
        val first_name: String?
        val last_name: String?
        val email: String?
        val password: String?
        val roleId: Long?
        val points: Long?
        val error: String?
        val status: Long?


    }
}
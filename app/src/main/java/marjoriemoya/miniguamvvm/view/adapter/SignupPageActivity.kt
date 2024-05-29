package marjoriemoya.miniguamvvm.view.adapter

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import marjoriemoya.miniguamvvm.databinding.ActivitySignupPageBinding
import marjoriemoya.miniguamvvm.model.RegisterRequest
import marjoriemoya.miniguamvvm.model.UserData
import marjoriemoya.miniguamvvm.viewmodel.RegisterViewModel


class SignupPageActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignupPageBinding
    private lateinit var viewModel: RegisterViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el diseño de la actividad y establecerlo como contenido de la vista
        binding = ActivitySignupPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inicializar el ViewModel
        viewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)



        binding.textView2.setOnClickListener {
            val abrirpantallaDos = Intent(this, LoginPageActivity::class.java)
            startActivity(abrirpantallaDos)
            finish()
        }

        // Configurar el OnClickListener para el botón de registro
        binding.btn4.setOnClickListener {
            val firstName = binding.lblNombrePg4.text.toString()
            val lastName = binding.lblApellidoPg4.text.toString()
            val email = binding.lblEmailPg4.toString()
            val password = binding.lblContraseAPg4.text.toString()
            val reEnteredPassword = binding.lblReingresacontraseAPg4.text.toString()

            // Verificar si las contraseñas coinciden
            if (password == reEnteredPassword) {
                val registerRequest = RegisterRequest(firstName, lastName, email, password)
                viewModel.register(registerRequest)
            } else {
                Toast.makeText(this, "El campo de las contraseñas no coinciden", Toast.LENGTH_SHORT).show()
            }

        }

        // Observar la respuesta del registro desde el ViewModel
        viewModel.registerResponse.observe(this, Observer { response ->
            if (response.status?.toInt() == 200) {
                // Registro exitoso
                Toast.makeText(this, "Registro Exitoso", Toast.LENGTH_SHORT).show()

                // Almacenar la respuesta en el objeto UserData
                UserData.registerResponse = response

                // Navegar a la pantalla de inicio de sesión
                val abrirpantallaTres = Intent(this, LoginPageActivity::class.java)
                startActivity(abrirpantallaTres)
                finish()
            } else {
                // Registro fallido
                Toast.makeText(this, "Registro Fallido", Toast.LENGTH_SHORT).show()
                // Puedes mostrar el mensaje de error si lo deseas: response.error
            }
        })


    }
}
package marjoriemoya.miniguamvvm.view.adapter

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import marjoriemoya.miniguamvvm.LoginViewModel
import marjoriemoya.miniguamvvm.databinding.ActivityLoginPageBinding

class LoginPageActivity : AppCompatActivity() {
    // Variable de enlace para acceder a los elementos de la interfaz de usuario
    private lateinit var binding: ActivityLoginPageBinding

    // ViewModel para manejar la lógica de inicio de sesión
    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el diseño de la actividad y establecerlo como contenido de la vista
        binding = ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inicializar el ViewModel
        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        binding.textView2.setOnClickListener {
            val intent = Intent(this, SignupPageActivity::class.java)
            startActivity(intent)
        }

        // Configurar el OnClickListener para el botón de inicio de sesión
        binding.btn4.setOnClickListener {

            // Obtener el correo electrónico y la contraseña ingresados por el usuario
            val email = binding.lblNombrePg4.text.toString()
            val password = binding.txtP2.text.toString()

            // Iniciar sesión llamando al método login del ViewModel
            loginViewModel.login(email, password)
        }
//
        // Observar el resultado del inicio de sesión desde el ViewModel
        loginViewModel.loginResultLiveData.observe(this, Observer { loginResult ->
            if (loginResult) {

                // Si el inicio de sesión es exitoso, abrir la pantalla de acuerdo al correo ingresado
                val email = binding.btn4.text.toString()
                val intent = if (email == "admin@test.cl") {
                    Intent(this, HomePageActivity::class.java)
                } else {
                    Intent(this,HomePageEmptyCaseActivity::class.java)
                }

                startActivity(intent)
                finish() // Finalizar esta actividad después de abrir la pantalla de inicio

            } else {
                // Si el inicio de sesión falla, mostrar un mensaje de error
                Toast.makeText(this, "Inicio de sesión fallido", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
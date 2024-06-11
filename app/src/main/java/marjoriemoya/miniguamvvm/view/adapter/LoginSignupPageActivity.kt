package marjoriemoya.miniguamvvm.view.adapter


import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import marjoriemoya.miniguamvvm.databinding.ActivityLoginSignupPageBinding


class LoginSignupPageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginSignupPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el diseño de la actividad y establecerlo como contenido de la vista
        binding = ActivityLoginSignupPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar el OnClickListener para el botón de registro
        binding.btn4.setOnClickListener {

            // Abrir la pantalla de registro (Cuatro_SignupPageActivity)
            val abrirPantallaCuatro = Intent(this, SignupPageActivity::class.java)
            startActivity(abrirPantallaCuatro)
        }

        // Configurar el OnClickListener para el texto de "Ya tienes una cuenta? Iniciar sesión"
        binding.txt2Pg2.setOnClickListener {

            // Abrir la pantalla de inicio de sesión (Tres_LoginPageActivity)--
            val abrirPantallaTres = Intent(this, LoginPageActivity::class.java)
            startActivity(abrirPantallaTres)
            finish() // Finalizar esta actividad después de abrir la pantalla de inicio de sesión
        }

      //  Rescatando los valores de la pantalla anterior
  val nombre = intent.getStringExtra("nombre")
        val apellido = intent.getStringExtra("apellido")
        val tyc = intent.getBooleanExtra("acepto_tyC", false)
        //Vamos a mostrar el dato en toast
        Toast.makeText(this,
            "Hola $nombre $apellido -- Acepto los tyc $tyc",
            Toast.LENGTH_SHORT)
            .show()


    }
}
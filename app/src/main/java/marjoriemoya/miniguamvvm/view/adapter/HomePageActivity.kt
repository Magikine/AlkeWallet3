package marjoriemoya.miniguamvvm.view.adapter

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import marjoriemoya.miniguamvvm.R
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

        val txt_inicio_pghome = findViewById<TextView>(R.id.txt_inicio_pghome)
        txt_inicio_pghome.setOnClickListener {
            val abrirPantallaDos = Intent(this, LoginSignupPageActivity::class.java)
            startActivity(abrirPantallaDos)

            // Configurar el OnClickListener para el botón de ingresar dinero
            binding.button2.setOnClickListener {

                // Abrir la pantalla de ingresar dinero (Siete_ResquestMoneyActivity)
                val abrirPantallaSiete = Intent(this, ResquestMoneyActivity::class.java)
                startActivity(abrirPantallaSiete)
            }
            // Configurar el OnClickListener para el botón de enviar de dinero
            binding.button.setOnClickListener {

                // Abrir la pantalla de enviar de  dinero (Ocho_SendMoneyActivity)
                val abrirPantallaOcho = Intent(this, SendMoneyActivity::class.java)
                startActivity(abrirPantallaOcho)

                val txt_inicio_pghome = findViewById<TextView>(R.id.txt_inicio_pghome)
                txt_inicio_pghome.setOnClickListener {
                    val abrirPantallaDos = Intent(this, LoginSignupPageActivity::class.java)
                    startActivity(abrirPantallaDos)

                    val imageView4 = findViewById<ImageView>(R.id.imageView4)
                    imageView4.setOnClickListener {
                        val abrirPantallaNueve = Intent(this, ProfilePageActivity::class.java)
                        startActivity(abrirPantallaNueve)
                        finish() // Finalizar esta actividad después de abrir la pantalla de inicio de sesión

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
            }
        }
    }
}


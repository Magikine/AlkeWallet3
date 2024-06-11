package marjoriemoya.miniguamvvm.view.adapter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import marjoriemoya.miniguamvvm.databinding.ActivityHomePageEmptyCaseBinding
import marjoriemoya.miniguamvvm.model.UserData

class HomePageEmptyCaseActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomePageEmptyCaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el diseño de la actividad y establecerlo como contenido de la vista
        binding = ActivityHomePageEmptyCaseBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Configurar el OnClickListener para el botón de ingresar dinero
        binding.button.setOnClickListener {

            // Abrir la pantalla de ingresar dinero (Ocho_SendMoneyActivity)
            val abrirPantallaOcho = Intent(this, SendMoneyActivity::class.java)
            startActivity(abrirPantallaOcho)
        }
        // Configurar el OnClickListener para el botón de enviar de dinero
        binding.button2.setOnClickListener {

            // Abrir la pantalla de enviar de  dinero (Siete_ResquestMoneyActivity)
            val abrirPantallaSiete = Intent(this, ResquestMoneyActivity::class.java)
            startActivity(abrirPantallaSiete)


            finish() // Finalizar esta actividad después de abrir la pantalla de inicio de sesión


            val registerResponse = UserData.registerResponse

            if (registerResponse != null) {
            }
        }
    }
}


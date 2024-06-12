package marjoriemoya.miniguamvvm.view.adapter

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import marjoriemoya.miniguamvvm.R
import marjoriemoya.miniguamvvm.databinding.ActivityResquestMoneyBinding

class ResquestMoneyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResquestMoneyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResquestMoneyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Configurar el OnClickListener para el botón de ingresar dinero
        binding.button8.setOnClickListener {

            // Abrir la pantalla de ingresar dinero (Cinco_HomePageActivity)
            val abrirPantallaCinco = Intent(this, HomePageActivity::class.java)
            startActivity(abrirPantallaCinco)

            val imageView15a =findViewById<ImageView>(R.id.imageView15a)
            imageView15a.setOnClickListener {
                val abrirPantallaSeis = Intent(this, HomePageEmptyCaseActivity::class.java)
                startActivity(abrirPantallaSeis)


            finish() // Finalizar esta actividad después de abrir la pantalla de inicio de sesión
        }

    }
    }
}


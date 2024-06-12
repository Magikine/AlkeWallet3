package marjoriemoya.miniguamvvm.view.adapter

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import marjoriemoya.miniguamvvm.R
import marjoriemoya.miniguamvvm.databinding.ActivitySendMoneyBinding

class SendMoneyActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySendMoneyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySendMoneyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageView15 = findViewById<ImageView>(R.id.imageView15)
        imageView15.setOnClickListener {
            val abrirPantallaSeis = Intent(this, HomePageEmptyCaseActivity::class.java)
            startActivity(abrirPantallaSeis)

            // Configurar el OnClickListener para el botón de enviar de dinero
            binding.button7.setOnClickListener {

                // Abrir la pantalla de enviar de  dinero (Cinco_HomePageActivity)
                val abrirPantallaCinco = Intent(this, HomePageActivity::class.java)
                startActivity(abrirPantallaCinco)


                val imageView15 = findViewById<ImageView>(R.id.imageView15)
                imageView15.setOnClickListener {
                    val abrirPantallaSeis = Intent(this, HomePageEmptyCaseActivity::class.java)
                    startActivity(abrirPantallaSeis)
                    finish() // Finalizar esta actividad después de abrir la pantalla de inicio de sesión

                }
            }
        }
    }
}
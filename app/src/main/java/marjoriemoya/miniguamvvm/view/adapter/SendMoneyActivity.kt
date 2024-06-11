package marjoriemoya.miniguamvvm.view.adapter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import marjoriemoya.miniguamvvm.databinding.ActivitySendMoneyBinding

class SendMoneyActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySendMoneyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySendMoneyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // Configurar el OnClickListener para el botón de enviar de dinero
        binding.button7.setOnClickListener {

            // Abrir la pantalla de enviar de  dinero (Cinco_HomePageActivity)
            val abrirPantallaCinco = Intent(this, HomePageActivity::class.java)
            startActivity(abrirPantallaCinco)


            finish() // Finalizar esta actividad después de abrir la pantalla de inicio de sesión

        }
    }
}
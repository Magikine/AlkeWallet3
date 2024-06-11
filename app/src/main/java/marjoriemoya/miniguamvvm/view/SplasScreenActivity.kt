package marjoriemoya.miniguamvvm.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import marjoriemoya.miniguamvvm.R
import marjoriemoya.miniguamvvm.view.adapter.LoginSignupPageActivity
import java.util.Timer
import java.util.TimerTask

class SplasScreenActivity : AppCompatActivity() {
    private var task: TimerTask? = null
    private var timer: Timer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splas_screen)
        /**
         * Abiendo la pantalla con un click .
         */


        /**
         * Abiendo la pantalla con un timer
         */
        var task: TimerTask? = object : TimerTask() {
            override fun run() {
                val abrirPantallaLogin = Intent(baseContext, LoginSignupPageActivity::class.java)
//                abrirPantallaLogin.putExtra("nombre", "Marjorie")
//                abrirPantallaLogin.putExtra("apellido", "Moya")
//                abrirPantallaLogin.putExtra("acepto_tyC", false)
                startActivity(abrirPantallaLogin)
                finish()
            }
        }

        timer = Timer()
        timer!!.schedule(task, 3000)



    }

    override fun onStart() {
        super.onStart()
        Log.i("Ciclo vida", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Ciclo vida","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Ciclo vida", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Ciclo vida", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Ciclo vida", "onDestroy")
        task?.cancel()
        timer?.cancel()

    }
}
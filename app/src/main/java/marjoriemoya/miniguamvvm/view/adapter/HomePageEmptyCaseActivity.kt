package marjoriemoya.miniguamvvm.view.adapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import marjoriemoya.miniguamvvm.databinding.ActivityHomePageEmptyCaseBinding
import marjoriemoya.miniguamvvm.model.UserData

class HomePageEmptyCaseActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomePageEmptyCaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomePageEmptyCaseBinding.inflate(layoutInflater)
        setContentView(binding.root)



        val registerResponse = UserData.registerResponse

        if (registerResponse != null) {



        }


    }
}
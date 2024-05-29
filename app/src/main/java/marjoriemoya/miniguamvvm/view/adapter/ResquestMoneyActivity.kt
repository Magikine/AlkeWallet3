package marjoriemoya.miniguamvvm.view.adapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import marjoriemoya.miniguamvvm.databinding.ActivityResquestMoneyBinding
import marjoriemoya.miniguamvvm.R

class ResquestMoneyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResquestMoneyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResquestMoneyBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
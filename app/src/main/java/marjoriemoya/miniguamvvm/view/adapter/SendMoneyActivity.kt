package marjoriemoya.miniguamvvm.view.adapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import marjoriemoya.miniguamvvm.databinding.ActivitySendMoneyBinding

class SendMoneyActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySendMoneyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySendMoneyBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
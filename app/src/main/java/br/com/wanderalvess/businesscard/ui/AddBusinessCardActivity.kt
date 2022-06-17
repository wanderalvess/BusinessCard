package br.com.wanderalvess.businesscard.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.wanderalvess.businesscard.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListerners()
    }

    private fun insertListerners() {
        binding.closeBtn.setOnClickListener {
            finish()
        }
        binding.registerBtn.setOnClickListener {
            finish()
        }
    }



}
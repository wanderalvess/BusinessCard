package br.com.wanderalvess.businesscard.ui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import br.com.wanderalvess.businesscard.App
import br.com.wanderalvess.businesscard.R
import br.com.wanderalvess.businesscard.data.BusinessCard
import br.com.wanderalvess.businesscard.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater)}

    private val mainViewModel: MainViewModel by viewModels {
        MainViewModelFactory((application as App).repository)
    }

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
            val businessCard = BusinessCard(
                name = binding.nameTil.editText?.text.toString(),
                companyName = binding.companyNameTil.editText?.text.toString(),
                phone = binding.phoneTil.editText?.text.toString(),
                email = binding.emailTil.editText?.text.toString(),
                customBackground = binding.colorTil.editText?.text.toString(),
            )
            mainViewModel.insert(businessCard)
            Toast.makeText(this, R.string.label_show_sucess, Toast.LENGTH_SHORT)
            finish()
        }
    }



}
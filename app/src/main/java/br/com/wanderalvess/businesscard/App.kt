package br.com.wanderalvess.businesscard

import android.app.Application
import br.com.wanderalvess.businesscard.data.AppDataBase
import br.com.wanderalvess.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy{ AppDataBase.getDataBase(this)}
    val repository by lazy { BusinessCardRepository(database.businessDao())}
}
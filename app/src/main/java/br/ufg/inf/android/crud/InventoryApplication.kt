package br.ufg.inf.android.crud

import android.app.Application
import br.ufg.inf.android.crud.data.AppContainer
import br.ufg.inf.android.crud.data.AppDataContainer

class InventoryApplication : Application() {

    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
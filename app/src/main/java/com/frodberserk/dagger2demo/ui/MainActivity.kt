package com.frodberserk.dagger2demo.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frodberserk.dagger2demo.CoffeeMaker
import com.frodberserk.dagger2demo.R
import com.frodberserk.dagger2demo.components.DaggerMainComponent
import com.frodberserk.dagger2demo.components.MainComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var coffeeMaker: CoffeeMaker

    lateinit var mainComponent: MainComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainComponent = DaggerMainComponent.builder().build()

        coffeeMaker = mainComponent.maker()

        coffeeMaker.brewCoffee()

    }
}
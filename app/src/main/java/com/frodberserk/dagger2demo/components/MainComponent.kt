package com.frodberserk.dagger2demo.components

import com.frodberserk.dagger2demo.CoffeeMaker
import com.frodberserk.dagger2demo.modules.MakeCoffeeModule
import dagger.Component

@Component(modules = [MakeCoffeeModule::class])
interface MainComponent {
    fun maker(): CoffeeMaker
}
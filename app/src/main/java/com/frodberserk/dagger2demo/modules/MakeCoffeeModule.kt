package com.frodberserk.dagger2demo.modules

import com.frodberserk.dagger2demo.Heater
import dagger.Module
import dagger.Provides

@Module(includes = [PumpModule::class])
class MakeCoffeeModule {

    @Provides
    fun provideHeater() = Heater()
}
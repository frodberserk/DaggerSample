package com.frodberserk.dagger2demo.modules

import com.frodberserk.dagger2demo.Pump
import com.frodberserk.dagger2demo.Thermosiphon
import dagger.Binds
import dagger.Module

@Module
abstract class PumpModule {

    @Binds
    abstract fun providePump(t: Thermosiphon): Pump

}
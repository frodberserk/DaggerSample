package com.frodberserk.dagger2demo

import javax.inject.Inject

class Thermosiphon @Inject constructor(h: Heater) : Pump {

    var heater = h

    override fun pump() {
        if (heater.isHeated()) {
            println("Pumping")
        }
    }
}
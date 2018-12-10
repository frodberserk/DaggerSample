package com.frodberserk.dagger2demo

import javax.inject.Inject

class CoffeeMaker @Inject constructor(h: Heater, p: Pump) {

    var heater = h

    var pump = p

    fun brewCoffee() {
        heater.turnOn()
        pump.pump()
        heater.turnOff()
    }
}
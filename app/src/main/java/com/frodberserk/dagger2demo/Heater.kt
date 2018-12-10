package com.frodberserk.dagger2demo

class Heater {

    private var heated = false

    public fun turnOn() {
        println("Turning heater on.")
        heated = true
    }

    public fun turnOff() {
        println("Turning heater off.")
        heated = false
    }

    public fun isHeated() = heated
}
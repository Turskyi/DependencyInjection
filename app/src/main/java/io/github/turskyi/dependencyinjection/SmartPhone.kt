package io.github.turskyi.dependencyinjection

import android.util.Log
import io.github.turskyi.dependencyinjection.Battery
import io.github.turskyi.dependencyinjection.MemoryCard
import io.github.turskyi.dependencyinjection.SIMCard
import javax.inject.Inject

class SmartPhone @Inject constructor(
    private var battery: Battery,
    private val memoryCard: MemoryCard,
    private val simCard: SIMCard
){

    fun makeCall(){
        Log.d("SmartPhone", "making a call......")
    }

    fun setBattery(battery: Battery) {
        this.battery = battery
        Log.d("SmartPhone", "low battery......")
    }

}
package io.github.turskyi.dependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.github.turskyi.dependencyinjection.interfaces.DaggerSmartPhoneComponent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val smartPhoneComponent = DaggerSmartPhoneComponent.create()
        val smartPhone = smartPhoneComponent.makeSmartPhone()

        smartPhone.makeCall()

        smartPhone.setBattery(Battery())


/* replaces  all the code below */


//        val battery = Battery()
//        val memoryCard = MemoryCard()
//
//        val serviceProvider = ServiceProvider()
//
//        // constructor injection
//        val simCard = SIMCard(serviceProvider)
//
//        // constructor injection
//        val smartPhone = SmartPhone(battery, memoryCard, simCard)
//
//
//        // Injection method
//        smartPhone.setBattery(Battery())
//
//        // Injection field
//        // smartPhone.battery = battery
//
//        smartPhone.makeCall()
    }
}

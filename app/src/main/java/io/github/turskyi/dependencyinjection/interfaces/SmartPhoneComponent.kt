package io.github.turskyi.dependencyinjection.interfaces

import io.github.turskyi.dependencyinjection.SmartPhone
import dagger.Component

@Component
interface SmartPhoneComponent {

    fun makeSmartPhone() : SmartPhone

}
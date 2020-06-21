package io.github.turskyi.dependencyinjection

import io.github.turskyi.dependencyinjection.ServiceProvider
import javax.inject.Inject

data class SIMCard @Inject constructor(private val serviceProvider: ServiceProvider)
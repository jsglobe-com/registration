package com.jsglobe.registration.api

import com.jsglobe.registration.api.model.Health
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {
    @GetMapping("/")
    fun health() = Health()
}
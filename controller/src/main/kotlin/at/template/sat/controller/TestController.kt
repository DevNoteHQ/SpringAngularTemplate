package at.template.sat.controller

import at.template.sat.services.TestService
import at.template.sat.api.TestApi
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(private val testService: TestService): TestApi  {
}
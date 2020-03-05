package at.lerning.alp.controller

import at.lerning.alp.services.TestService
import at.lerning.alp.api.TestApi
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(private val testService: TestService): TestApi  {
}
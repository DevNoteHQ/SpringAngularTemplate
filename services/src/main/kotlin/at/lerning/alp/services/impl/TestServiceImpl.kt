package at.lerning.alp.services.impl

import at.lerning.alp.repositories.TestRepository
import at.lerning.alp.services.TestService
import org.springframework.stereotype.Service

@Service
class TestServiceImpl(private val testRepository: TestRepository): TestService {
}
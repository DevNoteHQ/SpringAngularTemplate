package at.template.sat.services.impl

import at.template.sat.repositories.TestRepository
import at.template.sat.services.TestService
import org.springframework.stereotype.Service

@Service
class TestServiceImpl(private val testRepository: TestRepository): TestService {
}
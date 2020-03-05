package at.lerning.alp.repositories

import at.lerning.alp.domain.Test
import org.springframework.data.jpa.repository.JpaRepository

interface TestRepository: JpaRepository<Test, Int> {
}
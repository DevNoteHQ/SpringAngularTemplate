package at.template.sat.repositories

import at.template.sat.domain.Test
import org.springframework.data.jpa.repository.JpaRepository

interface TestRepository: JpaRepository<Test, Int> {
}
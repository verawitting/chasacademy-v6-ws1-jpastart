package se.chasacademy.databaser.jpastart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.chasacademy.databaser.jpastart.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {}

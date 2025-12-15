package se.chasacademy.databaser.jpastart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.chasacademy.databaser.jpastart.models.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {}


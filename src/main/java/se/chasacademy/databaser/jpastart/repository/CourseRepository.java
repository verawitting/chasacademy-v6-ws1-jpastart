package se.chasacademy.databaser.jpastart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.chasacademy.databaser.jpastart.models.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {}


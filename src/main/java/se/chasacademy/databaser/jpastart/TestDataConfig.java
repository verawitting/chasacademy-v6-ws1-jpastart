package se.chasacademy.databaser.jpastart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.chasacademy.databaser.jpastart.models.Course;
import se.chasacademy.databaser.jpastart.models.Student;
import se.chasacademy.databaser.jpastart.models.Teacher;
import se.chasacademy.databaser.jpastart.repository.CourseRepository;
import se.chasacademy.databaser.jpastart.repository.StudentRepository;
import se.chasacademy.databaser.jpastart.repository.TeacherRepository;

@Configuration
public class TestDataConfig {
    @Bean
    CommandLineRunner initData(
            TeacherRepository teacherRepo,
            StudentRepository studentRepo,
            CourseRepository courseRepo
    ){
        return args -> {
          Teacher anna  = new Teacher ("Anna Svensson", "anna@chas.se");
          Teacher bengt = new Teacher ("Bengt Andersson", "bengt@chas.se");

          teacherRepo.save(anna);
          teacherRepo.save(bengt);

          Course java = new Course("Java", "JAVA101");
          Course spring = new Course("Spring", "SPRING101");
          Course js = new Course("JavaScript", "JS101");

          courseRepo.save(java);
          courseRepo.save(spring);
          courseRepo.save(js);

          Student sara = new Student("Sara Malm", "s.sara@chas.se");
          Student lars = new Student("Lars Lind", "s.lars@chas.se");
          Student elfo = new Student("Elf O", "s.elfo@chas.se");
          Student elsa = new Student("Elsa Svensson", "s.elsa@chas.se");

          studentRepo.save(sara);
          studentRepo.save(lars);
          studentRepo.save(elfo);
          studentRepo.save(elsa);

          java.getStudents().add(sara);
          java.getStudents().add(lars);

          spring.getStudents().add(lars);
          spring.getStudents().add(elsa);
          spring.getStudents().add(elfo);

          js.getStudents().add(sara);
          js.getStudents().add(elfo);

          sara.getCourses().add(java);
          sara.getCourses().add(js);
          lars.getCourses().add(java);
          lars.getCourses().add(spring);
          elfo.getCourses().add(js);
          elfo.getCourses().add(spring);
          elsa.getCourses().add(spring);

          courseRepo.save(java);
          courseRepo.save(spring);
          courseRepo.save(js);
        };
    }
}

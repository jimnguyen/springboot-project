package learn.springboot.project;

import learn.springboot.project.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }

    @GetMapping
    public List<Student> hello() {
        return List.of(new Student(1L, "Jim", "jimnguyen@jim.com", LocalDate.of(1992, 10, 26), 28));
    }
}

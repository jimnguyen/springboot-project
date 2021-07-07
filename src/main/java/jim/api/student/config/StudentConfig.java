package jim.api.student.config;

import jim.api.student.model.Student;
import jim.api.student.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        LocalDate jimDob = LocalDate.of(1992, 10, 26);
        LocalDate emilyDob = LocalDate.of(1996, 10, 23);
        LocalDate lebronDob = LocalDate.of(1984, 12, 30);
        return args -> {
            Student jim = new Student(1L, "Jim", "jimnguyen@jim.com", jimDob);
            Student emily = new Student( "Emily", "emilywright@emily.com", emilyDob);
            Student lebron = new Student( "LeBron", "lebron@lebron.com", lebronDob);
            studentRepository.saveAll(List.of(jim, emily, lebron));
        };
    }
}

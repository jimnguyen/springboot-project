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
        LocalDate chanceDob = LocalDate.of(2014, 5, 1);
        LocalDate lebronDob = LocalDate.of(1984, 12, 30);
        return args -> {
            Student jim = new Student(1L, "Jim", "jimnguyen@jim.com", jimDob);
            Student chance = new Student( "Chance", "chance@chance.com", chanceDob);
            Student lebron = new Student( "LeBron", "lebron@lebron.com", lebronDob);
            studentRepository.saveAll(List.of(jim, chance, lebron));
        };
    }
}

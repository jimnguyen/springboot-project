package learn.springboot.project.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        LocalDate dob = LocalDate.of(1992, 10, 26);
        return List.of(new Student(1L, "Jim", "jimnguyen@jim.com", dob, Period.between(dob, LocalDate.now()).getYears()));
    }
}

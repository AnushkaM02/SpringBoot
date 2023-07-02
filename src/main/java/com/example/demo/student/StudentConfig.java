package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2000, 5, 5)
            );
            Student haley = new Student(
                    "Haley",
                    "haley@gmail.com",
                    LocalDate.of(2002, 5, 5)
            );
            repository.saveAll(
                    List.of(alex, haley)
            );
        };
    }
}

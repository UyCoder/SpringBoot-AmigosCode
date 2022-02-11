package com.ahmed.springboot.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

/**
 * @Created: 2/12/2022 01:17
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {


    @GetMapping
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        "Abdulla",
                        "abdulla@gmail.com",
                        LocalDate.of(2000, Month.DECEMBER, 5),
                        21
                )
        );
    }
}

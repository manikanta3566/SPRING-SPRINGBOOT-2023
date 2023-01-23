package com.practice.mvc.SpringMVCProject.Controllers;

import com.practice.mvc.SpringMVCProject.DTO.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/student")
public class StudentController {

    Logger logger = LoggerFactory.getLogger(StudentController.class);

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        System.out.println(student);
        ResponseEntity<Student> response = new ResponseEntity<>(student, HttpStatus.CREATED);
        return response;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = Arrays.asList(
                new Student(1, "ram", "234324", "ram@gmail.com", Student.Type.ONLINE),
                new Student(2, "meena", "23334324", "meena@gmail.com", Student.Type.OFFLINE),
                new Student(3, "sumith", "23784324", "sumith@gmail.com", Student.Type.ONLINE));
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @GetMapping(value = "/filter", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Student>> filterStudents(@RequestParam("id") int id, @RequestParam(value = "type", required = false, defaultValue = "online") String type) {
        List<Student> students = Arrays.asList(
                new Student(1, "ram", "234324", "ram@gmail.com", Student.Type.ONLINE),
                new Student(2, "meena", "23334324", "meena@gmail.com", Student.Type.OFFLINE),
                new Student(3, "sumith", "23784324", "sumith@gmail.com", Student.Type.ONLINE));
        List<Student> filterStudents = students
                .stream()
                .filter(student -> student.getId() == id || student.getType().toString().equalsIgnoreCase(type))
                .collect(Collectors.toList());
        return new ResponseEntity<>(filterStudents, HttpStatus.OK);
    }

    @GetMapping(value = "/{studentid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> getStudentById(@PathVariable("studentid") int id) {
        List<Student> students = Arrays.asList(
                new Student(1, "ram", "234324", "ram@gmail.com", Student.Type.ONLINE),
                new Student(2, "meena", "23334324", "meena@gmail.com", Student.Type.OFFLINE),
                new Student(3, "sumith", "23784324", "sumith@gmail.com", Student.Type.ONLINE));
        Optional<Student> optionalStudent = Optional.ofNullable(students.stream()
                .filter(student -> student.getId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("student not found")));
        logger.info("student -> {} ", optionalStudent.get());
        return new ResponseEntity<>(optionalStudent.get(), HttpStatus.OK);
    }
}

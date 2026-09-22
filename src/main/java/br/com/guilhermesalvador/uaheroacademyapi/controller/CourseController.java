package br.com.guilhermesalvador.uaheroacademyapi.controller;

import br.com.guilhermesalvador.uaheroacademyapi.model.CourseModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @PostMapping
    public String createCourse() {
        return "Course created";
    }

    @GetMapping
    public String listAllCourses() {
        return "Course list";
    }

    @GetMapping("/id")
    public String listCourse() {
        return "Course by id";
    }

    @PutMapping("/id")
    public String updateCourse() {
        return "Course updated";
    }

    @DeleteMapping("/id")
    public String deleteCourse() {
        return "Course deleted";
    }

}

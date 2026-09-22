package br.com.guilhermesalvador.uaheroacademyapi.controller;

import br.com.guilhermesalvador.uaheroacademyapi.model.CourseModel;
import br.com.guilhermesalvador.uaheroacademyapi.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public String createCourse() {
        return "Course created";
    }

    @GetMapping
    public List<CourseModel> listAllCourses() {
        return courseService.listAll();
    }

    @GetMapping("/{id}")
    public CourseModel listCourse(@PathVariable Long id) {
        return courseService.listById(id);
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

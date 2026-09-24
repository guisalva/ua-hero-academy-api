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
    public CourseModel createCourse(@RequestBody CourseModel course) {
        return courseService.create(course);
    }

    @GetMapping
    public List<CourseModel> listAllCourses() {
        return courseService.listAll();
    }

    @GetMapping("/{id}")
    public CourseModel listCourse(@PathVariable Long id) {
        return courseService.listById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteById(id);
    }

    @PutMapping("/id")
    public String updateCourse() {
        return "Course updated";
    }

}

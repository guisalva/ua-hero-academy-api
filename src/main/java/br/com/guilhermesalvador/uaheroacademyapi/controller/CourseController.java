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
    public CourseModel create(@RequestBody CourseModel course) {
        return courseService.create(course);
    }

    @GetMapping
    public List<CourseModel> findAll() {
        return courseService.findAll();
    }

    @GetMapping("/{id}")
    public CourseModel findById(@PathVariable Long id) {
        return courseService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        courseService.deleteById(id);
    }

    @PutMapping("/{id}")
    public CourseModel update(@PathVariable Long id, @RequestBody CourseModel course) {
        return courseService.update(id, course);
    }

}

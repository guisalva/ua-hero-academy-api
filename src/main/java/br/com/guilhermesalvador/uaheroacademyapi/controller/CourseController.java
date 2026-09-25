package br.com.guilhermesalvador.uaheroacademyapi.controller;

import br.com.guilhermesalvador.uaheroacademyapi.dto.CourseDTO;
import br.com.guilhermesalvador.uaheroacademyapi.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody CourseDTO course) {
        CourseDTO createdCourse = courseService.create(course);

        return ResponseEntity.status(HttpStatus.CREATED).body("Course created successfully");
    }

    @GetMapping
    public List<CourseDTO> findAll() {
        return courseService.findAll();
    }

    @GetMapping("/{id}")
    public CourseDTO findById(@PathVariable Long id) {
        return courseService.findById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        if (courseService.findById(id) != null) {
            courseService.deleteById(id);
            return ResponseEntity.ok("Course deleted successfully");
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Course with id " + id + " not found");
    }

    @PutMapping("/{id}")
    public CourseDTO update(@PathVariable Long id, @RequestBody CourseDTO course) {
        return courseService.update(id, course);
    }

}

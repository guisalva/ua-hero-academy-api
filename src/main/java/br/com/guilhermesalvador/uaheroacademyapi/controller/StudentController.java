package br.com.guilhermesalvador.uaheroacademyapi.controller;

import br.com.guilhermesalvador.uaheroacademyapi.model.StudentModel;
import br.com.guilhermesalvador.uaheroacademyapi.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public StudentModel create(@RequestBody StudentModel student) {
        return studentService.create(student);
    }

    @GetMapping
    public List<StudentModel> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public StudentModel findById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @PutMapping("/{id}")
    public StudentModel update(@PathVariable Long id, @RequestBody StudentModel student) {
        return studentService.update(id, student);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        studentService.deleteById(id);
    }

}

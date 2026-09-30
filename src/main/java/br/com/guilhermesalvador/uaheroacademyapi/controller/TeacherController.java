package br.com.guilhermesalvador.uaheroacademyapi.controller;

import br.com.guilhermesalvador.uaheroacademyapi.model.TeacherModel;
import br.com.guilhermesalvador.uaheroacademyapi.service.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping
    public TeacherModel create(@RequestBody TeacherModel teacher) {
        return teacherService.create(teacher);
    }

    @GetMapping
    public List<TeacherModel> findAll() {
        return teacherService.findAll();
    }

    @GetMapping("/{id}")
    public TeacherModel findById(@PathVariable Long id) {
        return teacherService.findById(id);
    }

    @PutMapping("/{id}")
    public TeacherModel update(@PathVariable Long id, @RequestBody TeacherModel teacher) {
        return teacherService.update(id, teacher);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        teacherService.deleteById(id);
    }

}

package br.com.guilhermesalvador.uaheroacademyapi.controller;

import br.com.guilhermesalvador.uaheroacademyapi.model.ClassModel;
import br.com.guilhermesalvador.uaheroacademyapi.service.ClassService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassController {

    private final ClassService classService;

    public ClassController(ClassService classService) {
        this.classService = classService;
    }

    @PostMapping
    public ClassModel create(@RequestBody ClassModel classroom) {
        return classService.create(classroom);
    }

    @GetMapping
    public List<ClassModel> findAll() {
        return classService.findAll();
    }

    @GetMapping("/{id}")
    public ClassModel findById(@PathVariable Long id) {
        return classService.findById(id);
    }

    @PutMapping("/{id}")
    public ClassModel update(@PathVariable Long id, @RequestBody ClassModel classroom) {
        return classService.update(id, classroom);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        classService.delete(id);
    }

}

package br.com.guilhermesalvador.uaheroacademyapi.service;

import br.com.guilhermesalvador.uaheroacademyapi.model.ClassModel;
import br.com.guilhermesalvador.uaheroacademyapi.repository.ClassRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {

    private final ClassRepository classRepository;

    public ClassService(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    public ClassModel create(ClassModel course) {
        return classRepository.save(course);
    }

    public List<ClassModel> findAll() {
        return classRepository.findAll();
    }

    public ClassModel findById(Long id) {
        return classRepository.findById(id).orElse(null);
    }

    public ClassModel update(Long id, ClassModel course) {
        if (classRepository.existsById(id)) {
            course.setId(id);
            return classRepository.save(course);
        }

        return null;
    }

    public void delete(Long id) {
        classRepository.deleteById(id);
    }

}

package br.com.guilhermesalvador.uaheroacademyapi.service;

import br.com.guilhermesalvador.uaheroacademyapi.model.TeacherModel;
import br.com.guilhermesalvador.uaheroacademyapi.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public TeacherModel create(TeacherModel teacher) {
        return teacherRepository.save(teacher);
    }

    public List<TeacherModel> findAll() {
        return teacherRepository.findAll();
    }

    public TeacherModel findById(Long id) {
        return teacherRepository.findById(id).orElse(null);
    }

    public TeacherModel update(Long id, TeacherModel teacher) {
        if (teacherRepository.existsById(id)) {
            teacher.setId(id);
            return teacherRepository.save(teacher);
        }

        return null;
    }

    public void deleteById(Long id) {
        teacherRepository.deleteById(id);
    }

}

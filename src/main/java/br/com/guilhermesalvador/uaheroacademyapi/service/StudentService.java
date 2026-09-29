package br.com.guilhermesalvador.uaheroacademyapi.service;

import br.com.guilhermesalvador.uaheroacademyapi.model.StudentModel;
import br.com.guilhermesalvador.uaheroacademyapi.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentModel create(StudentModel student) {
        return studentRepository.save(student);
    }

    public List<StudentModel> findAll() {
        return studentRepository.findAll();
    }

    public StudentModel findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public StudentModel update(Long id, StudentModel student) {
        if (studentRepository.existsById(id)) {
            student.setId(id);
            return studentRepository.save(student);
        }

        return null;
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

}

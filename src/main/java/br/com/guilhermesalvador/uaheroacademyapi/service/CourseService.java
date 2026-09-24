package br.com.guilhermesalvador.uaheroacademyapi.service;

import br.com.guilhermesalvador.uaheroacademyapi.model.CourseModel;
import br.com.guilhermesalvador.uaheroacademyapi.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public CourseModel create(CourseModel course) {
        return courseRepository.save(course);
    }

    public List<CourseModel> listAll() {
        return courseRepository.findAll();
    }

    public CourseModel listById(Long id) {
        Optional<CourseModel> course = courseRepository.findById(id);

        return course.orElse(null);
    }

    public void deleteById(Long id) {
        courseRepository.deleteById(id);
    }

}

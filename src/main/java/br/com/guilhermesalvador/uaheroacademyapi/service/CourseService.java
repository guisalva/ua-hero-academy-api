package br.com.guilhermesalvador.uaheroacademyapi.service;

import br.com.guilhermesalvador.uaheroacademyapi.dto.CourseDTO;
import br.com.guilhermesalvador.uaheroacademyapi.mapper.CourseMapper;
import br.com.guilhermesalvador.uaheroacademyapi.model.CourseModel;
import br.com.guilhermesalvador.uaheroacademyapi.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseService {

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

    public CourseService(CourseRepository courseRepository, CourseMapper courseMapper) {
        this.courseRepository = courseRepository;
        this.courseMapper = courseMapper;
    }

    public CourseDTO create(CourseDTO courseDTO) {
        CourseModel course = courseMapper.map(courseDTO);
        course = courseRepository.save(course);

        return courseMapper.map(course);
    }

    public List<CourseDTO> findAll() {
        List<CourseModel> courses = courseRepository.findAll();

        return courses.stream()
                .map(courseMapper::map)
                .collect(Collectors.toList());
    }

    public CourseDTO findById(Long id) {
        Optional<CourseModel> course = courseRepository.findById(id);

        return course.map(courseMapper::map).orElse(null);
    }

    public void deleteById(Long id) {
        courseRepository.deleteById(id);
    }

     public CourseDTO update(Long id, CourseDTO courseDTO) {
        Optional<CourseModel> existingCourse = courseRepository.findById(id);

        if (existingCourse.isPresent()) {
            CourseModel updatedCourse = courseMapper.map(courseDTO);
            updatedCourse.setId(id);
            updatedCourse = courseRepository.save(updatedCourse);

            return courseMapper.map(updatedCourse);
        }

        return null;
     }

}

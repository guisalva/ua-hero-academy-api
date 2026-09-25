package br.com.guilhermesalvador.uaheroacademyapi.mapper;

import br.com.guilhermesalvador.uaheroacademyapi.dto.CourseDTO;
import br.com.guilhermesalvador.uaheroacademyapi.model.CourseModel;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {

    public CourseModel map(CourseDTO courseDTO) {
        CourseModel courseModel = new CourseModel();
        courseModel.setId(courseDTO.getId());
        courseModel.setTitle(courseDTO.getTitle());
        courseModel.setDescription(courseDTO.getDescription());
        courseModel.setClasses(courseDTO.getClasses());

        return courseModel;
    }

    public CourseDTO map(CourseModel courseModel) {
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setId(courseModel.getId());
        courseDTO.setTitle(courseModel.getTitle());
        courseDTO.setDescription(courseModel.getDescription());
        courseDTO.setClasses(courseModel.getClasses());

        return courseDTO;
    }

}

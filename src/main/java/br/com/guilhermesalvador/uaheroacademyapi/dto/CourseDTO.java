package br.com.guilhermesalvador.uaheroacademyapi.dto;

import br.com.guilhermesalvador.uaheroacademyapi.model.ClassModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {

    private Long id;
    private String title;
    private String description;
    private List<ClassModel> classes;

}

package br.com.guilhermesalvador.uaheroacademyapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_class")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClassModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int capacity;

    @ManyToOne
    @JoinColumn(name = "course_id")
    @JsonIgnore
    private CourseModel course;

    @OneToOne(mappedBy = "classroom")
    private TeacherModel teacher;

    @OneToMany(mappedBy = "classroom")
    private List<StudentModel> students;
}

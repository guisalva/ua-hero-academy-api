package br.com.guilhermesalvador.uaheroacademyapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, name = "hero_name")
    private String heroName;

    private String quirk;

    private int age;

    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private ClassModel classroom;

}

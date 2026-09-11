package br.com.guilhermesalvador.uaheroacademyapi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_teacher")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String hero_name;

    private String quirk;

    private String specialization;

    private int age;

    private Boolean active;

}

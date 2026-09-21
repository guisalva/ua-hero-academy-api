package br.com.guilhermesalvador.uaheroacademyapi.repository;

import br.com.guilhermesalvador.uaheroacademyapi.model.TeacherModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherModel, Long> {
}

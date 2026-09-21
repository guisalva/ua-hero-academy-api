package br.com.guilhermesalvador.uaheroacademyapi.repository;

import br.com.guilhermesalvador.uaheroacademyapi.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentModel, Long> {
}

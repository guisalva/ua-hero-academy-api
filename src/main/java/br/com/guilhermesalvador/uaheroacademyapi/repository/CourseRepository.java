package br.com.guilhermesalvador.uaheroacademyapi.repository;

import br.com.guilhermesalvador.uaheroacademyapi.model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<CourseModel, Long> {
}

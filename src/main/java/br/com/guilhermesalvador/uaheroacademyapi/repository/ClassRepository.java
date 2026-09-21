package br.com.guilhermesalvador.uaheroacademyapi.repository;

import br.com.guilhermesalvador.uaheroacademyapi.model.ClassModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<ClassModel, Long> {
}

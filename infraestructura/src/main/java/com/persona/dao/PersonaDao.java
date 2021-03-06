package com.persona.dao;

import com.persona.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaDao extends JpaRepository<PersonaEntity, Long> {

    boolean findByNombre(String nombre);

    boolean existsByNombre(String nombre);
}

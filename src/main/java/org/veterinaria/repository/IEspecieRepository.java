package org.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.veterinaria.model.Especie;

public interface IEspecieRepository extends JpaRepository<Especie, Integer> {

}

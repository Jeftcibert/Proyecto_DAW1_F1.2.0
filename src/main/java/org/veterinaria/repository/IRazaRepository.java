package org.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.veterinaria.model.Raza;

public interface IRazaRepository extends JpaRepository<Raza, Integer> {

}

package org.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.veterinaria.model.TipoVacuna;

public interface ITipoVacunaRepository extends JpaRepository<TipoVacuna, Integer> {

}

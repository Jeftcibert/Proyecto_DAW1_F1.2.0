package org.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.veterinaria.model.HistorialClinica;

public interface IHistorialClinicoRepository extends JpaRepository<HistorialClinica, Integer> {

}

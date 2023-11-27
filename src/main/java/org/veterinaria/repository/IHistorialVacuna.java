package org.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.veterinaria.model.HistorialVacuna;

public interface IHistorialVacuna extends JpaRepository<HistorialVacuna, Integer> {

}

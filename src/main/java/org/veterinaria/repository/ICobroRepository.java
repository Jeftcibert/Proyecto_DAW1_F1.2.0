package org.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.veterinaria.model.Cobro;

public interface ICobroRepository extends JpaRepository<Cobro, String> {

}

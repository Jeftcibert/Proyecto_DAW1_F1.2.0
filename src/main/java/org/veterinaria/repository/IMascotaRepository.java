package org.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.veterinaria.model.Mascota;

public interface IMascotaRepository extends JpaRepository<Mascota, Integer> {

}

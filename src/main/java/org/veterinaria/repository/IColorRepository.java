package org.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.veterinaria.model.Color;

public interface IColorRepository extends JpaRepository<Color, Integer> {

}

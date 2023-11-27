package org.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.veterinaria.model.TipoUsuario;

public interface ITipoUsuarioRepository extends JpaRepository<TipoUsuario, Integer> {

}

package org.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.veterinaria.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {

}

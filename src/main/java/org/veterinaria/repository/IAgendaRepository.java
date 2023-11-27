package org.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.veterinaria.model.Agenda;

public interface IAgendaRepository extends JpaRepository<Agenda, Integer> {

}

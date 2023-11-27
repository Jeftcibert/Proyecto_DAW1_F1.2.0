package org.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.veterinaria.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
//	//Buscar un registro  por email y password 
//		Usuario findByuserAndpassword(String usernameUsu , String asswordUsu);

}

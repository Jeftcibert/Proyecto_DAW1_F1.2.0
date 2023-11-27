package org.veterinaria.service;

import org.springframework.stereotype.Service;
import org.veterinaria.model.TipoUsuario;
import org.veterinaria.repository.ITipoUsuarioRepository;


@Service("TipoUsuarioService")
public class TipoUsuarioServiceImp  implements ITIpUsuarioService{

	private ITipoUsuarioRepository us;
	
	@Override
	public Iterable<TipoUsuario> findAll() {
		
		return us.findAll();
	}

}

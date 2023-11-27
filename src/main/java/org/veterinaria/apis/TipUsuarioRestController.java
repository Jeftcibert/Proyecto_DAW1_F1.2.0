package org.veterinaria.apis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.veterinaria.model.TipoUsuario;
import org.veterinaria.repository.ITipoUsuarioRepository;

@RestController
@RequestMapping("/api/TipUsuario")
public class TipUsuarioRestController {
	
	@Autowired
	private ITipoUsuarioRepository us;
	
	@GetMapping(value = "findall" , produces = MimeTypeUtils.APPLICATION_JSON_VALUE)
	public ResponseEntity<Iterable<TipoUsuario>> findAll(){
		try {
			return new  ResponseEntity<Iterable<TipoUsuario>>(us.findAll(),HttpStatus.OK);

		} catch (Exception e) {
			return new  ResponseEntity<Iterable<TipoUsuario>>(HttpStatus.BAD_REQUEST);
		}
	}

}

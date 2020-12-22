package io.github.joaoh4547.cursospring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
public class Clientes {
	
	@GetMapping
	public ResponseEntity<?> test(){
		return ResponseEntity.ok("Esta Funcionando");
	}
	
}

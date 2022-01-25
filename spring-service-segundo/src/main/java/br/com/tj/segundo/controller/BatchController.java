package br.com.tj.segundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class BatchController {

	@GetMapping("exec")
	public String exec() {
		return "Service 2 - Sucesso";
	}

}

package br.com.tj.primeiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class BatchController {

    @Autowired
    private ServletWebServerApplicationContext server;
    
	@GetMapping("exec")
	public String exec() {
		System.out.println(server.getWebServer().getPort());
		return "Service 1 - Sucesso";
	}

}

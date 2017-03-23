package co.com.prue.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import co.com.prue.dto.CiudadDto;
import co.com.prue.service.UbicacionService;

@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	private UbicacionService ubicacionService;
	
	@RequestMapping("/")
	String home() {
		return "redirect:/index.html";
	}
	
	@GetMapping("/get-ciudades")
	@ResponseBody
	List<CiudadDto> getCiudades(){
		return ubicacionService.getCiudades();
	}	
}
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
	
	//@Autowired
	//private TlClimaRepository tlClimaRepository;
	
//	@Autowired
//	private ClimaService climaService;
	
//	@RequestMapping("/")
//	String home() {
//		return "redirect:/index.html";
//	}
	
	@GetMapping("/get-ciudades")
	@ResponseBody
	List<CiudadDto> getCiudades(){
		return ubicacionService.getCiudades();
	}
	
//	@PostMapping("/ciudades/{idCiudad}/clima")
//	@ResponseBody
//	TlClima getCiudades(@PathVariable String idCiudad){
//		TlClima clima = climaService.getClimaByCiudad(idCiudad);
//		return clima;
//	}
	
//	@GetMapping("/springdata")
//	@ResponseBody
//	String testSpringData(){
//
//		List<TlClima> lista = (List<TlClima>) tlClimaRepository.findAll();
//		System.out.println("++++++++++++++++");
//		for (TlClima tlClima : lista) {
//			System.out.println(tlClima.toString());
//		}
//		System.out.println("++++++++++++++++");
//		return "Spring Data";
//	}	
}
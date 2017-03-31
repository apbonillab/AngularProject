package co.com.bancodebogota.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.bancodebogota.dao.TlClimaRepository;
import co.com.bancodebogota.dto.ICiudadDto;
import co.com.bancodebogota.dto.IOcasionDto;
import co.com.bancodebogota.model.TIClima;
import co.com.bancodebogota.model.impl.TlClimaImpl;
import co.com.bancodebogota.service.ClimaService;
import co.com.bancodebogota.service.OcasionService;
import co.com.bancodebogota.service.UbicacionService;

@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	private UbicacionService ubicacionService;
	
	@Autowired
	private OcasionService ocasionesService;
	
	@Autowired
	private TlClimaRepository tlClimaRepository;
	
	@Autowired
	private ClimaService climaService;
	
	
	/**
	 * @return
	 */
	@RequestMapping(value = "/ciudades", method = RequestMethod.GET)
	public DeferredResult<ResponseEntity<String>> getCiudades(){
		
		DeferredResult<ResponseEntity<String>> deferredResult_ = new DeferredResult<ResponseEntity<String>>();
		
		ObjectMapper JSON_MAPPER = new ObjectMapper();
		JSON_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		
		ICiudadDto ciudades_ = ubicacionService.getCiudades();
		
		String jsonDataResponse_ = null;
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", MediaType.APPLICATION_JSON_UTF8_VALUE);//"application/json; charset=utf-8"
		try {
			jsonDataResponse_ = JSON_MAPPER.writeValueAsString(ciudades_);
			headers.setContentLength(jsonDataResponse_.getBytes().length);
		} catch (JsonProcessingException e) {
			
		}
		
		ResponseEntity<String> responseEntity_ =  new ResponseEntity<>(jsonDataResponse_,headers, HttpStatus.OK);
		 
		deferredResult_.setResult(responseEntity_);
		
		return deferredResult_;
	}
	
	
	
	
	@RequestMapping(value = "/ocasion", method = RequestMethod.GET)
	public DeferredResult<ResponseEntity<String>> getOcasiones(){
		
		
		DeferredResult<ResponseEntity<String>> deferredResult_ = new DeferredResult<ResponseEntity<String>>();
		ObjectMapper JSON_MAPPER = new ObjectMapper();
		JSON_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		
		IOcasionDto ocasiones_ = ocasionesService.getOcasiones();
		
		String jsonDataResponse_ = null;
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", MediaType.APPLICATION_JSON_UTF8_VALUE);
		try {
			jsonDataResponse_ = JSON_MAPPER.writeValueAsString(ocasiones_);
			headers.setContentLength(jsonDataResponse_.getBytes().length);//+ 3
			headers.add("Accept-Language", "es-ES,es;q=0.8");
			headers.add("Accept-Encoding", "gzip, deflate, sdch, br");
			//Accept-Encoding:gzip, deflate, sdch, br
		} catch (JsonProcessingException e) {
			
		}
		
		ResponseEntity<String> responseEntity_ =  new ResponseEntity<>(jsonDataResponse_,HttpStatus.OK);
		 
		deferredResult_.setResult(responseEntity_);
		
		return deferredResult_;
	}
	
	@PostMapping("/ciudades/{idCiudad}/clima")
	@ResponseBody
	TIClima getCiudades(@PathVariable String idCiudad){
		TIClima clima = climaService.getClimaByCiudad(idCiudad);
		return clima;
	}
	
	/*
	@GetMapping("/ocasiones")
	@ResponseBody
	List<TIOcasion> getOcasiones(){
		return ocasionesService.getOcasiones();
	}
	*/
	
	
	@GetMapping("/springdata")
	@ResponseBody
	String testSpringData(){

		List<TlClimaImpl> lista = (List<TlClimaImpl>) tlClimaRepository.findAll();
		System.out.println("++++++++++++++++");
		for (TIClima tlClima : lista) {
			System.out.println(tlClima.toString());
		}
		System.out.println("++++++++++++++++");
		return "Spring Data";
	}	
}

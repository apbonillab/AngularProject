package co.com.bancodebogota.controllers;



import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.com.bancodebogota.dto.ICiudadDto;
import co.com.bancodebogota.dto.ICuentaDto;
import co.com.bancodebogota.dto.IOcasionDto;
import co.com.bancodebogota.model.TIClima;

@Controller
@RequestMapping("/")
public class AppController {

//	@Autowired
//	private UbicacionService ubicacionService;
//	
//	@Autowired
//	private OcasionService ocasionesService;
//	
//	@Autowired
//	private TlClimaRepository tlClimaRepository;
	
//	@Autowired
//	private ClimaService climaService;
	
	
	/**
	 * @return
	 */
	@RequestMapping(value = "/ciudades", method = RequestMethod.GET)
	public DeferredResult<ResponseEntity<String>> getCiudades(){
		
		DeferredResult<ResponseEntity<String>> deferredResult_ = new DeferredResult<ResponseEntity<String>>();
		
		ObjectMapper JSON_MAPPER = new ObjectMapper();
		JSON_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		List<ICiudadDto>ciudades = new ArrayList<>();
		ICiudadDto ciudad = new ICiudadDto();
		ciudad.setId(1L);
		ciudad.setNombre("Colombia");
		ciudades.add(ciudad);
		ciudad = new ICiudadDto();
		ciudad.setId(2L);
		ciudad.setNombre("Medellin");
		ciudades.add(ciudad);
		String jsonDataResponse_ = null;
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", MediaType.APPLICATION_JSON_UTF8_VALUE);//"application/json; charset=utf-8"
		try {
			jsonDataResponse_ = JSON_MAPPER.writeValueAsString(ciudades);
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
		IOcasionDto ocasion = new IOcasionDto();
		List<IOcasionDto>ocasiones = new ArrayList<>();
		ocasion.setDescripcion("ocasion 1");
		ocasion.setIdOcasion(1L);
		ocasiones.add(ocasion);
		 ocasion = new IOcasionDto();
		 ocasion.setDescripcion("ocasion 2");
			ocasion.setIdOcasion(2L);
			ocasiones.add(ocasion);
		//IOcasionDto ocasiones_ = ocasionesService.getOcasiones();
		
		String jsonDataResponse_ = null;
		HttpHeaders headers = new HttpHeaders();
		headers.set("Content-Type", MediaType.APPLICATION_JSON_UTF8_VALUE);
		try {
			jsonDataResponse_ = JSON_MAPPER.writeValueAsString(ocasiones);
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
		TIClima clima = null;
		clima.setIdClima(1L);
		return clima;
	}
	
	@PostMapping("/contacto")
	@ResponseBody
	ResponseEntity<String> saveContacto(@RequestBody ICuentaDto cuentadto) throws JSONException, JsonProcessingException {
		ResponseEntity responseEntity;
		ObjectMapper JSON_MAPPER = new ObjectMapper();
		JSON_MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//		TICuentaImpl cuenta = new TICuentaImpl();
//		cuenta.setNombres(cuentadto.getNombres());
//		cuenta.setApellidos(cuentadto.getApellidos());
//		//cuenta.setFechaNacimiento(new Timestamp(cuentadto.getFechaNacimiento()));
//		cuenta.setMail(cuentadto.getMail());
//		cuenta.setUserName(cuentadto.getUserName());
//		cuenta.setFechaNacimientoStr("2013-09-29T18:46:19Z'");
//		
//		cuenta.setPassword("*******");
		Long idCuenta = 5L;
		String jsonDataResponse_ = JSON_MAPPER.writeValueAsString("Bien");
		if (idCuenta > 0) {
			 responseEntity = new ResponseEntity<>(jsonDataResponse_,HttpStatus.ACCEPTED);
		}else{
			responseEntity = new ResponseEntity<>("Error en la creacion", HttpStatus.BAD_REQUEST);
		}
		return responseEntity;

	}
	
	@GetMapping("/users/verify")
	public String activarCuenta(@RequestParam(name="code", required=false)int code,@RequestParam(name="user", required=false)int user){
		return "redirect:/#activacion?code="+code+"&user="+user;
	}
	
	/*
	@GetMapping("/ocasiones")
	@ResponseBody
	List<TIOcasion> getOcasiones(){
		return ocasionesService.getOcasiones();
	}
	*/
	
	
//	@GetMapping("/springdata")
//	@ResponseBody
//	String testSpringData(){
//
//		List<TlClimaImpl> lista = (List<TlClimaImpl>) tlClimaRepository.findAll();
//		System.out.println("++++++++++++++++");
//		for (TIClima tlClima : lista) {
//			System.out.println(tlClima.toString());
//		}
//		System.out.println("++++++++++++++++");
//		return "Spring Data";
//	}	
}

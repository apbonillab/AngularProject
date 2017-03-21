package boots3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Controller
@EnableAutoConfiguration
public class controller1 {

	@RequestMapping(value="/prueba",method=RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<ArrayNode> home() {
       ObjectMapper mapper = new ObjectMapper();
       ObjectNode node = mapper.createObjectNode();
       ArrayNode array = mapper.createArrayNode();
       node.put("id", "01");
       node.put("nombre", "Alexis");
       array.add(node);
       node = mapper.createObjectNode();
       node.put("id", "02");
       node.put("nombre", "Adriana");
       array.add(node);
    	return new ResponseEntity<ArrayNode>(array,HttpStatus.OK);
    }
	
	@RequestMapping(value="/saludo/{name}/{tipo}",method=RequestMethod.GET)
	public ResponseEntity<String>saludo(@PathVariable("name") String name,@PathVariable("tipo") String tipo){
		String saludo="nada";
		if(name.isEmpty()){
			return new ResponseEntity<String>("No pude ser vacio el nombre",HttpStatus.BAD_REQUEST);
		}else if(name == null ){
			return new ResponseEntity<String>("No pude ser null el nombre",HttpStatus.BAD_REQUEST);
		}
		if(tipo.equalsIgnoreCase("01"))
		 saludo = "Buenas tardes_"+name;
		if(tipo.equalsIgnoreCase("02"))
			 saludo = "Buenas dias: "+name;
			
		return new ResponseEntity<String>(saludo,HttpStatus.OK);
	}
	
	
	
	/*@RequestMapping(value="/saludopost/{name}",method=RequestMethod.POST)
	public ResponseEntity<String>saludopost(@PathVariable("name") String name){
		if(name.isEmpty()){
			return new ResponseEntity<String>("No pude ser vacio el nombre",HttpStatus.BAD_REQUEST);
		}else if(name == null ){
			return new ResponseEntity<String>("No pude ser null el nombre",HttpStatus.BAD_REQUEST);
		}
		String saludo = "Buenas tardes_"+name;
		
		return new ResponseEntity<String>(saludo,HttpStatus.OK);
	}*/
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(controller1.class, args);
	}


}

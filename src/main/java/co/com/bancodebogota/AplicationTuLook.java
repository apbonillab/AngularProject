package co.com.bancodebogota;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan
@RefreshScope
public class AplicationTuLook {

	
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(AplicationTuLook.class, args);
	}
	
	/*
	@Bean
	public Jackson2ObjectMapperBuilder objectMapperBuilder()
	{
		Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
		builder.serializationInclusion(JsonInclude.Include.NON_NULL);
		
		return builder;
	}
	
	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(){
	    MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
	    converter.setObjectMapper(objectMapperBuilder().build());
	    converter.setPrettyPrint(true);
	    converter.setDefaultCharset(StandardCharsets.UTF_8);
	    converter.setSupportedMediaTypes(Arrays.asList(MediaType.parseMediaType(MediaType.APPLICATION_JSON_UTF8_VALUE)));
	    return converter;
	}
	*/
}

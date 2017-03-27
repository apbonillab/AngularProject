package co.com.prue.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import co.com.prue.dto.CiudadDto;

@Service
public class UbicacionServiceImpl implements UbicacionService{


	public List<CiudadDto> getCiudades() {
		List<CiudadDto> ciudadDtoList = new ArrayList<CiudadDto>();
		CiudadDto ciudadDtoBogota = new CiudadDto("Bogotá",1L);
		CiudadDto ciudadDtoCali = new CiudadDto("Cali",2L);
		CiudadDto ciudadDtoMedellin = new CiudadDto("Medellín",3L);
		CiudadDto ciudadDtoBarranquilla = new CiudadDto("Barranquilla",4L);
		CiudadDto ciudadDtoBucaramanga = new CiudadDto("Bucaramanga",5L);
		ciudadDtoList.add(ciudadDtoBogota);
		ciudadDtoList.add(ciudadDtoCali);
		ciudadDtoList.add(ciudadDtoMedellin);
		ciudadDtoList.add(ciudadDtoBarranquilla);
		ciudadDtoList.add(ciudadDtoBucaramanga);
		return ciudadDtoList;
	}
}
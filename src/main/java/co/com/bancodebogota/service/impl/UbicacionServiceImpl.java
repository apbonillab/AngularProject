//package co.com.bancodebogota.service.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import co.com.bancodebogota.dao.TICiudadRepository;
//import co.com.bancodebogota.dto.ICiudadDto;
//import co.com.bancodebogota.model.impl.TICiudadImpl;
//import co.com.bancodebogota.service.UbicacionService;
//
//@Service
//public class UbicacionServiceImpl implements UbicacionService{
//	
//	@Autowired
//	private TICiudadRepository tlCiudadRepository;
//	
//	@Autowired
//	private ICiudadDto ciudadDto;
//	
//	@Override
//	public ICiudadDto getCiudades() {
//		ciudadDto.setCiudades((List<TICiudadImpl>) tlCiudadRepository.findAll());
//		
//		return ciudadDto;
//	}
//}

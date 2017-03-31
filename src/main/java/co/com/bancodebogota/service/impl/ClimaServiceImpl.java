//package co.com.bancodebogota.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import co.com.bancodebogota.dao.TlClimaRepository;
//import co.com.bancodebogota.model.TIClima;
//import co.com.bancodebogota.service.ClimaService;
//import co.com.bancodebogota.service.UtilService;
//
//@Service
//public class ClimaServiceImpl implements ClimaService {
//
//	@Autowired
//	UtilService util;
//
//	@Autowired
//	private TlClimaRepository tlClimaRepository;
//
//	@Override
//	public TIClima getClimaByCiudad(String idCiudad) {
//		Long idClima = (long) util.getRandomNumberInRange(1, 3);
//		TIClima clima = tlClimaRepository.findOne(idClima);
//		return clima;
//	}
//
//}

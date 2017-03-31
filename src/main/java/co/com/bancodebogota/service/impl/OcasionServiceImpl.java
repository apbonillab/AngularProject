///**
// * 
// */
//package co.com.bancodebogota.service.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import co.com.bancodebogota.dao.TIOcasionRepository;
//import co.com.bancodebogota.dto.IOcasionDto;
//import co.com.bancodebogota.model.impl.TIOcasionImpl;
//import co.com.bancodebogota.service.OcasionService;
//
///**
// * @author gmorris
// *
// */
//@Service
//public class OcasionServiceImpl implements OcasionService {
//	
//	@Autowired
//	private TIOcasionRepository tlOcasionRepository;
//	
//	@Autowired
//	private IOcasionDto ocasion;
//	
//	/* (non-Javadoc)
//	 * @see co.com.bancodebogota.service.OcasionService#getOcasiones()
//	 */
//	@Override
//	public IOcasionDto getOcasiones() {
//		
//		
//		ocasion.setOcasiones( (List<TIOcasionImpl>) tlOcasionRepository.findAll() );
//		return  ocasion;
//	}
//
//}

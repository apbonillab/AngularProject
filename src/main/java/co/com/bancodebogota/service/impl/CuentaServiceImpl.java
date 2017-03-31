///**
// * 
// */
//package co.com.bancodebogota.service.impl;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import co.com.bancodebogota.dao.TICuentaRepository;
//import co.com.bancodebogota.model.TICuenta;
//import co.com.bancodebogota.model.impl.TICuentaImpl;
//import co.com.bancodebogota.service.CuentaService;
//
///**
// * @author gmorris
// *
// */
//@Service
//public class CuentaServiceImpl implements CuentaService {
//	
//	@Autowired
//	private TICuentaRepository cuentaRepository;
//	
//	
//	/* (non-Javadoc)
//	 * @see co.com.bancodebogota.service.CuentaService#create(co.com.bancodebogota.model.TICuenta)
//	 */
//	@Override
//	public Long create(TICuentaImpl pCuenta) {
//		
//		TICuenta cuenta_ = cuentaRepository.save(pCuenta);
//		return cuenta_.getIdCuenta();
//	}
//
//}

/**
 * 
 */
package co.com.bancodebogota.service;

import co.com.bancodebogota.model.impl.TICuentaImpl;

/**
 * @author gmorris
 *
 */
public interface CuentaService {
	
	/**
	 * @param pCuenta
	 * @return
	 */
	public Long create(TICuentaImpl pCuenta);
}

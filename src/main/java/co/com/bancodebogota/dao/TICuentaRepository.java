/**
 * 
 */
package co.com.bancodebogota.dao;

import org.springframework.data.repository.CrudRepository;

import co.com.bancodebogota.model.impl.TICuentaImpl;

/**
 * @author gmorris
 *
 */
public interface TICuentaRepository extends CrudRepository<TICuentaImpl, Long>{
	
}

/**
 * 
 */
package co.com.bancodebogota.dto.impl;

import org.springframework.stereotype.Service;

import co.com.bancodebogota.dto.IOcasionDto;
import co.com.bancodebogota.model.impl.TIOcasionImpl;

/**
 * @author gmorris
 *
 */
@Service
public class OcasionDto implements  IOcasionDto{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2380570229300249277L;
	
	private java.util.List<TIOcasionImpl> ocasiones;

	/* (non-Javadoc)
	 * @see co.com.bancodebogota.dto.IOcasion#getOcasiones()
	 */
	@Override
	public java.util.List<TIOcasionImpl> getOcasiones() {
		return ocasiones;
	}

	/* (non-Javadoc)
	 * @see co.com.bancodebogota.dto.IOcasion#setOcasiones(java.util.List)
	 */
	@Override
	public void setOcasiones(java.util.List<TIOcasionImpl> ocasiones) {
		this.ocasiones = ocasiones;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	/* (non-Javadoc)
	 * @see co.com.bancodebogota.dto.IOcasion#addOcasion(co.com.bancodebogota.model.TIOcasion)
	 */
	@Override
	public void addOcasion(TIOcasionImpl pOcasion)
	{
		ocasiones.add(pOcasion);
	}
	
}

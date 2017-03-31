package co.com.bancodebogota.dto;

import co.com.bancodebogota.model.impl.TICiudadImpl;

public interface ICiudadDto extends java.io.Serializable{

	/**
	 * @return the ciudades
	 */
	java.util.List<TICiudadImpl> getCiudades();

	/**
	 * @param ciudades the ciudades to set
	 */
	void setCiudades(java.util.List<TICiudadImpl> ciudades);

	void addCiudad(TICiudadImpl pCiudad);

}
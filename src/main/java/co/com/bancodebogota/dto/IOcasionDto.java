package co.com.bancodebogota.dto;

import co.com.bancodebogota.model.impl.TIOcasionImpl;

public interface IOcasionDto extends java.io.Serializable{

	/**
	 * @return the ocasiones
	 */
	java.util.List<TIOcasionImpl> getOcasiones();

	/**
	 * @param ocasiones the ocasiones to set
	 */
	void setOcasiones(java.util.List<TIOcasionImpl> ocasiones);

	void addOcasion(TIOcasionImpl pOcasion);

}
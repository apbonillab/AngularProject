//package co.com.bancodebogota.dto.impl;
//
//import org.springframework.stereotype.Service;
//
//import co.com.bancodebogota.dto.ICiudadDto;
//import co.com.bancodebogota.model.impl.TICiudadImpl;
//
//@Service
//public class CiudadDto implements ICiudadDto {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 6446539478963984799L;
//	private java.util.List<TICiudadImpl> ciudades;
//	
//	public CiudadDto() {
//		super();
//		ciudades = new java.util.ArrayList<TICiudadImpl>();
//	}
//	
//	
//	/* (non-Javadoc)
//	 * @see co.com.bancodebogota.dto.ICiudadDto#getCiudades()
//	 */
//	@Override
//	public java.util.List<TICiudadImpl> getCiudades() {
//		return ciudades;
//	}
//
//
//	/* (non-Javadoc)
//	 * @see co.com.bancodebogota.dto.ICiudadDto#setCiudades(java.util.List)
//	 */
//	@Override
//	public void setCiudades(java.util.List<TICiudadImpl> ciudades) {
//		this.ciudades = ciudades;
//	}
//	
//	/* (non-Javadoc)
//	 * @see co.com.bancodebogota.dto.ICiudadDto#addCiudad(co.com.bancodebogota.model.TICiudad)
//	 */
//	@Override
//	public void addCiudad(TICiudadImpl pCiudad)
//	{
//		ciudades.add(pCiudad);
//	}
//
//
//	
//	
//}
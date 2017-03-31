package co.com.bancodebogota.dto;
//
//import co.com.bancodebogota.model.impl.TICiudadImpl;
//
//public interface ICiudadDto extends java.io.Serializable{
//
//	/**
//	 * @return the ciudades
//	 */
//	java.util.List<TICiudadImpl> getCiudades();
//
//	/**
//	 * @param ciudades the ciudades to set
//	 */
//	void setCiudades(java.util.List<TICiudadImpl> ciudades);
//
//	void addCiudad(TICiudadImpl pCiudad);
//
//}
public class ICiudadDto{
private Long id;
	
	private String nombre;

	
	public ICiudadDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
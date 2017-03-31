package co.com.bancodebogota.dto;
//
//import co.com.bancodebogota.model.impl.TIOcasionImpl;
//
//public interface IOcasionDto extends java.io.Serializable{
//
//	/**
//	 * @return the ocasiones
//	 */
//	java.util.List<TIOcasionImpl> getOcasiones();
//
//	/**
//	 * @param ocasiones the ocasiones to set
//	 */
//	void setOcasiones(java.util.List<TIOcasionImpl> ocasiones);
//
//	void addOcasion(TIOcasionImpl pOcasion);
//
//}

public class IOcasionDto{
	
	
	private Long idOcasion;

	private String descripcion;

	
	public IOcasionDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdOcasion() {
		return idOcasion;
	}

	public void setIdOcasion(Long idOcasion) {
		this.idOcasion = idOcasion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
package co.com.prue.dto;

public class CiudadDto {

	private String nombre;
	private Long id;
	
	public CiudadDto() {
		super();
	}
	
	public CiudadDto(String nombre, Long id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
///**
// * 
// */
//package co.com.bancodebogota.model.impl;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//
//import co.com.bancodebogota.model.TICiudad;
//
///**
// * @author gmorris
// *
// */
//@Entity
//@Table(name = "TL_CIUDAD")
//public class TICiudadImpl implements TICiudad {
//	
//	
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
//	@SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
//	@Column(name = "ID_CIUDAD")
//	private Long id;
//	
//	@Column(name = "DESCRIPCION")
//	private String nombre;
//	
//	/* (non-Javadoc)
//	 * @see co.com.bancodebogota.model.TICiudad#toString()
//	 */
//	@Override
//	public String toString() {
//		return "TlCiudad [idCiudad=" + id + ", Nombre=" + nombre + "]";
//	}
//
//	/* (non-Javadoc)
//	 * @see co.com.bancodebogota.model.TICiudad#getId()
//	 */
//	@Override
//	public Long getId() {
//		return id;
//	}
//
//	/* (non-Javadoc)
//	 * @see co.com.bancodebogota.model.TICiudad#setId(java.lang.Long)
//	 */
//	@Override
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	/* (non-Javadoc)
//	 * @see co.com.bancodebogota.model.TICiudad#getNombre()
//	 */
//	@Override
//	public String getNombre() {
//		return nombre;
//	}
//
//	/* (non-Javadoc)
//	 * @see co.com.bancodebogota.model.TICiudad#setNombre(java.lang.String)
//	 */
//	@Override
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
//	
//}

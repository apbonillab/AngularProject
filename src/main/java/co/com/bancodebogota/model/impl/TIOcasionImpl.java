/**
 * 
 */
package co.com.bancodebogota.model.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import co.com.bancodebogota.model.TIOcasion;

/**
 * @author gmorris
 *
 */
@Entity
@Table(name = "TL_OCASION")
public class TIOcasionImpl implements TIOcasion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	@SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
	@Column(name = "ID_OCASION")
	private Long idOcasion;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	
	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TIOcasion#getIdOcasion()
	 */
	@Override
	public Long getIdOcasion() {
		return idOcasion;
	}

	
	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TIOcasion#setIdOcasion(java.lang.Long)
	 */
	@Override
	public void setIdOcasion(Long idOcasion) {
		this.idOcasion = idOcasion;
	}

	
	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TIOcasion#getDescripcion()
	 */
	@Override
	public String getDescripcion() {
		return descripcion;
	}

	
	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TIOcasion#setDescripcion(java.lang.String)
	 */
	@Override
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}

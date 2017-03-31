/**
 * 
 */
package co.com.bancodebogota.model.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import co.com.bancodebogota.model.TICuenta;

/**
 * @author gmorris
 *
 */
@Entity
@Table(name = "TL_CUENTA")
public class TICuentaImpl implements TICuenta {
	
	@Column(name="ID_CUENTA")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="TL_CUENTA_SQ")
	@SequenceGenerator(name="TL_CUENTA_SQ", sequenceName="TL_CUENTA_SQ")
	private Long idCuenta;

	@Column(name = "NOMBRE")
	private String nombres;
	
	@Column(name = "APELLIDOS")
	private String apellidos;
	
	@Column(name = "USERNAME")
	private String userName;
	
	@Column(name = "MAIL")
	private String mail;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "FECHA_NACIMIENTO")
	private Timestamp fechaNacimiento;
	
	private String fechaNacimientoStr;
	
	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TICuenta#getFechaNacimiento()
	 */
	@Override
	public Timestamp getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	private void setFechaNacimiento(Timestamp fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TICuenta#getFechaNacimientoStr()
	 */
	@Override
	public String getFechaNacimientoStr() {
		return fechaNacimientoStr;
	}

	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TICuenta#setFechaNacimientoStr(java.lang.String)
	 */
	@Override
	public void setFechaNacimientoStr(String fechaNacimientoStr) {
		this.fechaNacimientoStr = fechaNacimientoStr;
		setFechaNacimiento(getFechaTimestamp(fechaNacimientoStr));
	}

	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TICuenta#getIdCuenta()
	 */
	@Override
	public Long getIdCuenta() {
		return idCuenta;
	}

	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TICuenta#setIdCuenta(java.lang.Long)
	 */
	@Override
	public void setIdCuenta(Long idCuenta) {
		this.idCuenta = idCuenta;
	}

	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TICuenta#getNombres()
	 */
	@Override
	public String getNombres() {
		return nombres;
	}

	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TICuenta#setNombres(java.lang.String)
	 */
	@Override
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TICuenta#getApellidos()
	 */
	@Override
	public String getApellidos() {
		return apellidos;
	}

	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TICuenta#setApellidos(java.lang.String)
	 */
	@Override
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TICuenta#getUserName()
	 */
	@Override
	public String getUserName() {
		return userName;
	}

	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TICuenta#setUserName(java.lang.String)
	 */
	@Override
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TICuenta#getMail()
	 */
	@Override
	public String getMail() {
		return mail;
	}

	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TICuenta#setMail(java.lang.String)
	 */
	@Override
	public void setMail(String mail) {
		this.mail = mail;
	}

	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TICuenta#getPassword()
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/* (non-Javadoc)
	 * @see co.com.bancodebogota.model.TICuenta#setPassword(java.lang.String)
	 */
	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	private java.sql.Timestamp getFechaTimestamp(String pFecha) {
		java.sql.Timestamp fecha_ = null;
		if(pFecha != null)
		{
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
			
			try {
				fecha_ = new java.sql.Timestamp(format.parse(pFecha).getTime());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return fecha_;
	}
	
	

}

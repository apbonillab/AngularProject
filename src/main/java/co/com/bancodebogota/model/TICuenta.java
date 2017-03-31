package co.com.bancodebogota.model;

import java.sql.Timestamp;

public interface TICuenta {

	/**
	 * @return the fechaNacimiento
	 */
	Timestamp getFechaNacimiento();

	/**
	 * @return the fechaNacimientoStr
	 */
	String getFechaNacimientoStr();

	/**
	 * @param fechaNacimientoStr the fechaNacimientoStr to set
	 */
	void setFechaNacimientoStr(String fechaNacimientoStr);

	/**
	 * @return the idCuenta
	 */
	Long getIdCuenta();

	/**
	 * @param idCuenta the idCuenta to set
	 */
	void setIdCuenta(Long idCuenta);

	/**
	 * @return the nombres
	 */
	String getNombres();

	/**
	 * @param nombres the nombres to set
	 */
	void setNombres(String nombres);

	/**
	 * @return the apellidos
	 */
	String getApellidos();

	/**
	 * @param apellidos the apellidos to set
	 */
	void setApellidos(String apellidos);

	/**
	 * @return the userName
	 */
	String getUserName();

	/**
	 * @param userName the userName to set
	 */
	void setUserName(String userName);

	/**
	 * @return the mail
	 */
	String getMail();

	/**
	 * @param mail the mail to set
	 */
	void setMail(String mail);

	/**
	 * @return the password
	 */
	String getPassword();

	/**
	 * @param password the password to set
	 */
	void setPassword(String password);

}
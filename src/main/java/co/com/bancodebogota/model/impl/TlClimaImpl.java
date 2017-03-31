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
//import co.com.bancodebogota.model.TIClima;
//
//@Entity
//@Table(name = "TL_CLIMA")
//public class TlClimaImpl implements TIClima {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
//	@SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
//	@Column(name = "ID_CLIMA")
//	private Long idClima;
//
//	@Column(name = "CLIMA")
//	private String clima;
//
//	/* (non-Javadoc)
//	 * @see co.com.bancodebogota.model.TIClima#getIdClima()
//	 */
//	@Override
//	public Long getIdClima() {
//		return idClima;
//	}
//
//	/* (non-Javadoc)
//	 * @see co.com.bancodebogota.model.TIClima#setIdClima(java.lang.Long)
//	 */
//	@Override
//	public void setIdClima(Long idClima) {
//		this.idClima = idClima;
//	}
//
//	/* (non-Javadoc)
//	 * @see co.com.bancodebogota.model.TIClima#getClima()
//	 */
//	@Override
//	public String getClima() {
//		return clima;
//	}
//
//	/* (non-Javadoc)
//	 * @see co.com.bancodebogota.model.TIClima#setClima(java.lang.String)
//	 */
//	@Override
//	public void setClima(String clima) {
//		this.clima = clima;
//	}
//
//	/* (non-Javadoc)
//	 * @see co.com.bancodebogota.model.TIClima#toString()
//	 */
//	@Override
//	public String toString() {
//		return "TlClima [idClima=" + idClima + ", Clima=" + clima + "]";
//	}
//
//}

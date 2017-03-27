package co.com.prue.model;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "TL_CLIMA")
//public class TlClima {
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
//	public Long getIdClima() {
//		return idClima;
//	}
//
//	public void setIdClima(Long idClima) {
//		this.idClima = idClima;
//	}
//
//	public String getClima() {
//		return clima;
//	}
//
//	public void setClima(String clima) {
//		this.clima = clima;
//	}
//
//	@Override
//	public String toString() {
//		return "TlClima [idClima=" + idClima + ", Clima=" + clima + "]";
//	}
//
//}
package co.com.bancodebogota;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.com.bancodebogota.model.impl.TICuentaImpl;
import co.com.bancodebogota.service.CuentaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AplicationTuLook.class })
public class CuentaTest {
	
	@Autowired
	private CuentaService cuentaService;
	
	@Test
	public void test() {
		TICuentaImpl cuenta = new TICuentaImpl() ;
		
		cuenta.setNombres("Pepe");
		cuenta.setApellidos("Cortizona");
		cuenta.setUserName("username");
		cuenta.setMail("mail@bancodebogota.com.co");
		cuenta.setFechaNacimientoStr("2013-09-29T18:46:19Z'");
		
		cuenta.setPassword("*******");
		
		Long idCuenta = cuentaService.create(cuenta);
		
		if(idCuenta == null || idCuenta > 0)
			assert(true);
		else
			fail("No grabo la cuenta.");
	}

}

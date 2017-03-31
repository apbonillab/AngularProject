package co.com.bancodebogota;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.com.bancodebogota.dto.ICiudadDto;
import co.com.bancodebogota.service.UbicacionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AplicationTuLook.class })
public class UbicacionServiceTest {
	
	@Autowired
	private UbicacionService ubicacionService;
	
	@Test
	public void testGetCiudades() {
		ICiudadDto ciudades = ubicacionService.getCiudades();
		
		assertNotNull(ciudades);
		
		if(ciudades != null && ciudades.getCiudades().size()!=5)
			fail("Se esperaban 5 ciudades.");
		
	}
}
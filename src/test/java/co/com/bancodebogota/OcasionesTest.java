package co.com.bancodebogota;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.com.bancodebogota.dto.IOcasionDto;
import co.com.bancodebogota.service.OcasionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AplicationTuLook.class })
public class OcasionesTest {

	@Autowired
	private OcasionService ocasionesService;
	
	@Test
	public void testGetCiudades() {
		IOcasionDto ocasiones_ = ocasionesService.getOcasiones();
		
		assertNotNull(ocasiones_);
		
		if(ocasiones_ != null && ocasiones_.getOcasiones(). size()!=8)
			fail("Se esperaban 8 ocasiones.");
		
	}

}

package co.com.bancodebogota;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.com.bancodebogota.service.UtilService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AplicationTuLook.class })
public class TuLookTest {

	@Autowired
	UtilService util;

	@Test
	public void randomTest() {
		int min = 5;
		int max = 10;
		int random = util.getRandomNumberInRange(min,max);
		boolean condition = random >= min && random <= max;
		assertTrue(condition);
	}

}
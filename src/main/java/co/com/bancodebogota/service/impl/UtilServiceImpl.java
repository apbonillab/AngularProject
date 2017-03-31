package co.com.bancodebogota.service.impl;

import org.springframework.stereotype.Service;

import co.com.bancodebogota.service.UtilService;

@Service
public class UtilServiceImpl implements UtilService {

	@Override
	public int getRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max debe ser mayor que min");
		}

		return (int) (Math.random() * ((max - min) + 1)) + min;
	}

}
package co.com.prue.service;

import org.springframework.stereotype.Service;

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
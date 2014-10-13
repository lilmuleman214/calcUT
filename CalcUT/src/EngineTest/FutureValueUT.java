package EngineTest;

import static org.junit.Assert.*;

import org.junit.Test;

import corePackage.FutureValue;

public class FutureValueUT {

	@Test
	public void testFutureValue() {
		FutureValue test = new FutureValue(10000, 3, 3.25);
		
		assertEquals(11007.03, test.getValue(), 1);
	}

}

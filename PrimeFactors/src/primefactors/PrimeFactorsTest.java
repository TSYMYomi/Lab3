package primefactors;

import static org.junit.Assert.*;
import static primefactors.PrimeFactors.generate;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeFactorsTest {

	private List<Integer> list(Integer ... integers) {
		return Arrays.asList(integers);
	}
	
	@Test
	public void testOne() {
		assertEquals(list(), generate(1));
	}

	@Test
	public void testTwo() throws Exception {
		assertEquals(list(2), generate(2));
	}
}

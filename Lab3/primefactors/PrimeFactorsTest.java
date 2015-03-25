package primefactors;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class PrimeFactorsTest {

	@Test
	public void testOne() {
		assertEquals(list(), PrimeFactors.generate(1));
	}
	
	private List<Integer> list() {
		return Arrays.asList();
	}
}

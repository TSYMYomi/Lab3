import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class PrimeNumbersTest {

	private List<Integer> list(Integer ... integers) {
		return Arrays.asList(integers);
	}
	
	@Test
	public void testOne() {
		assertEquals(list(), PrimeNumbers.primes(1));
	}


}

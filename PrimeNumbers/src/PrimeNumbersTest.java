import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumbersTest {
	private int inputNumber;
	private List<Integer> expectedResult;
	private PrimeNumbers primeNumbers;
	
	
	@Before
	public void initialize() {
		primeNumbers = new PrimeNumbers();
	}
	
	public PrimeNumbersTest(int inputNumber, List<Integer> expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}
	
		
	@Parameterized.Parameters
	public static Collection primeNumberList() {
		  return Arrays.asList(new Object[][] {
			         { 2, list(2) },
			         { 6, list(2, 3, 5) },
			         { 19, list(2, 3, 5, 7, 11, 13, 17) },
			         { 22, list(2, 3, 5, 7, 11, 13, 17, 19) },
			         { 23, list(2, 3, 5, 7, 11, 13, 17, 19) }
			      });
	}
	
	@Test
	public void TestParameterizedPrimeNumber() {
		System.out.println("Parameterized number is " + inputNumber);
		assertEquals(expectedResult, primeNumbers.primes(inputNumber));
	}
	
	private static List<Integer> list(Integer ... integers) {
		return Arrays.asList(integers);
	}

}

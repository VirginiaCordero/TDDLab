package cameronandvirginia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumbersAppTest {

	@Test
	void testPrimeNumber1() {
		//arrange
		int position = 1;
		
		//act
		int actual = PrimeNumberMethod.getNthPrime(position);
		int expected = 2;
		
		//assert
		assertEquals(expected, actual);
		
	}

	@Test
	void testPrimeNumber2() {
		//arrange
		int position = 2;
		
		//act
		int actual = PrimeNumberMethod.getNthPrime(position);
		int expected = 3;
		
		//assert
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testPrimeNumber10() {
		//arrange
		int position = 10;
		
		//act
		int actual = PrimeNumberMethod.getNthPrime(position);
		int expected = 29;
		
		//assert
		assertEquals(expected, actual);
		
	}

	@Test
	void testPrimeNumber11() {
		//arrange
		int position = 18;
		
		//act
		int actual = PrimeNumberMethod.getNthPrime(position);
		int expected = 61;
		
		//assert
		assertEquals(expected, actual);
		
	}
	@Test
	void testPrimeNumber31() {
		//arrange
		int position = 31;
		
		//act
		int actual = PrimeNumberMethod.getNthPrime(position);
		int expected = 113;
		
		//assert
		assertEquals(expected, actual);
		
	}
}

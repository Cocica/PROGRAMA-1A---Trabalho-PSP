package programa1A;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class programa1ATest {
	@Test
	void testAvaliaDist() {
		programa1A teste = new programa1A();
		int ataqueDist[] = new int [] {100,99};
		int defesaDist[] = new int [] {50,1000,200,100,101};
		char result = teste.avaliaDist(ataqueDist,defesaDist,2);
		assertEquals('Y',result);	
	}
	
	@Test
	void testAvaliaDist2() {
		programa1A teste = new programa1A();
		int ataqueDist[] = new int [] {100,101};
		int defesaDist[] = new int [] {50,1000,200,100,101};
		char result = teste.avaliaDist(ataqueDist,defesaDist,2);
		assertEquals('N',result);	
	}
	
	@Test
	void testehFim() {
		programa1A teste = new programa1A();
		int A=0;
		int B=0;
		boolean result = teste.ehFim(A, B);
		assertTrue(result);
	}
	@Test
	void testehFim2() {
		programa1A teste = new programa1A();
		int A=2;
		int B=3;
		boolean result = teste.ehFim(A, B);
		assertFalse(result);
	}
}

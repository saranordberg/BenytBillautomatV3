package automat;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBilletautomat {

	@Test
	public void testSetBilletprisUdenMontørlogin() {

		Billetautomat automat = new Billetautomat();
		automat.setBilletpris(20);
		assertEquals(10, automat.getBilletpris());

	}

	@Test
	public void testSetBilletprisMedMontørlogin() {

		Billetautomat automat = new Billetautomat();
		automat.montørLogin("1234");
		automat.setBilletpris(20);
		assertEquals(20, automat.getBilletpris());

	}

	@Test
	public void testNegativeBeloeb() {

		Billetautomat automat = new Billetautomat();
		automat.indsætPenge(-10);
		assertEquals(0, automat.getBalance());

	}

}

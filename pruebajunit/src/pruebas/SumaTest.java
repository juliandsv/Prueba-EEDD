package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumaTest {

	@Test
	void testSumar() {
		Suma s2= new Suma(2,5);
		System.out.println(s2.Sumar());
	}
	@Test
	void testSumarNegativos() {
		Suma s3= new Suma(-2,-5);
		System.out.println(s3.SumarNegativos());
	}
	@Test
	void testSumarNegativoPositivo() {
		Suma s4= new Suma(-2,9);
		System.out.println(s4.SumarNegativoPositivo());
	}
	

}

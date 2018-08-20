package paqueteMontoEscrito2Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import paqueteMontoEscrito2.MontoEscrito2;


class MontoEscrito2Test extends MontoEscrito2 {

	@Test
	void testUnidad() {
		MontoEscrito2 unidades = new MontoEscrito2();
		String resultadoEsperado = "cero";
		String resultadoObtenido = unidades.calcularUnidad(0);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testDecena() {
		MontoEscrito2 decenas = new MontoEscrito2();
		String resultadoEsperado = "veinte";
		String resultadoObtenido = decenas.calcularDecena(2);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testOnce() {
		MontoEscrito2 onces = new MontoEscrito2();
		String resultadoEsperado = "trece";
		String resultadoObtenido = onces.calcularOnce(13);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testCentena() {
		MontoEscrito2 centenas = new MontoEscrito2();
		String resultadoEsperado = "quinientos";
		String resultadoObtenido = centenas.calcularCentena(5);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}
	
	@Test
	void testConvertir() {
		MontoEscrito2 Convertir = new MontoEscrito2();
		String resultadoEsperado = "dos mil quinientos cincuenta y uno";
		String resultadoObtenido = Convertir.convertir(2551);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	

}

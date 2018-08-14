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

}

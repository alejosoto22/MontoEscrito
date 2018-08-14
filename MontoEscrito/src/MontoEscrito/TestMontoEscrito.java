package MontoEscrito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMontoEscrito {

	@Test
	void testUnidad() {
		TallerMontoEscrito unidades = new TallerMontoEscrito();
		String resultadoEsperado = "cero";
		TallerMontoEscrito resultadoObtenido = unidades.unidad;
		assertEquals(resultadoEsperado,resultadoObtenido);
	}

}

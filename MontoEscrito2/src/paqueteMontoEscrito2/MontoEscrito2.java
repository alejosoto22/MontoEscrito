package paqueteMontoEscrito2;

public class MontoEscrito2 {
	String respuesta;
	
//--------------------------------------------------------------------
	public String calcularUnidad(int numero) {
		
		switch(numero) {
			case 0: respuesta="cero";
			break;
			case 1: respuesta="uno";	
			break;
			case 2: respuesta="dos";	
			break;
			case 3: respuesta="tres";	
			break;
			case 4: respuesta="cuatro";		
			break;
			case 5: respuesta="cinco";	
			break;
			case 6: respuesta="seis";		
			break;
			case 7: respuesta="siete";	
			break;
			case 8: respuesta="ocho";		
			break;
			case 9: respuesta="nueve";		
			break;
				
		}
		
		return respuesta;
	
	}
//------------------------------------------------------------

	public String calcularDecena(int numero) {
		
		switch(numero) {
			case 1: respuesta="diez";	
			break;
			case 2: respuesta="veinte";	
			break;
			case 3: respuesta="treinta";	
			break;
			case 4: respuesta="cuarenta";		
			break;
			case 5: respuesta="cincuenta";	
			break;
			case 6: respuesta="sesenta";		
			break;
			case 7: respuesta="setenta";	
			break;
			case 8: respuesta="ochenta";		
			break;
			case 9: respuesta="noventa";		
			break;
				
		}
		
		return respuesta;
	
	}
//-----------------------------------------------------------
	
	public String calcularOnce(int numero) {
			
			switch(numero) {
				case 11: respuesta="once";	
				break;
				case 12: respuesta="doce";	
				break;
				case 13: respuesta="trece";	
				break;
				case 14: respuesta="catorce";		
				break;
				case 15: respuesta="quince";	
				break;
				case 16: respuesta="dieciseis";		
				break;
				case 17: respuesta="diecisiete";	
				break;
				case 18: respuesta="dieciocho";		
				break;
				case 19: respuesta="diecinueve";		
				break;
					
			}
			
			return respuesta;
		
		}
//------------------------------------------------------------	
	
	public String calcularCentena(int numero) {
		
		switch(numero) {
			case 1: respuesta="ciento";	
			break;
			case 5: respuesta="quinientos";	
			break;
			case 7: respuesta="setecientos";	
			break;
			case 9: respuesta="novecientos";		
			break;
			
		}	
		
		return respuesta;
	}
	
}
		
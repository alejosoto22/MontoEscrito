package paqueteMontoEscrito2;

public class MontoEscrito2 {
	String respuesta;
	String resultado;
	
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
			case 2: respuesta="docientos";	
			break;
			case 3: respuesta="trecientos";	
			break;
			case 4: respuesta="cuatrocientos";	
			break;
			case 5: respuesta="quinientos";	
			break;
			case 6: respuesta="seiscientos";	
			break;
			case 7: respuesta="setecientos";	
			break;
			case 8: respuesta="ochocientos";	
			break;
			case 9: respuesta="novecientos";		
			break;
			
		}	
		
		return respuesta;
	}
//---------------------------------------------------------------------------------
	
	
	
	public String convertirDosDigitos(int numero) {
		int unidadNumero=numero%10;
			
	if((numero/10)==0)	 { resultado=calcularUnidad(numero);}
	if(((numero/10)<10)&&((numero/10)>0)&&(unidadNumero==0)) { resultado=calcularDecena(numero/10);}
	if(((numero/10)<10)&&((numero>10)&&(numero<20))) { resultado=calcularOnce(numero);}
	if(((numero/10)<10)&&(numero>20)&&(numero<100)) { resultado=calcularDecena(numero/10) + " y " + calcularUnidad(unidadNumero);}
	
	return resultado;
	}
//---------------------------------------------------------------------------------------------------------------------------	
	
	public String convertirCentenas(int numero) {
		int centena=numero/100;
		int segundo=((numero/10)%10);
		int primero=numero%10;
		int primeroYSegundo=primero + segundo;
		
		if(((numero/10)>10)&&(numero/10<100)) { 
			if(numero==100) { resultado="cien";}
			
			if((numero!=100)&&((segundo!=0)&&(primero==0))) { resultado=calcularCentena(centena) + " " + calcularDecena(segundo);}
			if((numero!=100)&&((segundo==0)&&(primero!=0))) { resultado=calcularCentena(centena) + " " + calcularUnidad(primero);}
			if((numero!=100)&&(primero!=0)) { resultado=calcularCentena(centena) + " " + calcularDecena(segundo) + " y " + calcularUnidad(primero);}
			
		}
	
	
	
	
	
	
	
};

	
		
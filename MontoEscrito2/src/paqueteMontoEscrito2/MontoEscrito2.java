package paqueteMontoEscrito2;

public class MontoEscrito2 {
	String respuesta;
	String resultado1;
	String resultado2;
	String resultado3;
	String ultimo;
	
	
	
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
			case 2: respuesta="doscientos";	
			break;
			case 3: respuesta="trescientos";	
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
	
public String calcularMiles(int numero) {
		
		switch(numero) {
			case 1: respuesta="mil";	
			break;
			case 2: respuesta="dos mil";	
			break;
			case 3: respuesta="tres mil";	
			break;
			case 4: respuesta="cuatro mil";	
			break;
			case 5: respuesta="cinco mil";	
			break;
			case 6: respuesta="seis mil";	
			break;
			case 7: respuesta="siete mil";	
			break;
			case 8: respuesta="ocho mil";	
			break;
			case 9: respuesta="nueve mil";		
			break;
			
		}	
		
		return respuesta;
	}
	
	
//---------------------------------------------------------------------------------
		
	public String convertir(int numero) {
		int centena=numero/100;
		int segundo=((numero/10)%10);
		int primero=numero%10;
		int dosUltimosDigitos=(numero-((numero/100)*100));
		int tresUltimosDigitos=(numero-((numero/1000)*1000));
		int centenaMil=((numero-((numero/1000)*1000))/100);		
		int decenaEnMiles=(numero-((numero/100)*100))/10;
		
		if((numero/10>=0)&&(numero/10<10)){
			if((numero/10)==0)	 { resultado1=calcularUnidad(numero);}
			if(((numero/10)<10)&&((numero/10)>0)&&(numero%10==0)) { resultado1=calcularDecena(numero/10);}
			
			if(((numero/10)<10)&&((numero>10)&&((numero<20)&&(numero%10!=0)))) { resultado1=calcularOnce(numero);}
			if(((numero/10)<10)&&(numero>20)&&(numero<100)&&(numero%10!=0)) { resultado1=calcularDecena(numero/10) + " y " + calcularUnidad(numero%10);}
			}
		
				
	
		if(((numero/10)>=10)&&(numero/10<100)) { 
			if(numero==100) { resultado2="cien";}
			if((numero!=100)&&((primero==0)&&(segundo==0))) { resultado2=calcularCentena(centena); }
			if((numero!=100)&&(segundo!=0))	{ if((dosUltimosDigitos/10)==0)	 { resultado2=calcularCentena(centena) + " " + calcularUnidad(dosUltimosDigitos);}
											  if(((dosUltimosDigitos/10)<10)&&((dosUltimosDigitos/10)>0)&&(dosUltimosDigitos%10==0)) { resultado2=calcularCentena(centena) + " " + calcularDecena(dosUltimosDigitos/10);}
											  if(((dosUltimosDigitos/10)<10)&&((dosUltimosDigitos>10)&&(dosUltimosDigitos<20)&&(dosUltimosDigitos%10!=0))) { resultado2=calcularCentena(centena) + " " + calcularOnce(dosUltimosDigitos);}
											  if(((dosUltimosDigitos/10)<10)&&(dosUltimosDigitos>20)&&(dosUltimosDigitos<100)&&(numero%10!=0)) { resultado2=calcularCentena(centena) + " " + calcularDecena(dosUltimosDigitos/10) + " y " + calcularUnidad(dosUltimosDigitos%10);}
											}
			if((numero!=100)&&((segundo==0)&&(primero!=0))) {/* if((dosUltimosDigitos/10)==0)	 {*/ resultado2=calcularCentena(centena) + " " + calcularUnidad(primero);}
														//	  if(((dosUltimosDigitos/10)<10)&&((dosUltimosDigitos/10)>0)&&(dosUltimosDigitos%10==0)) { resultado2=calcularCentena(centena) + " " + calcularDecena(dosUltimosDigitos/10);}
														//	  if(((dosUltimosDigitos/10)<10)&&((dosUltimosDigitos>10)&&(dosUltimosDigitos<20))) { resultado2=calcularCentena(centena) + " " + calcularOnce(dosUltimosDigitos);}
														//	  if(((dosUltimosDigitos/10)<10)&&(dosUltimosDigitos>20)&&(dosUltimosDigitos<100)) { resultado2=calcularCentena(centena) + " " + calcularDecena(dosUltimosDigitos/10) + " y " + calcularUnidad(dosUltimosDigitos%10);}
														//	}
		}
		
		
			if(((numero/1000)>0)&&(numero/1000<10)) { if(numero==1000) { resultado3=calcularMiles(numero/1000); }
													  if((numero!=1000)&&(centenaMil==0)&&(decenaEnMiles==0)) { resultado3=calcularMiles(numero/1000) + " " + calcularUnidad(dosUltimosDigitos%10); }
													  if((numero!=1000)&&(centenaMil==0)&&(decenaEnMiles!=0)) { if((dosUltimosDigitos%10)==0)	 { resultado3=calcularMiles(numero/1000) + " " + calcularDecena(decenaEnMiles);}	
																		  										if((dosUltimosDigitos>10)&&(dosUltimosDigitos<20)) { resultado3=calcularMiles(numero/1000) + " " + calcularOnce(dosUltimosDigitos);}
																		  					
																		  										if((dosUltimosDigitos>20)&&(dosUltimosDigitos<100)&&((dosUltimosDigitos%10)!=0)) { resultado3=calcularMiles(numero/1000) + " " + calcularDecena(decenaEnMiles) + " y " + calcularUnidad(dosUltimosDigitos%10);}
																		  		//			if(((dosUltimosDigitos/10)<10)&&(dosUltimosDigitos>20)&&(dosUltimosDigitos<100)) { resultado3=calcularMiles(numero/1000) + " " + calcularDecena(dosUltimosDigitos/10) + " y " + calcularUnidad(dosUltimosDigitos%10);}
													  									  }
													  
											//		  if((numero!=1000)&&(centenaMil==0)&&(decenaEnMiles==0)) { resultado3=calcularMiles(numero/1000) + " " + calcularUnidad(primero);}
													  
											//		  if((numero!=1000)&&(centenaMil!=0)) { if(tresUltimosDigitos==100) { resultado3=calcularMiles(numero/1000) + "cien";}	// VOY AQUI
											//											    if((tresUltimosDigitos!=100)&&((primero==0)&&(segundo==0))) { resultado3=calcularMiles(numero/1000) + calcularCentena(centena); }
											//											    if((tresUltimosDigitos!=100)&&(segundo!=0))	{ if((dosUltimosDigitos/10)==0)	 { resultado3=calcularMiles(numero/1000) + calcularCentena(centena) + " " + calcularUnidad(dosUltimosDigitos);}
											//																			  				  if(((dosUltimosDigitos/10)<10)&&((dosUltimosDigitos/10)>0)&&(dosUltimosDigitos%10==0)) { resultado3=calcularMiles(numero/1000) + calcularCentena(centena) + " " + calcularDecena(dosUltimosDigitos/10);}
											//																			  				  if(((dosUltimosDigitos/10)<10)&&((dosUltimosDigitos>10)&&(dosUltimosDigitos<20))) { resultado3=calcularMiles(numero/1000) + calcularCentena(centena) + " " + calcularOnce(dosUltimosDigitos);}
											//																			  				  if(((dosUltimosDigitos/10)<10)&&(dosUltimosDigitos>20)&&(dosUltimosDigitos<100)) { resultado3=calcularMiles(numero/1000) + calcularCentena(centena) + " " + calcularDecena(dosUltimosDigitos/10) + " y " + calcularUnidad(dosUltimosDigitos%10);}
											//																							}
											//											    if((tresUltimosDigitos!=100)&&((segundo==0)&&(primero!=0))) { if((dosUltimosDigitos/10)==0)	 { resultado3=calcularMiles(numero/1000) + calcularCentena(centena) + " " + calcularUnidad(dosUltimosDigitos);}
											//											   											  				  	  if(((dosUltimosDigitos/10)<10)&&((dosUltimosDigitos/10)>0)&&(dosUltimosDigitos%10==0)) { resultado3=calcularMiles(numero/1000) + calcularCentena(centena) + " " + calcularDecena(dosUltimosDigitos/10);}
											//																							  				  if(((dosUltimosDigitos/10)<10)&&((dosUltimosDigitos>10)&&(dosUltimosDigitos<20))) { resultado3=calcularMiles(numero/1000) + calcularCentena(centena) + " " + calcularOnce(dosUltimosDigitos);}
											//																							  				  if(((dosUltimosDigitos/10)<10)&&(dosUltimosDigitos>20)&&(dosUltimosDigitos<100)) { resultado3=calcularMiles(numero/1000) + calcularCentena(centena) + " " + calcularDecena(dosUltimosDigitos/10) + " y " + calcularUnidad(dosUltimosDigitos%10);}
											//											    															}
											//		  									}
													 }
												
			
				  														
				
								
	
		
		if((numero/10>=0)&&(numero/10<10)) { ultimo=resultado1;	}
		if(((numero/10)>=10)&&(numero/10<100)) {ultimo=resultado2; }
		if(((numero/1000)>0)&&(numero/1000<10)) {ultimo=resultado3; }
	
		return ultimo;
	
	}
//-------------------------------------------------------------------------------------------------------

};

	
		
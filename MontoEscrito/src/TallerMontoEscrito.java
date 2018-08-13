
import java.util.*;

public class TallerMontoEscrito {

	public static void main(String args[]) {
		
		Scanner ingrese = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int numero=ingrese.nextInt();
		//String respuesta;
		
		switch(numero) {
			case 0: 
				System.out.println("cero");
			break;
			case 1: 
				System.out.println("uno");
			break;
			case 2: 
				System.out.println("dos");
			break;
			case 3: 
				System.out.println("tres");
			break;
			case 4: 
				System.out.println("cuatro");
			break;
			case 5: 
				System.out.println("cinco");
			break;
			case 6: 
				System.out.println("seis");
			break;
			case 7: 
				System.out.println("siete");
			break;
			case 8: 
				System.out.println("ocho");
			break;
			case 9: 
				System.out.println("nueve");
			break;
					
			}
		String letra;
		letra=Integer.toString(numero);  
		
		numero=Integer.parseInt(letra);

    
		
		
		System.out.println(numero);
		

	}
}

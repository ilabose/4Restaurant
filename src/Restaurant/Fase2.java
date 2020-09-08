package Restaurant;
import java.util.*;
import java.util.Scanner;
public class Fase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int taglio5, taglio10, taglio20, taglio50, taglio100, taglio200, taglio500;
		double preu_total=0;
		
		String [] arrayMenu=new String[5];
	
		Double [] arrayPrecio=new Double[5];
		
		System.out.println("El menu del dia es:");
		
		for (int i=0; i<5; i++) {
			arrayMenu[0] = "Paella"; 
			arrayMenu[1] = "Calamars";
			arrayMenu[2] = "Bacalla";
			arrayMenu[3] = "Amanida";
			arrayMenu[4] = "Crema catalana";
			arrayPrecio[0] = 15.50;
			arrayPrecio[1] = 12.50;
			arrayPrecio[2] = 10.50;
			arrayPrecio[3] = 5.50;
			arrayPrecio[4] = 3.50;
			System.out.println(arrayMenu[i] +" "+ arrayPrecio[i] + " Euro");
		}
		
		ArrayList<String> pedido = new ArrayList<String>();
		
		Scanner piatti=new Scanner(System.in);
		Scanner risposta=new Scanner(System.in);
		
		Boolean risp=true;
		
		do {
			
			System.out.println("Introducir un plato: "); 
			String cibo=piatti.nextLine();
			pedido.add(cibo);
			System.out.println("Quereis pedir otro plato ? (ingrese 1 para si o 2 para no)");
			int sino=risposta.nextInt();
			if (sino==1){
				risp=true;
				}else{
					if (sino==2)
						risp=false;			

				}
		}while (risp);
		piatti.close();
		risposta.close();
}
}
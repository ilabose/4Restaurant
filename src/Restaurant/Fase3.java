package Restaurant;
import java.util.*;
import java.util.Scanner;
public class Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monetas, taglio5, taglio10, taglio20, taglio50, taglio100, taglio200, taglio500;
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
        
		System.out.println("Vas demanar: ");  
		for(int i = 0; i < pedido.size(); i++) {
			
				if(Arrays.asList(arrayMenu).contains(pedido.get(i))) { 
					
					System.out.println(pedido.get(i) + " ---> " + arrayPrecio[Arrays.asList(arrayMenu).indexOf(pedido.get(i))] + " Euro");	
					
					preu_total = preu_total + arrayPrecio[Arrays.asList(arrayMenu).indexOf(pedido.get(i))];
				} else  {
					System.out.println("El producte que heu demanat(" + pedido.get(i)+ ") no existeix"); 
		}
	
	
	}
    
    System.out.println("El preu total de la vostra comanda és de: "+ preu_total); 
    System.out.println("Es pot pagar amb els següents bitllets: ");

    int total = (int) Math.round(preu_total); 
	
	taglio500 = total/500;
	total = total%500;
	taglio200 = total/200;
	total = total%200;
	taglio100 = total/100;
	total = total%100;
	taglio50 = total/50;
	total = total%50;
	taglio20 = total/20;
	total = total%20;
	taglio10 = total/10;
	total = total%10;
	taglio5 = total/5;
	monetas = total%5;
	
		System.out.println("n° " + taglio500 + " de 500");
		System.out.println("n° " + taglio200 + " de 200");
		System.out.println("n° " + taglio100 + " de 100");
		System.out.println("n° " + taglio50 + " de 50");
		System.out.println("n° " + taglio20 + " de 20");
		System.out.println("n° " + taglio10 + " de 10");
		System.out.println("n° " + taglio5 + " de 5");
		System.out.println("n° " + monetas + " de monedes");
	
	}

}

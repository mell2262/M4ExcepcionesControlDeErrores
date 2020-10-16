import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Restaurante {

	public static void main(String[] args) {
		/*ejercicio:
		El ejercicio consiste en mostrar por consola una carta de un restaurante donde añadiremos diferentes platos y 
		luego escogeremos que queremos para comer. Una vez hecho esto se deberá calcular el precio de la comida el 
		programa nos dirá con qué billetes debemos pagar.
		
		FASE 2
		 Con un bucle for deberemos rellenar los dos arrays anteriormente creados. Añadiremos el nombre del plato y luego
		 el precio. Puedes hacer uso de diccionarios de datos (Java HasMap)
		 Una vez llenos los dos arrays tendremos que mostrarles y preguntar que se quiere para comer, guardaremos la 
		información en una List usando un bucle while.
		 Tendremos que preguntar si se quiere seguir pidiendo comida. Puede utilizar el sistema (1: Si / 0: No), por lo t
		anto deberá crear otro variable int para guardar la información.
		FASE 3
		 Una vez hemos acabado de pedir la comida, tendremos que comparar la lista con el array que hemos hecho al 
		principio. En caso de que la información que hemos introducido en la List coincida con la del array, tendremos 
		que sumar el precio del producto solicitado; en el caso contrario tendremos que mostrar un mensaje que diga que 
		el producto que hemos pedido no existe.

		Recomendaciones: debes validar que los datos introducidos por consola cumplen los requerimientos de formato y
		 extensión por medio del control de excepciones de Java.

		 */ 
		
		int eCinco=5;
		int eDiez=10;
		int eVeinte=20;
		int eCincuenta=50;
		int eCien=100;
		int eDoscientos=200;
		int eQuinientos=500;
		int totalPrice=0;
				
		HashMap<String, Double> menu=new HashMap<String,Double>();
		
		int numMenu=3;
		
		Scanner scan=new Scanner(System.in);
		
		for (int i=0; i<numMenu;i++) {
			System.out.println("ingreso nombre y precio del plato "+i);
			menu.put(scan.next(),scan.nextDouble());
		}
		
		for (String i : menu.keySet() ){
			System.out.println("Plato: "+ i + " Precio: "+ menu.get(i));
		}
		
		int more=1;
		List<String> order = new ArrayList<String>();
		while(more==1) {
			System.out.println("¿Que quiere comer?");
			order.add(scan.next());
			System.out.println("quiere seguir pidiendo comida (1: Si / 0: No)");
			more=scan.nextInt();
		}

	}

}

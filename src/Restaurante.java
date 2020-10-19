import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Restaurante {

	public static void main(String[] args) {
		/*
		 * ejercicio: El ejercicio consiste en mostrar por consola una carta de un
		 * restaurante donde añadiremos diferentes platos y luego escogeremos que
		 * queremos para comer. Una vez hecho esto se deberá calcular el precio de la
		 * comida el programa nos dirá con qué billetes debemos pagar.
		 * 
		 * FASE 3  Una vez hemos acabado de pedir la comida, tendremos que comparar la
		 * lista con el array que hemos hecho al principio. En caso de que la
		 * información que hemos introducido en la List coincida con la del array,
		 * tendremos que sumar el precio del producto solicitado; en el caso contrario
		 * tendremos que mostrar un mensaje que diga que el producto que hemos pedido no
		 * existe.
		 * 
		 * 
		 */

		int eCinco = 5;
		int eDiez = 10;
		int eVeinte = 20;
		int eCincuenta = 50;
		int eCien = 100;
		int eDoscientos = 200;
		int eQuinientos = 500;
		double totalPrice = 0;

		HashMap<String, Double> menu = new HashMap<String, Double>();

		int numMenu = 2;

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < numMenu; i++) {
			System.out.println("ingreso nombre y precio del plato " + i);
			try {
				menu.put(scan.next(), scan.nextDouble());
			} catch (InputMismatchException e) {
				System.out.println("Ingrese un precio valido");
				i--;
			}
		}

		for (String i : menu.keySet()) {
			System.out.println("Plato: " + i + " Precio: " + menu.get(i));
		}

		int more = 1;
		List<String> order = new ArrayList<String>();
		while (more == 1) {
			System.out.println("¿Que quiere comer?");
			String foodCompare = scan.next();
			if (menu.get(foodCompare) == null)
				System.out.println("El producto que ha pedido no existe");
			else {
				order.add(foodCompare);
				totalPrice = totalPrice + menu.get(foodCompare);
			}

			do {
				System.out.println("quiere seguir pidiendo comida (1: Si / 0: No)");
				try {
					more = scan.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Ingrese 1: Si o 0: No");
				}

			} while (more != 0 && more != 1);

		}
		System.out.println("el precio total es "+totalPrice);
		while (totalPrice > 0) {
			if (totalPrice >= eQuinientos) {
				totalPrice = totalPrice - eQuinientos;
				System.out.println("debe pagar con 500");
			} else {
				if (totalPrice >= eDoscientos) {
					totalPrice = totalPrice - eDoscientos;
					System.out.println("debe pagar con 200");
				} else {
					if (totalPrice >= eCien) {
						totalPrice = totalPrice - eCien;
						System.out.println("debe pagar con 100");
					} else {
						if (totalPrice >= eCincuenta) {
							totalPrice = totalPrice - eCincuenta;
							System.out.println("debe pagar con 50");
						} else {
							if (totalPrice >= eVeinte) {
								totalPrice = totalPrice - eVeinte;
								System.out.println("debe pagar con 20");
							} else {
								if (totalPrice >= eDiez) {
									totalPrice = totalPrice - eDiez;
									System.out.println("debe pagar con 10");
								} else {
									totalPrice = totalPrice - eCinco;
									System.out.println("debe pagar con 5");
								}

							}

						}

					}
				}
			}
		}
	}
}

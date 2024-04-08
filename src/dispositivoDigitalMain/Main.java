package dispositivoDigitalMain;

import dispositivoLavadora.Lavadora;
import dispositivoTelevision.Television;

public class Main {
		public static void main(String[] args) {
			
			Lavadora l1 = new Lavadora(40, (double) 648.99, "Balay", (short) 850, (long) 25000, (float) 18.5);
			System.out.println(l1.toString());
			Lavadora l2 = new Lavadora(35, (double) 448.99, "Fagor", (short) 1350, (long) 14000, (float) 12.5);
			System.out.println(l2.toString());
			Lavadora l3 = new Lavadora(35, (double) 548.99, "Ufesa", (short) 500, (long) 20000, (float) 5.5);
			System.out.println(l3.toString());
			Lavadora l4 = new Lavadora(50, (double) 748.99, "Zanussi", (short) 650, (long) 14900, (float) 20);
			System.out.println(l4.toString());
			Television tele1 = new Television(9, (double) 499.90, "Samsung", (short) 220, (byte) 42, 2160, 3840);
			System.out.println(tele1.toString());
			Television tele2 = new Television(6, (double) 299.90, "LG", (short) 188, (byte) 32, 1080, 1920);
			System.out.println(tele2.toString());
			Television t3 = new Television(15, (double) 649.90, "Thompson", (short) 250, (byte) 55, 1440, 2560);
			System.out.println(t3.toString());
			Television t4 = new Television(4, (double) 149.90, "LG", (short) 70, (byte) 22, 720, 1280);
			System.out.println(t4.toString());
			Television.damePixelesTotalesEstaticos(1920, 1080);
			
		}
}


/*
 * Calcula un valor ficticio que mide la fuerza necesaria para funcionar con normalidad a máxima capacidad.
 */

/*
 * en base al valor generado en el método dameNivelFuerza() generamos
 * un valor que podremos aplicar a cualquier instancia de Lavadora y medir su eficiencia.
 */

/*
 * Categorizamos en base al valor de eficiencia arrojado por el metodo previo
 */


/*
 * Mediante un ternario, comprobamos si una instancia de Lavadora permite tambien funcion de secadora en base a sus rpm
 */
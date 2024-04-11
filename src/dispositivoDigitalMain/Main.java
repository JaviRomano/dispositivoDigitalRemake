package dispositivoDigitalMain;

import java.util.ArrayList;
import java.util.List;

import dispositivoLavadora.Lavadora;
import dispositivoPadre.DispositivoDigital;
import dispositivoTelevision.Television;

public class Main {
	public static void main(String[] args) {

		Lavadora l1 = new Lavadora(40, (double) 648.99, "Balay", (short) 850, (long) 25000, (float) 18.5, 0);
		Lavadora l2 = new Lavadora(35, (double) 4400008.99, "Fagor", (short) 1350, (long) 14000, (float) 12.5, 0);
		Lavadora l3 = new Lavadora(35, (double) 548.99, "Ufesa", (short) 500, (long) 20000, (float) 5.5, 0);		
		Lavadora l4 = new Lavadora(50, (double) 748.99, "Zanussi", (short) 650, (long) 14900, (float) 20, 0);
		
		Television t1 = new Television(9, (double) 499.90, "Samsung", (short) 220, (byte) 42, 2160, 3840, 0);		
		Television t2 = new Television(6, (double) 299.90, "LG", (short) 188, (byte) 32, 1080, 1920, 0);		
		Television t3 = new Television(15, (double) 649.90, "Thompson", (short) 250, (byte) 55, 1440, 2560, 0);		
		Television t4 = new Television(4, (double) 149.90, "Panasonic", (short) 70, (byte) 22, 720, 1280, 0);	
		
		System.out.println("____________________________\n Comprobación de instancias\n____________________________");	
		
		System.out.println(l1.toString());		
		System.out.println(l2.toString());
		System.out.println(l3.toString());
		System.out.println(l4.toString());
		System.out.println(t1.toString());		
		System.out.println(t2.toString());
		System.out.println(t3.toString());
		System.out.println(t4.toString());	
		
		System.out.println("\n_____________________________\n DamePixelesTotalesEstaticos\n_____________________________");	
				
		Television.damePixelesTotalesEstaticos(1920, 1080);		
		
		DispositivoDigital[] listaDispositivos = { l1, l2, l3, t1, t2, l4, t3, t4 };			
		
		System.out.println("\n__________\n For-Each\n__________");
		
		for (DispositivoDigital dispositivoDigital : listaDispositivos) {
			System.out.printf("Clase: %s || Precio: %.2f\n", dispositivoDigital.getClass().getSimpleName(),
					dispositivoDigital.getPrecio());
		}	
		
		System.out.println("\n_____\n For\n_____");
		
		for (int i = 0; i < listaDispositivos.length; i++) {
			System.out.println("Dispositivo en For - " + listaDispositivos[i]);
		}
					
		System.out.println("\n_______\n While\n_______");
		int a = 4;
		while (a < 8) {			
			System.out.println("dis - " + listaDispositivos[a].getMarca());
			a++;
		}		
				
		System.out.println("\n__________\n Do-While\n__________");
		
		int b = 7;	
		do {			
			System.out.println("Orden inverso - " + listaDispositivos[b].getMarca() + " - Consumo ["
			+ listaDispositivos[b].getConsumo() + "W]");
			b--;
		} while (b > 0); 			
		System.out.println("\n\n||ChimPúm||");
					
	}
}

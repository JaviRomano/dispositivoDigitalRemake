package dispositivoDigitalMain;

import java.util.ArrayList;
import java.util.List;

import dispositivoLavadora.Lavadora;
import dispositivoPadre.DispositivoDigital;
import dispositivoTelevision.Television;

public class Main {
	public static void main(String[] args) {

		Lavadora l1 = new Lavadora(40, (double) 648.99, "Balay", (short) 850, (long) 25000, (float) 18.5, 0);
		System.out.println(l1.toString());
		Lavadora l2 = new Lavadora(35, (double) 4400008.99, "Fagor", (short) 1350, (long) 14000, (float) 12.5, 0);
		System.out.println(l2.toString());
		Lavadora l3 = new Lavadora(35, (double) 548.99, "Ufesa", (short) 500, (long) 20000, (float) 5.5, 0);
		System.out.println(l3.toString());
		Lavadora l4 = new Lavadora(50, (double) 748.99, "Zanussi", (short) 650, (long) 14900, (float) 20, 0);
		System.out.println(l4.toString());
		Television tele1 = new Television(9, (double) 499.90, "Samsung", (short) 220, (byte) 42, 2160, 3840, 0);
		System.out.println(tele1.toString());
		Television tele2 = new Television(6, (double) 299.90, "LG", (short) 188, (byte) 32, 1080, 1920, 0);
		System.out.println(tele2.toString());
		Television t3 = new Television(15, (double) 649.90, "Thompson", (short) 250, (byte) 55, 1440, 2560, 0);
		System.out.println(t3.toString());
		Television t4 = new Television(4, (double) 149.90, "LG", (short) 70, (byte) 22, 720, 1280, 0);
		System.out.println(t4.toString());
		Television.damePixelesTotalesEstaticos(1920, 1080);

		DispositivoDigital[] listaDispositivos = { l1, l2, l3, tele1, tele2, l4, t3, t4 };
			
		for (DispositivoDigital dispositivoDigital : listaDispositivos) {
			System.out.printf("Clase: %s || Precio: %.2f\n", dispositivoDigital.getClass().getSimpleName(),
					dispositivoDigital.getPrecio());
		}		

		List<DispositivoDigital> arrayListDispositivos = new ArrayList<>(6);
		for (DispositivoDigital dispositivoDigital : listaDispositivos) 
			arrayListDispositivos.add(dispositivoDigital);
				
		
		while (arrayListDispositivos.size() < 4) {
			System.out.println("dis");
		}		
		
	/*	do {
			System.out.println("miau");
		} while (listaDispositivos.length < 10);*/
		
	}
}

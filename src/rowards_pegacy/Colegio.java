package rowards_pegacy;

import java.util.ArrayList;

public class Colegio {
ArrayList <Mago> colegio = new ArrayList <Mago>();
	public void añadir(Mago magoadd) {
		colegio.add(magoadd);
	}
	public void mostrar() {
		for(int i=0;i<colegio.size();i++) {
			System.out.print(colegio.get(i).getNombre()+", ");
			System.out.print(colegio.get(i).getVida()+", ");
			System.out.print(colegio.get(i).getAfinidad()+", ");
			System.out.print(colegio.get(i).getResistencia()+", ");
			System.out.print(colegio.get(i).getNombre());
		}
		
	}
}

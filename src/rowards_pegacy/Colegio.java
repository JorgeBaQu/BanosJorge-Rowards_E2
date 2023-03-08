package rowards_pegacy;

import java.util.ArrayList;

public class Colegio {
ArrayList <Mago> colegio = new ArrayList <Mago>();
	public void añadir(Mago magoadd) {
		colegio.add(magoadd);
	}
	public void mostrar() {
		for(int i=0;i<colegio.size();i++) {
			colegio.get(i).mostrar();
			System.out.println("-------");
			
		}
		
	}
}

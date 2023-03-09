package rowards_pegacy;

import java.util.ArrayList;

public class LibroHechizos {
private  int paginasT;
private static int paginasO;
ArrayList<Hechizo> hechizos = new ArrayList<Hechizo>();
public LibroHechizos() {
	this.paginasT=100;
	
}
public int getPaginasT() {
	return paginasT;
}
public void actualizarPag() {
	int pagO=0;;
	for(int i=0;i<hechizos.size();i++) {
		pagO+=hechizos.get(i).getEspacio();
	}
	paginasO=pagO;
}
public int getPaginasO() {
	return paginasO;
}
public void setPaginasT(int paginasT) {
	this.paginasT = paginasT;
}
public void añadir(Hechizo hechizo) {
	hechizos.add(hechizo);
}
public void mostrar() {
	for(int i=0;i<hechizos.size();i++) {
		System.out.println("("+hechizos.get(i).getNombre()+")");
		System.out.println("Descripcion: "+hechizos.get(i).getDescripcion());
		System.out.println("Resistencia: "+hechizos.get(i).getResistencia());
		System.out.println("Espacio: "+hechizos.get(i).getEspacio());
		System.out.println("Coste: "+hechizos.get(i).getCoste());
	}
	
}
}

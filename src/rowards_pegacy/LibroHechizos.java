package rowards_pegacy;
import java.util.Scanner;
import java.util.ArrayList;

public class LibroHechizos {
private  int paginasT;
private static int paginasO;
ArrayList<Hechizo> hechizos = new ArrayList<Hechizo>();
Scanner sc = new Scanner(System.in);
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
public void modificarH(String nombre){
	for(int i=0;i<hechizos.size();i++) {
		if(nombre.equalsIgnoreCase(hechizos.get(i).getNombre())) {
			System.out.println("Que deseas modificar?: ");
			System.out.println("1- Nombre");
			System.out.println("2- Descripcion");
			System.out.println("3- Resistencia");
			System.out.println("4- Espacio");
			System.out.println("5- Coste");
			int elegir5=sc.nextInt();
			sc.nextLine();
			switch(elegir5) {
				case 1:
					System.out.println("Introduce el nuevo nombre: ");
					hechizos.get(i).setNombre(sc.next());
					break;
				case 2:
					System.out.println("Introduce la nueva descripcion: ");
					hechizos.get(i).setDescripcion(sc.next());
					break;
				case 3:
					System.out.println("Introduce la nueva resistencia: ");
					hechizos.get(i).setResistencia(sc.nextInt());
					break;
				case 4:
					System.out.println("Introduce el nuevo espacio: ");
					hechizos.get(i).setEspacio(sc.nextInt());
					break;
				case 5:
					System.out.println("Introduce el nuevo coste: ");
					hechizos.get(i).setCoste(sc.nextInt());
					break;
			}
		}
	}
}
public void eliminarH(String nombre) {
	boolean comprobar=false;
	int a=0;
	for(int i=0;i<hechizos.size();i++) {
		if(nombre.equalsIgnoreCase(hechizos.get(i).getNombre())) {
			comprobar=true;
			a=i;
		}
	}
	if(comprobar) {
		hechizos.remove(a);
		System.out.println("El hechizo ha sido borrado");
	}
}
}

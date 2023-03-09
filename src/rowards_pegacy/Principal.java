package rowards_pegacy;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int elegir1;
		int elegir2;
		Mago m1 = new Dicendorf("harry",100,30,20,150,12,10,10); 
		Mago m2 = new Meeplepuf("pedro",100,30,20,150,12,10); 
		Mago m3 = new Sleeverin("juan",100,30,20,150,12,10,10); 
		Mago m4 = new Tokenclaw("aaron",100,30,20,150,12,10);
		Colegio colegio = new Colegio();
		colegio.añadir(m1);
		colegio.añadir(m2);
		colegio.añadir(m3);
		colegio.añadir(m4);
		System.out.println("Bienvenido a la plataforma de Rowards Legacy, que desea hacer?");
		//hola	
		do{
			System.out.println("1- Gestionar los magos:");
			System.out.println("2- Gestionar los hechizos:");
			System.out.println("3- Crear un duelo:");
			System.out.println("4- Guardar los datos:");
			System.out.println("5- Salir:");
			elegir1=sc.nextInt();
			sc.nextLine();
			switch (elegir1) {
				case 1:
					System.out.println("1- Mostrar una lista de los magos:");
					System.out.println("2- Obtener informacion de un mago:");
					System.out.println("3- Modificar un mago:");
					System.out.println("4- Añadir un mago:");
					System.out.println("5- Eliminar un mago:");
					System.out.println("6- Mostrar un mago dada su casa y un hechizo que tenga:");
					elegir2 =sc.nextInt();
					sc.nextLine();
					switch (elegir2) {
						case 1:
							colegio.mostrar();
							break;
						case 2:
							System.out.println("Introduce el nombre del mago: ");
							String info= sc.next();
							sc.nextLine();
							colegio.info(info);
							break;
						case 3:
							System.out.println("Introduce el nombre del mago a modificar: ");
							String modif = sc.next();
							sc.nextLine();
							colegio.modif(modif);
							break;
						case 4:
							System.out.println("Introduce el nombre: ");
							String nombre = sc.next();
							sc.nextLine();
							System.out.println("Introduce el nombre: ");
							String nombre = sc.next();
							sc.nextLine();
							System.out.println("de que casa deseas crear el mago?: ");
							System.out.println("1- Dicendorf.");
							System.out.println("2- Tokenclaw.");
							System.out.println("3- Sleeverin.");
							System.out.println("4- Meeplepuf.");
							int elegir3 = sc.nextInt();
							switch(elegir3) {
								case 1:
									break;
								case 2:
									break;
								case 3:
									break;
								case 4:
									break;
							}
							break;
						case 5:
							break;
						case 6:
							break;
					}
					break;
				case 2:
					System.out.println("1- Mostrar una lista de los magos y libros de hechizos:");
					System.out.println("2- Mostrar un libro de hechizos dado un mago:");
					System.out.println("3- Añadir hechizos a un mago:");
					System.out.println("4- Modificar un hechizo:");
					System.out.println("5- Eliminar un hechizo de un mago:");
					
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
			}
		}while(elegir1!=5);
	}

}

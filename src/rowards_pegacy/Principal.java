package rowards_pegacy;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int elegir1;
		int elegir2;
		Colegio colegio = new Colegio();
		//Asi añadí los magos al principio.
		Mago m1 = new Dicendorf("harry",30,300,10,150,120,100,100); 
		Mago m2 = new Meeplepuf("pedro",30,300,10,150,120,100); 
		Mago m3 = new Sleeverin("juan",30,300,10,150,120,100,100); 
		Mago m4 = new Tokenclaw("aaron",30,300,10,150,120,100);
		Hechizo h1 = new Hechizo("s","curar+","Te cura un poco de vida y afinidad",6,7,10);
		Hechizo h2 = new Hechizo("s","curar++","Te cura vida y afinidad",4,2,15);
		Hechizo h3 = new Hechizo("s","curar+++","Te cura mucha vida y afinidad",1,2,20);
		Hechizo h4 = new Hechizo("a","ataque+","Hace poco daño",6,2,10);
		Hechizo h5 = new Hechizo("a","ataque++","Hace daño",4,2,20);
		Hechizo h6 = new Hechizo("a","ataque+++","Hace mucho daño",20,2,30);
		Hechizo h7 = new Hechizo("c","confundir+","Pequeña posibilidad de confundir al enemigo",6,2,10);
		Hechizo h8 = new Hechizo("c","confundir++","Posibilidad de confundir al enemigo",6,2,10);
		Hechizo h9 = new Hechizo("c","confundir+++","Mucha posibilidad de confundir al enemigo",6,2,10);
		Hechizo h10 = new Hechizo("a","Bola de fuego","gana de 1",1,1,1);
		Hechizo h11 = new Hechizo("d","Defensa","te suma 1 de defensa",6,2,10);
		LibroHechizos l1= new LibroHechizos();
		LibroHechizos l2= new LibroHechizos();
		LibroHechizos l3= new LibroHechizos();
		LibroHechizos l4= new LibroHechizos();
		l1.añadir(h1);
		l1.añadir(h6);
		l1.añadir(h9);
		l1.añadir(h11);
		l2.añadir(h5);
		l2.añadir(h7);
		l2.añadir(h11);
		l3.añadir(h2);
		l3.añadir(h4);
		l3.añadir(h8);
		l3.añadir(h11);
		l4.añadir(h3);
		l4.añadir(h4);
		l4.añadir(h7);
		l4.añadir(h11);
		m1.setLibro(l1);
		m2.setLibro(l3);
		m3.setLibro(l2);
		m4.setLibro(l4);
		colegio.añadir(m1);
		colegio.añadir(m2);
		colegio.añadir(m3);
		colegio.añadir(m4);
		

		System.out.println("Bienvenido a la plataforma de Rowards Legacy, que desea hacer?");
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
							System.out.println("Introduce la vida: ");
							int vida = sc.nextInt();
							sc.nextLine();
							System.out.println("Introduce la afinidad: ");
							int afinidad = sc.nextInt();
							sc.nextLine();
							System.out.println("Introduce la resistencia: ");
							int resistencia = sc.nextInt();
							sc.nextLine();
							System.out.println("Introduce el plomo: ");
							int plomo = sc.nextInt();
							sc.nextLine();
							System.out.println("De que casa deseas crear el mago?: ");
							System.out.println("1- Dicendorf.");
							System.out.println("2- Tokenclaw.");
							System.out.println("3- Sleeverin.");
							System.out.println("4- Meeplepuf.");
							int elegir3 = sc.nextInt();
							sc.nextLine();
							switch(elegir3) {
								case 1:
									System.out.println("Introduce la predisposicion");
									int predisposicion = sc.nextInt();
									System.out.println("Introduce la inconsciencia");
									int inconsciencia = sc.nextInt();
									System.out.println("Introduce el protagonismo");
									int protagonismo = sc.nextInt();
									Mago anadirD = new Dicendorf(nombre,vida,afinidad,resistencia,plomo,predisposicion,inconsciencia,protagonismo);
									colegio.añadir2(anadirD);
									break;
								case 2:
									System.out.println("Introduce la eficiencia");
									int eficiencia = sc.nextInt();
									System.out.println("Introduce el honor");
									int honor = sc.nextInt();
									Mago anadirM = new Meeplepuf(nombre,vida,afinidad,resistencia,plomo,eficiencia,honor);
									colegio.añadir2(anadirM);
									break;
								case 3:
									System.out.println("Introduce la sigilo");
									int sigilo = sc.nextInt();
									System.out.println("Introduce el venenoso");
									int venenoso = sc.nextInt();
									System.out.println("Introduce el hablar");
									int hablar = sc.nextInt();
									Mago anadirS = new Sleeverin(nombre,vida,afinidad,resistencia,plomo,sigilo,venenoso,hablar);
									colegio.añadir2(anadirS);
									break;
								case 4:
									System.out.println("Introduce el arrojo");
									int arrojo = sc.nextInt();
									System.out.println("Introduce el carisma");
									int carisma = sc.nextInt();
									Mago anadirT = new Tokenclaw(nombre,vida,afinidad,resistencia,plomo,arrojo,carisma);
									colegio.añadir2(anadirT);
									break;
							}
							break;
						case 5:
							System.out.println("Introduce el nombre del mago a eliminar: ");
							String eliminar = sc.next();
							sc.nextLine();
							colegio.eliminar(eliminar);
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
						int elegir4 = sc.nextInt();
						sc.nextLine();
						switch (elegir4) {
							case 1:
								colegio.mostrarHech();
								break;
							case 2:
								System.out.println("De que mago deseas saber sus hechizos?:");
								String nombre=sc.next();
								sc.nextLine();
								colegio.mostrarHech2(nombre);
								break;
							case 3:	
								System.out.println("Introduce el nombre del mago al que quieras añadir: ");
								String nombreM= sc.next();
								sc.nextLine();
								System.out.println("De que tipo va a ser el hechizo?:");
								System.out.println("1- Sanacion.");
								System.out.println("2- Ataque.");
								System.out.println("3- Defensa.");
								System.out.println("4- Confusion.");
								int elegir6 = sc.nextInt();
								sc.nextLine();
								String tipo="";
								switch (elegir6) {
									case 1:
										tipo="s";
										break;
									case 2:
										tipo="a";
										break;
									case 3:
										tipo="d";
										break;
									case 4:
										tipo="c";
										break;
								
								}
								System.out.println("Introduce el nombre del hechizo: ");
								String nombreH= sc.next();
								sc.nextLine();
								System.out.println("Introduce la descripcion del hechizo: ");
								String descripcionH= sc.next();
								sc.nextLine();
								System.out.println("Introduce la resistencia del hechizo: ");
								int resistH= sc.nextInt();
								sc.nextLine();
								System.out.println("Introduce el espacio del hechizo: ");
								int espacioH= sc.nextInt();
								sc.nextLine();
								System.out.println("Introduce el coste del hechizo: ");
								int costeH= sc.nextInt();
								sc.nextLine();
								Hechizo hech = new Hechizo(tipo,nombreH,descripcionH,resistH,espacioH,costeH);
								colegio.añadirHech(nombreM, hech);
								break;
							case 4:	
								System.out.println("Introduce el nombre del mago al que quieras modificar un hechizo: ");
								String nombre2= sc.next();
								sc.nextLine();
								System.out.println("Introduce el nombre del hechizo al que quieras modificar: ");
								String nombre3= sc.next();
								sc.nextLine();
								colegio.modificarHech(nombre2, nombre3);
								break;
							case 5:	
								System.out.println("Introduce el nombre del mago al que quieras eliminar un hechizo: ");
								String nombre4= sc.next();
								sc.nextLine();
								System.out.println("Introduce el nombre del hechizo que quieras eliminar: ");
								String nombre5= sc.next();
								sc.nextLine();
								colegio.eliminarHech(nombre4, nombre5);
								break;
						}
					break;
				case 3:
					System.out.println("Has decidido hacer un duelo, elige a tu primer combatiente: ");
					Mago duelo1=colegio.elegir();
					System.out.println("Ahora elige contra quien se enfrentara: ");
					Mago duelo2=colegio.elegir();
					Duelo duelo = new Duelo(duelo1,duelo2);
					duelo.pelea();
					break;
				case 4:
					System.out.println("Deseas guardar los datos(1) o cargar el backup(2)?");
					int elegir7=sc.nextInt();
					sc.nextLine();
					switch (elegir7) {
					case 1:
						colegio.guardar();
						break;
					case 2:
						colegio.cargar();
						break;
					}
					break;
			}
		}while(elegir1!=5);
	}

}

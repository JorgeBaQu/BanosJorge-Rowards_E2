package rowards_pegacy;
import java.util.Scanner;
import java.util.ArrayList;

public class Colegio {
Scanner sc = new Scanner(System.in);
ArrayList <Mago> colegio = new ArrayList <Mago>();
	public void añadir(Mago magoadd) {
		colegio.add(magoadd);
	}
	public void añadir2(Mago magoadd) {
		boolean comprobar=false;
		for(int i=0;i<colegio.size();i++) {
			if((magoadd.getNombre()).equals(colegio.get(i).getNombre())) {
			comprobar=true;
			}
		}
		if(comprobar==false){
			colegio.add(magoadd);
			}else System.out.println("Error, ya existe un mago con ese nombre");
	}
	public void mostrar() {
		for(int i=0;i<colegio.size();i++) {
			colegio.get(i).mostrar();
			System.out.println("-------");
			
		}
		
	}
	public void info(String nombre) {
		for(int i=0;i<colegio.size();i++) {
			if((colegio.get(i).getNombre()).equalsIgnoreCase(nombre)) {
				colegio.get(i).mostrar();
			}
		}
		
	}
	public void modif(String nombre) {
		int elegir2;
		for(int i=0;i<colegio.size();i++) {
			if((colegio.get(i).getNombre()).equalsIgnoreCase(nombre)) {
				System.out.println("Que deseas modificar?");
				if(colegio.get(i) instanceof Dicendorf ) {
					do {
						System.out.println("Que desea modificar de su tebeo?:");
						System.out.println("1. Nombre.");
						System.out.println("2. Vida.");
						System.out.println("3. Afinidad.");
						System.out.println("4. Resistencia.");
						System.out.println("5. Plomo.");
						System.out.println("6. Predisposicion.");
						System.out.println("7. Inconsciencia.");
						System.out.println("8. Protagonismo.");
						System.out.println("9. Cerrar.");
						elegir2=sc.nextInt();
						sc.nextLine();
						switch(elegir2) {
						case 1:
							System.out.println("Introduce el nuevo nombre:");
							colegio.get(i).setNombre(sc.nextLine());
							break;
						case 2:
							System.out.println("Introduce la nueva vida:");
							colegio.get(i).setVida(sc.nextInt());
							break;
						case 3:
							System.out.println("Introduce la nueva afinidad:");
							colegio.get(i).setAfinidad(sc.nextInt());
							break;
						case 4:
							System.out.println("Introduce la nueva resistencia:");
							colegio.get(i).setResistencia(sc.nextInt());
							break;
						case 5:
							System.out.println("Introduce el nuevo plomo:");
							colegio.get(i).setPlomo(sc.nextInt());
							break;
						case 6:
							System.out.println("Introduce la nueva predisposicion:");
							((Dicendorf)colegio.get(i)).setPredisposicion(sc.nextInt());
							break;
						case 7:
							System.out.println("Introduce la nueva inconsciencia:");
							((Dicendorf)colegio.get(i)).setInconsciencia(sc.nextInt());
							break;
						case 8:
							System.out.println("Introduce el nuevo protagonismo:");
							((Dicendorf)colegio.get(i)).setProtagonismo(sc.nextInt());
							break;
						}
					}while(elegir2!=9);
				}else if(colegio.get(i) instanceof Tokenclaw ) {
					do {
						System.out.println("Que desea modificar de su tebeo?:");
						System.out.println("1. Nombre.");
						System.out.println("2. Vida.");
						System.out.println("3. Afinidad.");
						System.out.println("4. Resistencia.");
						System.out.println("5. Plomo.");
						System.out.println("6. Arrojo.");
						System.out.println("7. Carisma.");
						System.out.println("8. Cerrar.");
						elegir2=sc.nextInt();
						sc.nextLine();
						switch(elegir2) {
						case 1:
							System.out.println("Introduce el nuevo nombre:");
							colegio.get(i).setNombre(sc.nextLine());
							break;
						case 2:
							System.out.println("Introduce la nueva vida:");
							colegio.get(i).setVida(sc.nextInt());
							break;
						case 3:
							System.out.println("Introduce la nueva afinidad:");
							colegio.get(i).setAfinidad(sc.nextInt());
							break;
						case 4:
							System.out.println("Introduce la nueva resistencia:");
							colegio.get(i).setResistencia(sc.nextInt());
							break;
						case 5:
							System.out.println("Introduce el nuevo plomo:");
							colegio.get(i).setPlomo(sc.nextInt());
							break;
						case 6:
							System.out.println("Introduce el nuevo arrojo:");
							((Tokenclaw)colegio.get(i)).setArrojo(sc.nextInt());
							break;
						case 7:
							System.out.println("Introduce la nueva carisma:");
							((Tokenclaw)colegio.get(i)).setCarisma(sc.nextInt());
							break;
						}
					}while(elegir2!=8);
				}else if(colegio.get(i) instanceof Sleeverin ) {
					do {
						System.out.println("Que desea modificar de su tebeo?:");
						System.out.println("1. Nombre.");
						System.out.println("2. Vida.");
						System.out.println("3. Afinidad.");
						System.out.println("4. Resistencia.");
						System.out.println("5. Plomo.");
						System.out.println("6. Sigilo.");
						System.out.println("7. Venenoso.");
						System.out.println("8. Hablar.");
						System.out.println("9. Cerrar.");
						elegir2=sc.nextInt();
						sc.nextLine();
						switch(elegir2) {
						case 1:
							System.out.println("Introduce el nuevo nombre:");
							colegio.get(i).setNombre(sc.nextLine());
							break;
						case 2:
							System.out.println("Introduce la nueva vida:");
							colegio.get(i).setVida(sc.nextInt());
							break;
						case 3:
							System.out.println("Introduce la nueva afinidad:");
							colegio.get(i).setAfinidad(sc.nextInt());
							break;
						case 4:
							System.out.println("Introduce la nueva resistencia:");
							colegio.get(i).setResistencia(sc.nextInt());
							break;
						case 5:
							System.out.println("Introduce el nuevo plomo:");
							colegio.get(i).setPlomo(sc.nextInt());
							break;
						case 6:
							System.out.println("Introduce el nuevo sigilo:");
							((Sleeverin)colegio.get(i)).setSigilo(sc.nextInt());
							break;
						case 7:
							System.out.println("Introduce el nuevo venenoso:");
							((Sleeverin)colegio.get(i)).setVenenoso(sc.nextInt());
							break;
						case 8:
							System.out.println("Introduce el nuevo hablar:");
							((Sleeverin)colegio.get(i)).setHablar(sc.nextInt());
							break;
						}
					}while(elegir2!=9);
				}else if(colegio.get(i) instanceof Meeplepuf ) {
					do {
						System.out.println("Que desea modificar de su tebeo?:");
						System.out.println("1. Nombre.");
						System.out.println("2. Vida.");
						System.out.println("3. Afinidad.");
						System.out.println("4. Resistencia.");
						System.out.println("5. Plomo.");
						System.out.println("6. Eficiencia.");
						System.out.println("7. Honor.");
						System.out.println("8. Cerrar.");
						elegir2=sc.nextInt();
						sc.nextLine();
						switch(elegir2) {
						case 1:
							System.out.println("Introduce el nuevo nombre:");
							colegio.get(i).setNombre(sc.nextLine());
							break;
						case 2:
							System.out.println("Introduce la nueva vida:");
							colegio.get(i).setVida(sc.nextInt());
							break;
						case 3:
							System.out.println("Introduce la nueva afinidad:");
							colegio.get(i).setAfinidad(sc.nextInt());
							break;
						case 4:
							System.out.println("Introduce la nueva resistencia:");
							colegio.get(i).setResistencia(sc.nextInt());
							break;
						case 5:
							System.out.println("Introduce el nuevo plomo:");
							colegio.get(i).setPlomo(sc.nextInt());
							break;
						case 6:
							System.out.println("Introduce la nueva eficiencia:");
							((Meeplepuf)colegio.get(i)).setEficiencia(sc.nextInt());
							break;
						case 7:
							System.out.println("Introduce el nuevo honor:");
							((Meeplepuf)colegio.get(i)).setHonor(sc.nextInt());
							break;
	
						}
					}while(elegir2!=8);
				}
			}
		}
	}
	public void eliminar(String nombre) {
		for(int i=0;i<colegio.size();i++) {
			if((colegio.get(i).getNombre()).equalsIgnoreCase(nombre)) {
				colegio.remove(i);
				System.out.println("Enhorabuena, "+ nombre + " ha sido eliminado con exito");
			}
		}
	}
}

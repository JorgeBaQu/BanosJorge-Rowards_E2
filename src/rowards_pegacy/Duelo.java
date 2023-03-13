package rowards_pegacy;

import java.util.Random;
import java.util.Scanner;

public class Duelo {
	Scanner sc = new Scanner(System.in);
	private Mago m1;
	private Mago m2;
public Duelo(Mago m1,Mago m2) {
	this.m1=m1;
	this.m2=m2;
}
public void pelea() {
	int vida1 = m1.getVida();
	int vida2 = m2.getVida();
	int mana1 = m1.getAfinidad();
	int mana2 = m2.getAfinidad();
	int resistencia1 = m1.getResistencia();
	int resistencia2 = m2.getResistencia();
	boolean confusion1 = false;
	boolean confusion2 = false;
	int turnos1 = 0;
	int turnos2 = 0;
	Hechizo h1 = null;
	while(vida1>=0&&vida2>=0) {
		System.out.println("Vida de "+ m1.getNombre()+": "+ vida1);
		System.out.println("Vida de "+ m2.getNombre()+": "+ vida2);
		System.out.println("Turno de "+m1.getNombre());
		System.out.println("Que desea hacer?");
		if(!confusion1 && turnos1==0) {
		System.out.println("1-Hechizo.");
		}else if(turnos1 > 0) {
			turnos1--;
		}
		if(turnos1==0) {
			confusion1=false;
		}
		System.out.println("2-Tecnica secreta. ");
		System.out.println("3-Huir.");
		int elegir8=sc.nextInt();
		sc.nextLine();
		switch(elegir8) {
		case 1:
			for(Hechizo h: m1.getLibro().hechizos) {
				System.out.println(h.getNombre());
			}
			String hech=sc.next();
			sc.nextLine();
			for(Hechizo h: m1.getLibro().hechizos) {
				if(hech.equalsIgnoreCase(h.getNombre())) {
					h1 = h;
				}
			}
			Random r = new Random();
			int resist=r.nextInt(h1.getResistencia()+1);
			if(h1.getTipo().equals("a")) {
				int bonif = m1.ataque();
				if ((mana1 - h1.getCoste()) > 0) {
					if (resist < (bonif / 10)) {
						int DanoTotal = resist + bonif / 10;
						if(DanoTotal>resistencia2) {
							vida2 -= (DanoTotal - resistencia2);
							mana1-=h1.getCoste();
						}else System.out.println("Ha resistido el ataque.");
					}else System.out.println("El hechizo ha fallado.");
				}else System.out.println("No tienes mana para tirar el hechizo");
			} else if (h1.getTipo().equals("d")) {
				int bonif = m1.defensa();
				if ((mana1 - h1.getCoste()) > 0) {
					if(resist < (bonif / 10)) {
						resistencia1++;
					} else System.out.println("El hechizo ha fallado.");
				}else System.out.println("No tienes mana para tirar el hechizo");
			} else if (h1.getTipo().equals("c")) {
				int bonif = m1.confusion();
				if ((mana1 - h1.getCoste()) > 0) {
					if(resist < (bonif / 10)) {
						int ConfusionTotal = resist + bonif / 10; 
						if(ConfusionTotal > resistencia2) {
							turnos2 = r.nextInt(4 + 1);
							confusion2=true;
						}
					}
				}
			} else if (h1.getTipo().equals("s")) {
				int bonif = m1.sanacion();
				if ((mana1 - h1.getCoste()) > 0) {
					if (resist < (bonif / 10)) {
						int CuraTotal = resist + bonif / 10;
						vida1+=(r.nextInt(CuraTotal+1));
						mana1-=h1.getCoste();
						System.out.println();
					}else System.out.println("El hechizo ha fallado.");
				}else System.out.println("No tienes mana para tirar el hechizo");
			}
			break;
		case 2:
			break;
		case 3:
			System.out.println("El combate ha acabado, " + m1.getNombre() + " ha huido.");
			break;
			
		}
		if(elegir8!=3) {
		System.out.println("Turno de "+m2.getNombre());
		System.out.println("Que desea hacer?");
		if(!confusion2 && turnos2==0) {
		System.out.println("1-Hechizo.");
		}else if(turnos2 > 0) {
			turnos2--;
		}
		if(turnos2==0) {
			confusion2=false;
		}
		System.out.println("2-Tecnica secreta. ");
		System.out.println("3-Huir.");
		int elegir9=sc.nextInt();
		sc.nextLine();
		switch(elegir9) {
		case 1:
			for(Hechizo h: m2.getLibro().hechizos) {
				System.out.println(h.getNombre());
			}
			String hech=sc.next();
			sc.nextLine();
			for(Hechizo h: m2.getLibro().hechizos) {
				if(hech.equalsIgnoreCase(h.getNombre())) {
					h1 = h;
				}
			}
			Random r = new Random();
			int resist=r.nextInt(h1.getResistencia()+1);
			if(h1.getTipo().equals("a")) {
				int bonif = m2.ataque();
				if ((mana2 - h1.getCoste()) >= 0) {
					if (resist < (bonif / 10)) {
						int DanoTotal = resist + bonif / 10;
						if(DanoTotal>resistencia1) {
							vida1 -= (DanoTotal - resistencia1);
							mana2-=h1.getCoste();
						}else System.out.println("Ha resistido el ataque.");
					}else System.out.println("El hechizo ha fallado.");
				}else System.out.println("No tienes mana para tirar el hechizo");
			} else if (h1.getTipo().equals("d")) {
				int bonif = m2.defensa();
				if ((mana2 - h1.getCoste()) >= 0) {
					if(resist < (bonif / 10)) {
						resistencia2++;
					} else System.out.println("El hechizo ha fallado.");
				}else System.out.println("No tienes mana para tirar el hechizo");
			} else if (h1.getTipo().equals("c")) {
				int bonif = m2.confusion();
				if ((mana2 - h1.getCoste()) >= 0) {
					if(resist < (bonif / 10)) {
						int ConfusionTotal = resist + bonif / 10; 
						if(ConfusionTotal > resistencia1) {
							turnos1 = r.nextInt(4 + 1);
							confusion1=true;
						}
					}
				}
			} else if (h1.getTipo().equals("s")) {
				int bonif = m2.sanacion();
				if ((mana2 - h1.getCoste()) >= 0) {
					if (resist < (bonif / 10)) {
						int CuraTotal = resist + bonif / 10;
						vida2+=(r.nextInt(CuraTotal+1));
						mana2-=h1.getCoste();
						System.out.println();
					}else System.out.println("El hechizo ha fallado.");
				}else System.out.println("No tienes mana para tirar el hechizo");
			}
			break;
		case 2:
			break;
		case 3:
			System.out.println("El combate ha acabado, " + m2.getNombre() + " ha huido.");
			break;
		}	
	}
	}
	if(vida1<=0) {
		System.out.println(m2.getNombre() + " ha ganado");
	}else if(vida2<=0) {
		System.out.println(m1.getNombre() + " ha ganado");
	}
}
}

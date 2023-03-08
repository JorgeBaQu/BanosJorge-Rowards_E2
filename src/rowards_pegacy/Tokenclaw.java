package rowards_pegacy;
import java.util.Random;

public class Tokenclaw extends Mago {
	private int arrojo;
	private int carisma;
	
	private Random r = new Random();
	private int pelos=r.nextInt(8+1);
	public Tokenclaw(String nombre,int vida, int afinidad,int resistencia,int plomo, int arrojo,int carisma) {
		super(nombre,vida,afinidad,resistencia,plomo);
		this.arrojo=arrojo;
		this.carisma=carisma;
		
	}
	public void mostrar() {
		super.mostrar();
		System.out.println();
	}
}

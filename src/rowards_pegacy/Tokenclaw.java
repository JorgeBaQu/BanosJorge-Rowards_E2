package rowards_pegacy;
import java.util.Random;

public class Tokenclaw extends Mago {
	private int arrojo;
	private int carisma;
	private String casa = "tokenclaw";
	private Random r = new Random();
	private int pelos=r.nextInt(8+1);
	public Tokenclaw(String nombre,int vida, int afinidad,int resistencia,int plomo, int arrojo,int carisma) {
		super(nombre,vida,afinidad,resistencia,plomo);
		this.arrojo=arrojo;
		this.carisma=carisma;
		
	}
	public Tokenclaw(String nombre,int vida, int afinidad,int resistencia,int plomo,LibroHechizos libro, int arrojo,int carisma) {
		super(nombre,vida,afinidad,resistencia,plomo,libro);
		this.arrojo=arrojo;
		this.carisma=carisma;
		
	}
	public void mostrar() {
		super.mostrar();
		System.out.println("Casa: "+ casa);
		System.out.println("Arrojo: "+ arrojo);
		System.out.println("Carisma: "+ carisma);
	}
	public int getArrojo() {
		return arrojo;
	}
	public void setArrojo(int arrojo) {
		this.arrojo = arrojo;
	}
	public int getCarisma() {
		return carisma;
	}
	public void setCarisma(int carisma) {
		this.carisma = carisma;
	}
	public String guardar() {
		return casa+";"+super.guardar()+";"+arrojo+";"+carisma;
	}
	public int sanacion() {
		int bonif=arrojo+carisma;
		return bonif;
	}
	public int ataque() {
		int bonif=arrojo+carisma;
		return bonif;
	}
	public int defensa() {
		int bonif=carisma-arrojo;
		return bonif;
	}
	public int confusion() {
		int bonif=arrojo-carisma;
		return bonif;
	}
}

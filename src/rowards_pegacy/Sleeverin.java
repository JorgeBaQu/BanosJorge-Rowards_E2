package rowards_pegacy;

public class Sleeverin extends Mago {
	private int sigilo;
	private int venenoso;
	private int hablar;
	private int oros;
	private String casa = "sleeverin";
	public Sleeverin(String nombre,int vida, int afinidad,int resistencia,int plomo, int sigilo,int venenoso, int hablar) {
		super(nombre,vida,afinidad,resistencia,plomo);
		this.sigilo=sigilo;
		this.venenoso=venenoso;
		this.hablar=hablar;
	}
	public Sleeverin(String nombre,int vida, int afinidad,int resistencia,int plomo,LibroHechizos libro, int sigilo,int venenoso, int hablar) {
		super(nombre,vida,afinidad,resistencia,plomo,libro);
		this.sigilo=sigilo;
		this.venenoso=venenoso;
		this.hablar=hablar;
	}
	public void mostrar() {
		super.mostrar();
		System.out.println("Casa: "+ casa);
		System.out.println("Sigilo: "+ sigilo);
		System.out.println("Venenoso: "+ venenoso);
		System.out.println("Hablar: "+ hablar);	}
	public int getSigilo() {
		return sigilo;
	}
	public void setSigilo(int sigilo) {
		this.sigilo = sigilo;
	}
	public int getVenenoso() {
		return venenoso;
	}
	public void setVenenoso(int venenoso) {
		this.venenoso = venenoso;
	}
	public int getHablar() {
		return hablar;
	}
	public void setHablar(int hablar) {
		this.hablar = hablar;
	}
	public String guardar() {
		return casa+";"+super.guardar()+";"+sigilo+";"+venenoso+";"+hablar;
	}
}

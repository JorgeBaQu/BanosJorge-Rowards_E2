package rowards_pegacy;

public class Sleeverin extends Mago {
	private int sigilo;
	private int venenoso;
	private int hablar;
	private int oros;
	public Sleeverin(String nombre,int vida, int afinidad,int resistencia,int plomo, int sigilo,int venenoso, int hablar) {
		super(nombre,vida,afinidad,resistencia,plomo);
		this.sigilo=sigilo;
		this.venenoso=venenoso;
		this.hablar=hablar;
	}
	public void mostrar() {
		super.mostrar();
		System.out.println();
	}
}

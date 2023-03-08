package rowards_pegacy;

public class Meeplepuf extends Mago {
	private int eficiencia;
	private int honor;
	private int ultima;
	public Meeplepuf(String nombre,int vida, int afinidad,int resistencia,int plomo, int eficiencia,int honor) {
		super(nombre,vida,afinidad,resistencia,plomo);
		this.eficiencia=eficiencia;
		this.honor=honor;
		
	}
	public void mostrar() {
		super.mostrar();
		System.out.println();
	}
}

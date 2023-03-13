package rowards_pegacy;

public class Meeplepuf extends Mago {
	private int eficiencia;
	private int honor;
	private int ultima;
	private String casa = "meeplepuf";
	public Meeplepuf(String nombre,int vida, int afinidad,int resistencia,int plomo, int eficiencia,int honor) {
		super(nombre,vida,afinidad,resistencia,plomo);
		this.eficiencia=eficiencia;
		this.honor=honor;
		
	}
	public Meeplepuf(String nombre,int vida, int afinidad,int resistencia,int plomo,LibroHechizos libro, int eficiencia,int honor) {
		super(nombre,vida,afinidad,resistencia,plomo,libro);
		this.eficiencia=eficiencia;
		this.honor=honor;
		
	}
	public void mostrar() {
		super.mostrar();
		System.out.println("Casa: "+ casa);
		System.out.println("Eficiencia: "+ eficiencia);
		System.out.println("Honor: "+ honor);
		
	}
	public int getEficiencia() {
		return eficiencia;
	}
	public void setEficiencia(int eficiencia) {
		this.eficiencia = eficiencia;
	}
	public int getHonor() {
		return honor;
	}
	public void setHonor(int honor) {
		this.honor = honor;
	}
	public String guardar() {
		return casa+";"+super.guardar()+";"+eficiencia+";"+honor;
	}
}

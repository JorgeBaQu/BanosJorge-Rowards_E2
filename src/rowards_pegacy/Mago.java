package rowards_pegacy;

public class Mago {
private String nombre;
private int vida;
private int afinidad;
private int resistencia;
private int plomo;

	public Mago(){
		this.nombre="";
		this.vida=0;
		this.afinidad=0;
		this.resistencia=0;
		this.plomo=0;
	}
	public Mago(String nombre, int vida, int afinidad,int resistencia,int plomo) {
		this.nombre=nombre;
		this.vida=vida;
		this.afinidad=afinidad;
		this.resistencia=resistencia;
		this.plomo=plomo;
	}
	
}

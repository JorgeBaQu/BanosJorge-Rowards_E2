package rowards_pegacy;

import java.util.Scanner;

public class Mago {
Scanner sc = new Scanner(System.in);
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
	
		public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getAfinidad() {
		return afinidad;
	}
	public void setAfinidad(int afinidad) {
		this.afinidad = afinidad;
	}
	public int getResistencia() {
		return resistencia;
	}
	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}
	public int getPlomo() {
		return plomo;
	}
	public void setPlomo(int plomo) {
		this.plomo = plomo;
	}
	public void mostrar() {
		System.out.println("Nombre: "+ nombre );
		System.out.println("Vida: "+ vida);
		System.out.println("Afinidad: "+ afinidad);
		System.out.println("Resistencia: "+ resistencia);
		System.out.println("Plomo: "+ plomo);
	}
	
	
}

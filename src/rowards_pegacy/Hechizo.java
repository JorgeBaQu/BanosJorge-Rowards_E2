package rowards_pegacy;

public class Hechizo {
private String tipo;

private String nombre;
private String descripcion;
private int resistencia;
private int espacio;
private int coste;
public Hechizo() {
	this.tipo="";
	this.nombre="";
	this.descripcion="";
	this.resistencia=0;
	this.espacio=0;
	this.coste=0;
}
public Hechizo(String tipo, String nombre,String descripcion, int resistencia, int espacio, int coste) {
	this.tipo=tipo;
	this.nombre=nombre;
	this.descripcion=descripcion;
	this.resistencia=resistencia;
	this.espacio=espacio;
	this.coste=coste;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public int getResistencia() {
	return resistencia;
}
public void setResistencia(int resistencia) {
	this.resistencia = resistencia;
}
public int getEspacio() {
	return espacio;
}
public void setEspacio(int espacio) {
	this.espacio = espacio;
}
public int getCoste() {
	return coste;
}
public void setCoste(int coste) {
	this.coste = coste;
}
public String guardarH() {
	return tipo+";"+nombre+";"+descripcion+";"+resistencia+";"+espacio+";"+coste;
}
}

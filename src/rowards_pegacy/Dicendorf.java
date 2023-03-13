package rowards_pegacy;

public class Dicendorf extends Mago {
private int predisposicion;
private int inconsciencia;
private int protagonismo;
private int sablazo;
private String casa = "dicendorf";
public Dicendorf(String nombre,int vida, int afinidad,int resistencia,int plomo, int predisposicion,int inconsciencia, int protagonismo) {
	super(nombre,vida,afinidad,resistencia,plomo);
	this.predisposicion=predisposicion;
	this.inconsciencia=inconsciencia;
	this.protagonismo=protagonismo;
}
public Dicendorf(String nombre,int vida, int afinidad,int resistencia,int plomo,LibroHechizos libro, int predisposicion,int inconsciencia, int protagonismo) {
	super(nombre,vida,afinidad,resistencia,plomo,libro);
	this.predisposicion=predisposicion;
	this.inconsciencia=inconsciencia;
	this.protagonismo=protagonismo;
}
public void mostrar() {
	super.mostrar();
	System.out.println("Casa: "+ casa);
	System.out.println("Predisposicion: "+ predisposicion);
	System.out.println("Inconsciencia: "+ inconsciencia);
	System.out.println("Protagonismo: "+ protagonismo);
}
public int getPredisposicion() {
	return predisposicion;
}
public void setPredisposicion(int predisposicion) {
	this.predisposicion = predisposicion;
}
public int getInconsciencia() {
	return inconsciencia;
}
public void setInconsciencia(int inconsciencia) {
	this.inconsciencia = inconsciencia;
}
public int getProtagonismo() {
	return protagonismo;
}
public void setProtagonismo(int protagonismo) {
	this.protagonismo = protagonismo;
}
public String guardar() {
	return casa+";"+super.guardar()+";"+predisposicion+";"+inconsciencia+";"+protagonismo;
}
public int sanacion() {
	int bonif=predisposicion+protagonismo;
	return bonif;
}
public int ataque() {
	int bonif = inconsciencia+protagonismo;
	return bonif;
}
public int defensa() {
	int bonif=inconsciencia;
	return bonif;
}
public int confusion() {
	int bonif=protagonismo-inconsciencia;
			return bonif;
}
}

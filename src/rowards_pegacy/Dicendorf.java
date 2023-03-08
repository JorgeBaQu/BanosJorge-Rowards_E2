package rowards_pegacy;

public class Dicendorf extends Mago {
private int predisposicion;
private int inconsciencia;
private int protagonismo;
private int sablazo;
public Dicendorf(String nombre,int vida, int afinidad,int resistencia,int plomo, int predisposicion,int inconsciencia, int protagonismo) {
	super(nombre,vida,afinidad,resistencia,plomo);
	this.predisposicion=predisposicion;
	this.inconsciencia=inconsciencia;
	this.protagonismo=protagonismo;
}
public void mostrar() {
	super.mostrar();
	System.out.println("Predisposicion: "+ predisposicion);
	System.out.println("Inconsciencia: "+ inconsciencia);
	System.out.println("Protagonismo: "+ protagonismo);
}
}

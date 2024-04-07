package ar.edu.unju.fi.modul;

public class Materia {
private String codigo;
private String nombre;

public Materia() {
	
}


public Materia(String codigo, String nombre) {
	this.codigo=codigo;
	this.nombre= nombre;
}



@Override
public String toString() {
	return " " + codigo + ", nombre=" + nombre ;
}


public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}


}
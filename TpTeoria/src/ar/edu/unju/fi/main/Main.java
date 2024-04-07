package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.modul.Alumno;
import ar.edu.unju.fi.modul.Materia;
import ar.edu.unju.fi.modul.RegistroNota;

public class Main {

	public static void main(String[] args) {
		
		
        Alumno alumno= new Alumno();	
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Legajo: ");
        Integer legajo = scanner.nextInt();
        System.out.println("Ingrese Apellido: ");
        String apellido = scanner.next();
        System.out.println("Ingrese Nombre: ");
       String nombre = scanner.next();
        
        alumno.setLegajo(legajo);
        alumno.setApellido(apellido);
        alumno.setNombre(nombre);
        
        System.out.println(alumno.toString());
        
        int numMaterias= 1;
        
        while(numMaterias<=2) {
        	 System.out.println("Ingrese el codigo de la materia: ");
             String codMateria = scanner.next();
             System.out.println("Ingrese el nombre de la materia: ");
             String nomMateria = scanner.next();
             
             Materia materia= new Materia(codMateria, nomMateria);
             
             System.out.println("Ingrese el codigo del registro de nota: ");
             String codNota = scanner.next();
             System.out.println("Ingrese la nota final: ");
            Float nota = scanner.nextFloat();
            
            RegistroNota registroNota = new RegistroNota(codNota,alumno, materia, nota);
            
            System.out.println(registroNota.toString());
            numMaterias++;
        }
        
	}

}

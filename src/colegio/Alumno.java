/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/**
 *
 * @author Dani Barros
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;

   HashSet<Materia> materias = new HashSet<Materia>();
    
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }


    public void agregarMateria(Materia materia){
        if(materias.contains(materia)){
            System.out.println(nombre+" "+apellido+" ya esta inscripto/a en "+materia.getNombre());
        }else{
        materias.add(materia);
        }
    }
    
    public void cantidadMaterias(){
        System.out.println(nombre+" "+apellido+" esta inscripto/a en "+materias.size()+" materias");
    }


    
    /*Un Alumno tiene un nro de legajo, un apellido, un nombre y una lista de materias en las
que está inscripto; para ello tiene un método agregarMateria que permite inscribir al Alumno en
una materia determinada (implementar de manera tal que no deje inscribir un alumno en dos
materias iguales.) y otro método cantidadMaterias que devuelve la cantidad de materias a las
que está inscripto el alumno.
La Materia tiene un idMateria, un nombre de la materia y año al que pertenece, tiene
además un constructor que inicializa sus propiedades y métodos get y set para cada uno de sus
atributos.*/
    
    //Getters y Setters
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

/**
 *
 * @author Dani Barros
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Materia Ingles = new Materia(01, "Ingles", 1);
        Materia Matematicas = new Materia(02, "Matematicas", 1);
        Materia Laboratorio  = new Materia(03, "Laboratorio", 1);
        Alumno Lopez = new Alumno(1001, "Lopez", "Martin");
        Alumno Martinez = new Alumno(1002, "Martinez", "Brenda");
        
        
        Lopez.agregarMateria(Ingles);
        Lopez.agregarMateria(Matematicas);
        Lopez.agregarMateria(Laboratorio);
        
        Martinez.agregarMateria(Ingles);
        Martinez.agregarMateria(Matematicas);
        Martinez.agregarMateria(Laboratorio);
        Martinez.agregarMateria(Laboratorio);
        System.out.println("");
        
        Lopez.cantidadMaterias();
        System.out.println("");
        Martinez.cantidadMaterias();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventana;

import java.util.Scanner;

/**
 *
 * @author DELL
 */

public class Alumno {
    //definicion de variables
    private String nombre;
    private int edad;
    
    /**
     * Metodo el Cual recibe una Dato en este Caso el Nombre
     * @param entrada 
     */
     public void leerNombre(Scanner entrada) {
        nombre = entrada.nextLine();
    }
/**
 * Meotodo el cual Retorna el Nombre
 * @return Nombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Meotodo el cual recibe una edad
 * @param entrada
 */
    public void leerEdad(Scanner entrada) {
        edad = entrada.nextInt();
    }
/**
 * Metodo el cual regresa la Edad
 * @return 
 */
    public int getEdad() {
        return edad;
    }
 
    
    
    
}


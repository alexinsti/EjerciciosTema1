/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciostema1;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Diurno
 */
public class Ejercicio1_2 extends EjerciciosTema1{
    
    public static void ejecutarEjercicio(){
        
        Scanner miScanner = new Scanner(System.in);
        int radio;
        
        System.out.print("Introduzca el radio de un círculo y le indicaré su área: ");
        radio = miScanner.nextInt();
        System.out.println("");
        
        System.out.print("El área de dado círculo de radio "+radio+" es "+calculadorDeResultado(radio));
        System.out.print("");
        
            Organizador.mensajeDeCarga();
            Organizador.selectorDeDestino(); 
        
    }
    
    private static double calculadorDeResultado(int r){
    
        double resultado = Math.PI*(r*r);
        
        return resultado;

    }
}

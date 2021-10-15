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
public class Ejercicio1_1 extends EjerciciosTema1 {
    
        public static void ejecutarEjercicio(){
            
            Scanner miScanner = new Scanner(System.in);
            
            double a;
            double b;
            double c;
        
            System.out.print("Indique el valor de a en la ecuación de segundo grado que desea resolver: ");
            a = miScanner.nextInt();
            System.out.println("");

            System.out.print("Indique el valor de b en la ecuación de segundo grado que desea resolver: ");
            b = miScanner.nextInt();
            System.out.println("");            
            
            System.out.print("Indique el valor de c en la ecuación de segundo grado que desea resolver: ");
            c = miScanner.nextInt();
            System.out.println("");            

            calculadorDeResultado(a, b, c);
            System.out.println("");
            System.out.println("");
            
            Organizador.mensajeDeCarga();
            Organizador.selectorDeDestino();
        
            
            
        }
        
        private static void calculadorDeResultado(double a, double b, double c){
                      
            double discriminante = b*b-4*a*c;
            double valor1;
            double valor2;
            
            if(discriminante>=0)
            {
            
                valor1 =((-b+Math.sqrt(discriminante))/(2*a));
                valor2 = ((-b-Math.sqrt(discriminante))/(2*a));
                
                System.out.print("Las soluciones de la ecuación "+a+"x^2 + "+b+"x"+c+" son "+valor1+" y "+valor2);
            
            }else
            {
            
                System.out.print("Esa ecuación no tiene soluciones reales");

            
            }

        }
}

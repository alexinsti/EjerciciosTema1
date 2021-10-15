/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciostema1;
import java.util.Scanner;
/**
 *
 * @author Diurno
 */
public class EjerciciosTema1 {

    public static Scanner miScanner = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        System.out.print("Indique el tema del ejercicio: ");
        int numeroTema = miScanner.nextInt();
        System.out.println("");
        
        System.out.print("Indique el número del ejercicio: ");
        int numeroEjercicio = miScanner.nextInt(); 
        System.out.println("");

        Organizador.indice(numeroTema, numeroEjercicio);



    }
       
   
}

    
  



    








/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciostema1;

/**
 *
 * @author Diurno
 */
public class Organizador extends EjerciciosTema1 {
 
    public static void indice(int tipoEjercicio, int numeroEjercicio){
    
        switch(tipoEjercicio)
        {
        
            case 1:
                
                switch(numeroEjercicio)
                {
                    case 1:
                        
                        mensajeDeCarga();
                        Ejercicio1_1.ejecutarEjercicio();

                        break;
                        
                    case 2:

                        mensajeDeCarga();
                        Ejercicio1_2.ejecutarEjercicio();
                        
                        break;
                        
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                    case 15:
                        break;
                    case 16:
                        break;
                    case 17:
                        
                        mensajeDeCarga();
                        Ejercicio1_17.ejecutarEjercicio();                        
                        
                        break;
                    case 18:
                        break;

                } 
                
                break;
                
            
            case 2:
                
                switch(numeroEjercicio)
                {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        break;
                    case 13:
                        break;
                    case 14:
                        break;
                    case 15:
                        break;
                    case 16:
                        break;
                    case 17:
                        break;   
                }
                
                break;

                
            case 3:
                
                switch(numeroEjercicio)
                {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                
                break;
                
            case 4:
                
                switch(numeroEjercicio)
                {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
                
                break;              
        
        }

    }
    
    public static void mensajeDeCarga(){
    
        System.out.println("Cargando...");
        System.out.println("");
        System.out.println("");        
    
    }    
    
    public static void selectorDeDestino(){
        
        int destino;
    
        System.out.println("---------------OPCIONES-------------");
        System.out.print("");
        System.out.print("");        
        System.out.println("1 Menú principal");
        System.out.print("");        
        System.out.println("2 Salida");
        System.out.print("");
        System.out.print("");        
        System.out.println("------------------------------------");  
        
        System.out.print("Intoduzca el código de destino: ");
        destino = miScanner.nextInt();
        
        switch(destino)
        {
            case 1:
                System.out.println("");
                EjerciciosTema1.main(null);
                
                break;
        
            case 2:
                
                System.out.print("Muchas gracias, hasta pronto!!");
                
                break;
                
            default:
                System.out.println("Código inválido");
                selectorDeDestino();
                break;
        
        
        }

    
    
    }

}

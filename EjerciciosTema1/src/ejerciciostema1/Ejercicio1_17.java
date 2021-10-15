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
public class Ejercicio1_17 extends EjerciciosTema1 {
    
    public static void ejecutarEjercicio(){
        
        int dia;
        int mes;
        int anno;
        
        System.out.print("Introduzca una fecha y le diré si es correcta, comience indicando el día: ");
        dia = miScanner.nextInt();
        System.out.println("");
        
        System.out.print("Introduzca el mes: ");
        mes = miScanner.nextInt();
        System.out.println("");
        
        System.out.print("Introduzca el año: ");
        anno = miScanner.nextInt();
        System.out.println("");
        
        System.out.println("La fecha que ha introducido es"+calculadorDeResultado(dia, mes, anno));
        System.out.println("");
        
            ejecutarDeNuevo();
            Organizador.mensajeDeCarga();
            Organizador.selectorDeDestino();
    
    }
    
    private static String calculadorDeResultado(int dia, int mes, int anno){
    
        String respuesta;
        
        
        if((annoBueno(anno)==1 || annoBueno(anno) == 2) && (mesBueno(mes)==true && diaBueno(anno, mes, dia)== true)){ 
        
            respuesta = " correcta";
        
        }else{
        
            respuesta = " incorrecta";
            
            System.out.println("La fecha que ha introducido es"+respuesta);  
            System.out.println("");
            
            ejecutarDeNuevo();
            
        
        }
    
        
        return respuesta;
    
    }
    
    private static int annoBueno(int anno){
        
        int resultado = 0;
        
        if(anno>0)
        {
        
            resultado = 1;
            
            if((anno%4==0) && (anno%100!= 0))
            {

                resultado =  2;


            }
        
        }
        

        
        return resultado;
    
    }
    
    private static boolean mesBueno(int mes){
        
        boolean resultado = false;
        
        if(0<mes && mes<13)
        {
        
            resultado = true;
        
        
        }

        return resultado;
 
    }
    
    private static boolean diaBueno(int anno,int mes, int dia){
        
        boolean resultado = false;
        
        if((annoBueno(anno)==1 || annoBueno(anno)==2) && (dia<numeroDias(mes, anno)))
        {
 
            resultado = true;            

        }else{
        
            resultado = false;
        
        }
           
        return resultado;
    
    }
    
    private static int numeroDias(int mes, int anno){
        
        int totalDias = 0;
    
        switch(mes)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                
                totalDias = 31;
            
                break;
                
            case 4: case 6: case 9: case 11:
                
                totalDias = 30;
                
                break;
                
            case 2:
                
                if(anno == 2)
                {
                    
                    totalDias = 29;
                
                }else{
                
                    totalDias = 28;
                
                }

                break;
      
        }
    
        return totalDias;
    
    }
    
    private static void ejecutarDeNuevo(){
        
        int respuesta;
    
        System.out.println("---------------OPCIONES-------------");
        System.out.print("");
        System.out.print("");        
        System.out.println("1 Reintentar ejercicio");
        System.out.print("");        
        System.out.println("2 Salir");
        System.out.print("");
        System.out.print("");        
        System.out.println("------------------------------------");  
        
        System.out.print("Intoduzca el código de acción: ");
        respuesta = miScanner.nextInt();
        
        switch(respuesta)
        {
            case 1:
                System.out.println("");
                ejecutarEjercicio();
                
                break;
        
            case 2:
                
                System.out.print("");
                
                break;
                
            default:
                
                System.out.println("Código inválido, saliendo del ejercicio");

                break;
  
        }

    
    }

   
}


package ec.edu.espoch.eddylaje2020;

import java.util.Scanner;

public class EddyLaje2020 {

    public static void main(String[] args) {
       
        Scanner Teclado = new Scanner(System.in);
        float [] Puntuaciones = new float[7];
        float TotalPuntos = 0;
        float Promedio = 0;
        int DiaAlto = 0;
        int DiaBajo = 0;
    
        
        
       float puntuacion = 0;
       int cont = 0;
       
        do {            
            System.out.println("Ingrese la puntuación obtenida: ");
            puntuacion = Teclado.nextFloat();
            
            
            if ( puntuacion > 0 ){
                Puntuaciones[cont] = puntuacion;
                cont = cont + 1;
            }else{
                System.out.println("El valor no es valido");
            }
            
        } while ( cont < 7 );
        
        System.out.println("-----ELIGA UNA OPCIÓN DEL 1 AL 5-----");
        System.out.println("1. Calcular el total de puntuaciones de la semana");
        System.out.println("2. Calcular el promedio de puntuaciones y mostrar los días por encima y por debajo del promedio");
        System.out.println("3. Mostrar el día con la puntuación más alta y el día con la puntuación mas baja ");
        System.out.println("4. Calcular el total de puntuaciones acumuladas durante los primeros cuatro días y los últimos cuatro días");
        System.out.println("5. Salir");
        
        int opcion = Teclado.nextInt();
        
        switch (opcion){
            
            
            case 1:
                
               for ( int i =0 ; i < 7 ; i++ ){
                   TotalPuntos = Puntuaciones[i]+TotalPuntos;
               }
                System.out.println("El total de puntuaciones: "+ TotalPuntos);
             break;
               
             
                
            case 2:

               Promedio = TotalPuntos/7;
               
               int cont1 = 0;
               int cont2 = 0;
               for (int i= 0; i < 7; i++){
                   if (Puntuaciones[i] > Promedio)
                       cont1++; 
               }
               for (int i= 0; i < 7; i++){
                   if (Puntuaciones[i] < Promedio)
                       cont2++; 
               }
                System.out.println("Dias por encima del promedio: "+ cont1);
                System.out.println("Dias por debajo del promedio: "+ cont2);
               
             break; 
               
             
             
             
             
            case 3:
                
             break;   
                
                
            case 4:
                
             break;    
                
            case 5:
                
             break;  
            
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastelcumple;

import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class PastelCumple {
  
    
    public static void main(String[] args) {
        
        int edad;
        int alturaVelas;
        int velasApagadas=1;
        int mayor=0;
        Scanner leer = new Scanner(System.in);        
        
     
        System.out.print("Ingrese la edad que cumple la persona: ");
        edad = leer.nextInt();
        
        for  (int i=0;i<edad;i++){
            System.out.print("Digite la altura de la vela numero " +(i+1) +": ");
            alturaVelas = leer.nextInt();
            if (alturaVelas>mayor){
            mayor=alturaVelas;
            velasApagadas=1;
      }else if(mayor==alturaVelas){
                velasApagadas++;
            }
    }
        System.out.println("El numero de velas apagadas es: " + velasApagadas);      
    }
    }



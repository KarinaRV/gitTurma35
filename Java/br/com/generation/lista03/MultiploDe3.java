package br.com.generation.lista03;

import java.util.Scanner;

public class MultiploDe3{

   public static void main(String[]args){
   
      Scanner sc = new Scanner(System.in);
      
      int numero, media, soma = 0, contador = 0;
      
      System.out.println("Digite um n�mero ");
      numero = sc.nextInt();
      
      do{
      
         if(numero%3 == 0){
            soma+=numero;
            contador ++;
         }
         
         System.out.println("\nDigite um n�mero -> (Para encerrar digite 0): ");
         numero = sc.nextInt();
         
                
      }while(numero != 0);
      
      media = soma/contador;
      
      System.out.println("M�dia multiplo de 3: " + media);
      sc.close();
   }
}
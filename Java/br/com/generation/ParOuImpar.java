package br.com.generation;

import javax.swing.JOptionPane;

public class ParOuImpar{

   public static void main(String[]args){
   
      double numero = Double.parseDouble(JOptionPane.showInputDialog("Insira um n�mero: "));
      
      if(numero<=0){
      
         JOptionPane.showMessageDialog(null,"Valor inv�lido");
         
      }else if(numero%2==0){
         
         double raiz = Math.sqrt(numero);
         JOptionPane.showMessageDialog(null,"O n�mero � par." + "\nA raiz dele �: " + raiz);
         
      }else {
      
         double potencia = Math.pow(numero, 2.0); 
         JOptionPane.showMessageDialog(null,"O n�mero � impar." + "\nO dobro dele �: " + potencia);
         
      }
   }
}
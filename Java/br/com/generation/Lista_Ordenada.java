package br.com.generation;

import javax.swing.JOptionPane;

public class Lista_Ordenada{
   
   public static void main(String[]args){
   
      int n1= Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
      int n2= Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
      int n3= Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
      
      if(n1 < n2 && n2 < n3){
         JOptionPane.showMessageDialog(null,"A ordem �: " + n1 + " < " + n2 + " < " + n3);
      }else if(n1 < n3 && n3 < n2 ){
         JOptionPane.showMessageDialog(null,"A ordem �: " + n1 + " < " + n3 + " < " + n2);  
      }else if(n2 < n1 && n1 < n3){
         JOptionPane.showMessageDialog(null,"A ordem �: " + n2 + " < " +  n1 + " < " + n3);
      }else if(n2 < n3 && n3 < n1){
         JOptionPane.showMessageDialog(null,"A ordem �: " + n2 + " < " + n3 + " < " + n1);
      }else if(n3 < n1 && n1 < n2){
         JOptionPane.showMessageDialog(null,"A ordem �: " + n3 + " < " + n1 + " < " + n2);
      }else if(n3 < n2 && n2 < n1){
         JOptionPane.showMessageDialog(null,"A ordem �: " + n3 + " < " + n2 + " < " + n1);
      }
   }

}
package br.com.generation;

import javax.swing.JOptionPane;

public class CategoriaPorIdade{

   public static void main(String[]args){
      
      int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
      
      if(idade >= 10 && idade <=14){
      
         JOptionPane.showMessageDialog(null,"Voc� est� na Categoria Infantil");
         
      }else if(idade >= 15 && idade <= 17){
      
         JOptionPane.showMessageDialog(null,"Voc� est� na Categoria Juvenil");
         
      }else if(idade >= 18 && idade <=25){
      
         JOptionPane.showMessageDialog(null,"Voc� est� na Categoria Adulto");
         
      }else if(idade >= 0 && idade < 10){
      
         JOptionPane.showMessageDialog(null,"Sinto muito!! Voc� � muito novo");
         
      }else if(idade > 25 && idade <= 150){
      
         JOptionPane.showMessageDialog(null,"Sinto muito!! Voc� n�o est� em nenhuma categoria!");
     
      }else{
         JOptionPane.showMessageDialog(null,"Valor Inv�lido");
      }
   }

}
package br.com.generation; 
import javax.swing.JOptionPane;

public class MaiorNumero{
   public static void main(String [] args){
      
      int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
      int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
      int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero: "));
      
      if(numero1 > numero2 && numero1 > numero3){
      
          JOptionPane.showMessageDialog(null, "O maior n�mero �: " + numero1);

      }else if(numero2 > numero1 && numero2 > numero3 ){
      
         JOptionPane.showMessageDialog(null, "O maior n�mero �: " + numero2);
         
      }else if(numero3 > numero1 && numero3 > numero2){
      
         JOptionPane.showMessageDialog(null, "O maior n�mero �: " + numero3);
         
      }
   }

}
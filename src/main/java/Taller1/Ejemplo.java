/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Taller1;

import javax.swing.*;

/**
 *
 
 */
public class Ejemplo {

    public void operaciones() {

        String texto1 = JOptionPane.showInputDialog("Deme un numero");
        int numero1 = Integer.parseInt(texto1);

//    String texto2 = JOptionPane.showInputDialog("Deme un numero");
//    
//    System.out.println("Suma "+suma(4,9));
//    int numero2 = Integer.parseInt(texto1);
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Deme otro numero; "));
        System.out.println("Suma " + suma(numero1, numero2));
        resta(10, 7);
        suma(5, 4);
        
        
        JOptionPane.showMessageDialog(null, "La suma es: " +suma (numero1, numero2));
        JOptionPane.showMessageDialog(null, "La suma es: " +resta (numero1, numero2));

    
    
    }
    
    private int suma(int num1, int num2){
    
    int resultado = num1 + num2;
    return resultado;
    
    
    }
    
    
      private int resta(int num1, int num2){
          int resultado = num1 -num2;
          return resultado;
          
          
      }
    
}

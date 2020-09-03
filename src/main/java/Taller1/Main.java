package Taller1;

/**
 *

 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        //se genera nuevo objecto de la clase Conversiones, se asigna el valor en celsius a convertir y se ejecuta metodo imprimirFarenheit() para imprimir el resultado 
        Conversiones conversiones1 = new Conversiones();
        conversiones1.celsius = 30;
        conversiones1.imprimirFarenheit();
//
//        //se genera nuevo objecto de la clase Conversiones, se asigna el valor en farenheit a convertir y se ejecuta metodo imprimirCelsius() para imprimir el resultado 
        Conversiones conversiones2 = new Conversiones();
        conversiones2.farenheit = 86;
        conversiones2.imprimirCelsius();
//
//        //se genera nuevo objecto de la clase Conversiones, se asigna el valor en millas a convertir y se ejecuta metodo imprimirMetros() para imprimir el resultado 
        Conversiones conversiones3 = new Conversiones();
        conversiones3.millas = 1;
        conversiones3.imprimirMetros();
//
//        //se genera nuevo objecto de la clase Conversiones, se asigna el valor en colones a convertir y se ejecuta metodo imprimirDolares() para imprimir el resultado 
        Conversiones conversiones4 = new Conversiones();
        conversiones4.colones = 10000;
        conversiones4.imprimirDolares();
//
//        //se genera nuevo objecto de la clase Conversiones, se asigna el valor en dolares a convertir y se ejecuta metodo imprimirEuros() para imprimir el resultado 
        Conversiones convesiones5 = new Conversiones();
        convesiones5.dolares = 2;
        convesiones5.imprimirEuros();

 


         Ejemplo ejemplo = new Ejemplo();
         ejemplo.operaciones();
         
         System.out.println("Suma: "+ejemplo.suma(5,4));
         
        

         int resta=ejemplo.resta(10,7);
         System.out.println("Resta: "+resta);
         
         
    }

}



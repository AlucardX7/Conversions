package Taller1;

/**
 *

 */
public class Conversiones {

    //declaracion de atributos a usar en los metodos de abajo; con sus valores iniciales
    int celsius = 0;
    int farenheit = 0;
    double millas = 0.0;
    double metros = 0.0;
    double colones = 0.0;
    double dolares = 0;
    double euros = 0.0;
    double resultadod = 0.0;
    double resultadoe = 0.0;
    double resultadom = 0.0;
    int resultadotemp = 0;

    public void imprimirFarenheit() {

        /*metodo para convertir de celsius a farenheit, a la variable resultadotemp se le asigna el resultado de la conversion celsius a farenheit y usando la clase system se despliega
      el resultado a usuario */
        resultadotemp = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " grados celsius " + "son " + resultadotemp + " grados farenheit");
        
    }

    public void imprimirCelsius() {

        /*metodo para convertir de farenheit a celsius, a la variable resultadotemp se le asigna el resultado de la conversion farenheit a celsius y usando la clase system se despliega
      el resultado a usuario */
        resultadotemp = (farenheit - 32) * 5 / 9;
        System.out.println(farenheit + " grados farenheit " + "son " + resultadotemp + " grados celsius");

    }

    public void imprimirMetros() {
        /*metodo para convertir de millas a metros, a la variable resultadom se le asigna el resultado de la conversion millas a metros y usando la clase system se despliega
      el resultado a usuario */
        resultadom = millas * 1609.344;
        System.out.println(millas + " millas " + "son " + resultadom + " metros");

    }

    public void imprimirDolares() {

        /*El Sabado 26 de Mayo del 2020; segun la pagina del Banco Central de Costa Rica [https://gee.bccr.fi.cr/indicadoreseconomicos/Cuadros/frmVerCatCuadro.aspx?idioma=1&CodCuadro=%20400] el tipo de cambio estaba a 573.68 colones por 1 dolar. Estos fueron los datos que se usaron
        para la conversion de colones a dolares.
         */
 /*metodo para convertir de colones a dolares, a la variable resultadod se le asigna el resultado de la conversion colones a dolares y usando la clase system se despliega
      el resultado a usuario */
        resultadod = colones / 573.68;
        System.out.println(colones + " colones " + "son " + resultadod + " dolares");

    }

    public void imprimirEuros() {

        /*El Sabado 26 de Mayo del 2020; segun la pagina de Exchange Rates [https://www.exchangerates.org.uk/Dollars-to-Euros-currency-conversion-page.html] el tipo de cambio estaba a 1 dolar por 0.9174 euros. Estos fueron los datos que se usaron
        para la conversion de dolares a euros.
         */
 /*metodo para convertir de dolares a euros, a la variable resultadoe se le asigna el resultado de la conversion dolares a euros y usando la clase system se despliega
      el resultado a usuario */
        resultadoe = dolares * 0.9174;
        System.out.println(dolares + " dolares " + "son " + resultadoe + " euros");

    }

}

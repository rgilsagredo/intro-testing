package daw.programacion.calculadora;

public class Calculadora {

    /*
     * Test unitarios:
     * 
     * Una parte del código, de manera aislada, es testeada para que se compruebe
     * que funciona como debería.
     * Para los test, usamos el framwork JUNIT (ver versión). Tenemos que comprobar
     * en maven (o el gestor que uses)
     * que lo tenemos añadido a las dependencias.
     * 
     * Los ficheros de test (aunque lueo lo haremos automático) los tenemos que
     * crear en un árbol de directorios
     * que imite donde esté el código principal. Así, creamos un
     * tests/java/daw/programacion/calculadora y añadimos
     * un CalculadoraTest.java
     */

    public int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }
}

package daw.programacion.calculadora;

/*
 * Necesitaremos los siguientes imports del paquete JUNIT
 */
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {

    /**
     * Un test es un método que lleva el decorador @Test
     */

    // este sería un tests de prueba
    @Test
    public void testTest() {
        assertTrue(true);
    }

    // trar crear el test, decimos a MAVEN que corra los tests

    /**
     * Los test deben checkear una única funcionalidad, y deben tener nombres claros
     * de lo
     * que están haciendo. De momento solo tengo el método suma, así que creo un
     * test
     * (reality-check) para ver que 2+2=4
     */

    @Test
    public void dosSumaDosEsCuatro() {
        // tengo que instanciar la clase
        Calculadora calc = new Calculadora();
        // este es el resultado esperado
        int expected = 4;
        // estos son los imput
        int numero1 = 2, numero2 = 2;
        // que lo compruebe
        assertEquals(expected, calc.suma(numero1, numero2));
    }

    /**
     * Podemos también lanzar el test con el botoncito de la izda. Probar también a que falle
     */

     /**
      * También podemos tener muchos otros tipos de assert. Y los test se pueden plantear de varias maneras
      */
      @Test
      public void tresSumaCuatroEsSiete(){
        Calculadora calc = new Calculadora();
        int expected = 7;
        int numero1 = 3, numero2 = 4;
        assertTrue("debería ser 3 + 4 = 7", calc.suma(numero1, numero2) == expected);
      }

      /**
       * La idea es que los test cubran todo posible malfuncionamiento de nuestro código.
       * El test 2+2=4 seguiría pasando si suma multiplica en lugar de sumar, por tanto
       * no es un test que por si mismo cubra todos los casos, hay que ñadir más
       */

} // CalculadoraTest

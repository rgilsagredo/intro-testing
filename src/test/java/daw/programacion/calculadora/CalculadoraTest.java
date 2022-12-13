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
     * Los test deben checkear una única funcionalidad, y deben tener nombres claros de lo
     * que están haciendo. De momento solo tengo el método suma, así que creo un test
     * (reality-check) para ver que 2+2=4
     */

     @Test
     public void dosSumaDosEsCuatro(){
        // tengo que instanciar la clase
        Calculadora calc = new Calculadora();
        // este es el resultado esperado
        int target = 4;
        // estos son los imput
        int numero1 = 2, numero2 = 2;
        // que lo compruebe
        assertEquals(target,calc.suma(numero1, numero2));
     }


} // CalculadoraTest

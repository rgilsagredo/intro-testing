package daw.programacion.notas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NotasTest {

    /**
     * Para hacer test con coverage, primero tenemos que actualizar la dependencia
     * desde pom.xml
     * a lo que dicen aquí:
     * https://medium.com/@karlrombauts/setting-up-unit-testing-for-java-in-vs-code-with-maven-3dc75579122f
     * (v 5.x.y)
     * 
     * Despues, en pom.xml añadimos el plugin de JaCoCo, ver también la web de
     * antes.
     * Actualizamos JaCoCo y SureFire a las uñtimas versiones (buscar en google,
     * pero tengo JaCoCo:0.8.8 SureFire:3.0.0-M7)
     * 
     * corremos por CLI mvn jacoco:prepare-agent test install jacoco:report. Tengo
     * que correr esto cada vez que quiera actualizar
     * el coverage. Raro
     * 
     * Mirar esto para automatización: https://www.lambdatest.com/blog/reporting-code-coverage-using-maven-and-jacoco-plugin/
     * parece que se necesita más configuración, pero que es posible
     * 
     * Se genera en target/site/jacoco los reportes de coverage.
     */

    // añadimos un test para ver que tenemos el coverage funcionando bien
    @Test
    public void cuatroEsSuspenso() {
        final String EXPECTED = "Suspenso";
        final double NOTA = 4;
        Notas nota = new Notas();
        assertEquals(EXPECTED, nota.notaTexto(NOTA), "Cuatro debería ser suspenso");
    }

} // NotasTest

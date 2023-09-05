package anotacionestestng;

import org.testng.annotations.*;

public class AnotacionesBasicasTest {

    @BeforeClass
    public void codigoAntes(){

        System.out.println("Este codigo se ejecuta antes de la clase");
    }

    @AfterClass
    public void codigoDespues(){

        System.out.println("Este codigo se ejecuta despues de la clase");
    }

    @BeforeSuite
    public void codigoAntesSuite(){

        System.out.println("Este codigo se ejecuta antes de toda la suite");
    }

    @AfterSuite
    public void codigoDespuesSuite(){

        System.out.println("Este codigo se ejecuta despues de toda la suite");
    }

    @Test
    public void pruebaUno(){

        System.out.println("Esta es la prueba uno");
    }

    @Test
    public void pruebaDos(){

        System.out.println("Esta es la prueba dos");
    }

}

package anotacionestestng;

import org.testng.annotations.*;

public class AnotacionesBasicasTest {

    @BeforeClass
    public void codigoAntes(){
        System.out.println("Este codigo se ejecuta antes de la clase --/");
    }

    @AfterClass
    public void codigoDespues(){
        System.out.println("Este codigo se ejecuta despues de la clase --/");
    }

    @BeforeSuite
    public void codigoAntesSuite(){
        System.out.println("Este codigo se ejecuta antes de toda la suite --*");
    }

    @AfterSuite
    public void codigoDespuesSuite(){
        System.out.println("Este codigo se ejecuta despues de toda la suite--*");
    }

    @BeforeMethod()
    public void antesDelMetodo() {
        System.out.println("Estos codigos se ejecutan antes de cada test -->");
    }

    @AfterMethod()
    public void despuesDelMetodo(){
        System.out.println("Estos codigos se ejecutan despues de cada test-->");
    }

    @BeforeTest
    public void antesSetTest() {
        System.out.println("Este codigos se ejecutan antes de cada archivo incluido en el set de pruebas --& ");
    }

    @AfterTest
    public void despuesSetTest() {
        System.out.println("Este codigos se ejecutan despues de cada archivo incluido en el set de pruebas --& ");
    }

    @Test
    public void pruebaUno(){
        System.out.println("Esta es la prueba uno");
    }

    @Test(dependsOnMethods = {"pruebaUno"})
    public void pruebaDos(){
        System.out.println("Esta es la prueba dos");
    }
}

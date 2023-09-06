package anotacionestestng;

import org.testng.annotations.Test;

public class SegundoSetTest {
    @Test
    public void pruebaTres(){
        System.out.println("Esta es la prueba tres del segundo set");
    }

    @Test(dependsOnMethods = {"pruebaTres"})
    public void pruebaCuatro(){
        System.out.println("Esta es la prueba cuatro del segundo set");
    }

    @Test(enabled = true)
    public void pruebaCinco(){
        System.out.println("Esta es la prueba cinco del segundo set");
    }
    @Test
    public void clicAlHomePage() {
        System.out.println("Clic al Home");
    }

    @Test(groups = {"funcional"})
    public void clicAlCarrito() {
        System.out.println("clic al carrito y funcional");
    }

    @Test
    public void clicAlUsar() {
        System.out.println("clic al usuario");
    }

}

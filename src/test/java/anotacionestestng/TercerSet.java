package anotacionestestng;

import org.testng.annotations.Test;

public class TercerSet {
    @Test
    public void tercerSetPruebaUno() {
        System.out.println("Primera prueba tercer set");
    }

    @Test(groups = {"smoke"})
    public void tercerSetPruebaDos() {
        System.out.println("Segunda prueba tercer set y smoke");
    }

    @Test(groups = {"funcional", "smoke"})
    public void tercerSetPruebaTres() {
        System.out.println("Tercera prueba tercer set y funcional y smoke");
    }

    @Test
    public void tercerSetPruebaCuatro() {
        System.out.println("Cuarta prueba tercer set");
    }


}

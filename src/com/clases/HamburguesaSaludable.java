package com.clases;
import java.util.Scanner;


public class HamburguesaSaludable extends Burges {
    private double panDeSemillas;
    private double burgesDeSojas;
    private Scanner entrada;
    public HamburguesaSaludable() {
        super("lechuga", "tomate");
        this.panDeSemillas = 15.07;
        this.burgesDeSojas = 20.23;
    }

    public double getPanDeSemillas() {
        return panDeSemillas;
    }

    public double getBurgesDeSojas() {
        return burgesDeSojas;
    }

    public double precioPanCarne(){
        return getBurgesDeSojas() + getPanDeSemillas();
    }
    public double saludable() {
        Precios p = new Precios(this.panDeSemillas, this.burgesDeSojas);
       return p.getLechuga() + p.getTomate();
    }
    public double resulFinal(){
        return precioPanCarne() + saludable();
    }
    public void muestra() {
        System.out.println("Precio de la hamburguesa saludable " + resulFinal());
    }
}

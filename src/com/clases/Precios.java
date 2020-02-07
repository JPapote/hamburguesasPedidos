package com.clases;

public class Precios {
    private double panSemi;
    private double burgesSoja;
    private double carne;
    private double pan;
    private double lechuga;
    private double tomate;

    Burges b;
    public Precios(double panSemi, double burgesSojas){
        this.panSemi = panSemi;
        this.burgesSoja = burgesSojas;
    }
    public Precios(){
        this.carne = 10.11;
        this.pan = 10;
        this.lechuga = 7;
        this.tomate = 3.50;

    }

    public double getLechuga() {
        return lechuga;
    }

    public double getTomate() {
        return tomate;
    }

    public double pSaludable(){
        return this.panSemi + this.burgesSoja;
    }


    public double muestraPrecios (int p) {

    if(p == 0){
        return this.carne + this.pan;
    }
    if(p == 1) {
        return this.carne + this.pan + this.lechuga;
    }
    if(p == 2){
        return this.carne + this.pan + this.tomate;
    }
    if (p == 3){
        return this.pan + this.carne + this.lechuga + this.tomate;
    }
    return -1;
    }

    public void muestraPrecios () {
        System.out.println("Precioso de la hamburguesa comun " + muestraPrecios(0));
        System.out.println("Precioso de la hamburguesa con lechuga " + muestraPrecios(1));
        System.out.println("Precioso de la hamburguesa con tomate " + muestraPrecios(2));
        System.out.println("Precioso de la hamburguesa con lechuga y tomate " + muestraPrecios(3));
    }

}

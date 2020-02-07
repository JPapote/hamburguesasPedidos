package com.clases;

import java.util.Scanner;


public class Burges {
    private boolean pan;
    private boolean carne;
    private String lechuga;
    private String tomate;
    private Precios precios;


    private Scanner entrada = new Scanner(System.in);

    //   Precios p;
    public Burges() {
        this(null, null);
    }

    public Burges(String lechuga, String tomate) {
        this.carne = true;
        this.pan = true;
        this.lechuga = lechuga;
        this.tomate = tomate;

    }

    public void setLechuga(String lechuga) {
        this.lechuga = lechuga;
    }

    public void setTomate(String tomate) {
        this.tomate = tomate;
    }

    public void intro() {
        int count = 0;
        System.out.println("Si desea una hamburguesa ingrese: y  \n " +
                "si desea parar el programa: n");

        String yn = entrada.nextLine();
        while (true) {
            if (yn.startsWith("y")) {
                hAgregados();

            }
            if (yn.endsWith("n")) {
                break;
            }
            if (!yn.startsWith("y") || !yn.endsWith("n")) {

                count += 1;
                System.out.println("##################################### \n " +
                        "¡¡ERROR, ELIGA OTRA OPCION POR FAVOR!!\n " +
                        "#####################################");
                intro();
                if (count < 0 ){
                    entrada.nextLine();
            }
            }
            break;
        }

    }


    public void hAgregados() {
        precios = new Precios();
        precios.muestraPrecios();
        System.out.println("0_ si desea la comun \n" +
                "1_ si desea con lechuga \n" +
                "2_ si desea con tomate \n" +
                "3_ si desea completa \n" +
                "4_Cancelar");

        int pedido = entrada.nextInt();
        muestra(pedido);

    }

    public void muestra(int pedido) {

        switch (pedido) {
            case 0:
                System.out.println("Hamburguesa comun lista ");
                System.out.println(precios.muestraPrecios(0));
                entrada.nextLine();
                intro();
                break;
            case 1:
                setLechuga("Lechuga");
                System.out.println("hamburguesa con lechuga lista");
                System.out.println(precios.muestraPrecios(1));
                entrada.nextLine();
                intro();
                break;

            case 2:
                setTomate("Tomate");
                System.out.println("hamburguesa con tomate lista");
                System.out.println(precios.muestraPrecios(2));
                entrada.nextLine();
                intro();
                break;

            case 3:
                setTomate("Tomate");
                setLechuga("Lechuga");
                System.out.println("Hamburguesa con lechuga y tomate lista");
                System.out.println(precios.muestraPrecios(3));
                entrada.nextLine();
                intro();
                break;
            case 4:
                System.out.println("Pedido cancelado");
                entrada.nextLine();
                intro();
                break;
            default:
                System.out.println("************************************");
                System.out.println("Error, por favor elija otra opcion");
                System.out.println("************************************");
                entrada.nextLine();
                hAgregados();
        }


        //        if(pedido == 0 ){
//            System.out.println("Hamburguesa comun lista ");
//            System.out.println(precios.muestraPrecios(0));
//        }
//        if (pedido == 1){
//            setLechuga("Lechuga");
//            System.out.println("hamburguesa con lechuga lista");
//            System.out.println(precios.muestraPrecios(1));
//        }
//        if (pedido == 2){
//            setTomate("Tomate");
//            System.out.println("hamburguesa con tomate lista");
//            System.out.println(precios.muestraPrecios(2));
//        }
//        if(pedido == 3){
//            setTomate("Tomate");setLechuga("Lechuga");
//            System.out.println("Hamburguesa con lechuga y tomate lista");
//            System.out.println(precios.muestraPrecios(3));
//        }
//
//
//    }
    }

}

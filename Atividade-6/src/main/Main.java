package main;
import classes.*;

public class Main {
    public static void main(String[] args) {

        LojaComercial lojaComercial = new LojaComercial("21354678/0001","Mercado");
        lojaComercial.abrir();
        lojaComercial.fechar();
        lojaComercial.abrir();
        lojaComercial.fechar();

    }
}
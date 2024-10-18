package main;

import classes.*;

public class GerenciadorVeiculos {
    public static void main(String[] args) {
        Veiculo v1 = new Caminhao("ABC1234", 2020, 14);
        v1.exibirInformacoes();

        System.out.println("------------------------------------");

        Veiculo v2 = new Onibus("DEF5678", 2021, 40);
        v2.exibirInformacoes();


    }
}
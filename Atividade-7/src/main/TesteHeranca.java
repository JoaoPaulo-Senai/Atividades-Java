package main;
import classes.*;

public class TesteHeranca {
    public static void main(String[] args) {
        Assistente assistente = new Assistente("Jão", 3000);
        assistente.addAumento(500);

        System.out.println("Nome: " + assistente.getNome());
        System.out.println("Salário anual: " + assistente.ganhoAnual());
    }
}
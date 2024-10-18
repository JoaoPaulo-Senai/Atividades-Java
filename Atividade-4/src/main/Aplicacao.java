package main;
import classes.*;
public class Aplicacao {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.adicionarItem("Hambúrguer", 15.50);
        pedido.adicionarItem("Batata Frita", 8.00);
        pedido.adicionarItem("Refrigerante", 5.00);

        System.out.println("Valor total do pedido: R$ " + pedido.calcularTotal());
    }
}
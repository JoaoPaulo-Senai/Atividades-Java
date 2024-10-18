package classes;
import classes.ProdutoImpl;
public interface Produto {
    String getNome();
    int getQuantidade();
    void adicionarQuantidade(int quantidade);
    void removerQuantidade(int quantidade);
}
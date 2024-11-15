package vendas;

public class Produto {
    private final int idProduto;
    private String nome;
    private double preco;
    private static int contadorProdutos;

    public Produto(String nome, double preco){
        this.idProduto = ++Produto.contadorProdutos;
        this.nome = nome;
        this.preco = preco;
    }

    public int getIdProduto() {
        return this.idProduto;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "idProduto: " + this.idProduto +
                ", nome: '" + this.nome + '\'' +
                ", preco: " + this.preco + "Mt" +
                '}';
    }
}

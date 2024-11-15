package vendas;
public class Encomenda {
    private final int idEncomenda;
    private Produto[] produtos;
    private int contadorProdutos;
    private static final int MAX_PRODUTOS = 10;
    private static int contadorEncomendas;

    public Encomenda(){
        this.idEncomenda = ++Encomenda.contadorEncomendas;
        this.produtos = new Produto[Encomenda.MAX_PRODUTOS];
    }

    public void adicionarProdutos(Produto produto){
        if(this.contadorProdutos < Encomenda.MAX_PRODUTOS) {
            this.produtos[this.contadorProdutos++] = produto;
        }else{
            System.out.println("Já atingiu o numero máximo de produtos: "
                    + Encomenda.MAX_PRODUTOS);
        }
    }

    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < this.contadorProdutos; i++){
            Produto produto = this.produtos[i];
            total += produto.getPreco();
        }
        return total;
    }

    /*public void mostrarEncomenda(){

        System.out.println("Id Encomenda: " +this.idEncomenda);

        double totalEncomenda = this.calcularTotal();
        System.out.println("\tTotal da Encomenda: $" + totalEncomenda + "Mt");

        System.out.println("\t Produtos da Encomenda: ");
        for(int i = 0; i <this.contadorProdutos; i++){
            System.out.println("\t\t" + this.produtos[i]);
        }
    }*/

    @Override
    public String toString(){
        var resultado = "Id Encomenda: " +this.idEncomenda;

        double totalEncomenda = this.calcularTotal();
        System.out.println("\tTotal da Encomenda: $" + totalEncomenda + "Mt");

        resultado += "\t Produtos da Encomenda:" + "\n";
        for(int i = 0; i <this.contadorProdutos; i++){
            resultado += "\t\t" + this.produtos[i] + "\n";
        }
        return resultado;
    }
}

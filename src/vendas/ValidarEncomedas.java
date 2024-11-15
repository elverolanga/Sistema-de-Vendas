package vendas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidarEncomedas {
    public static void main(String[] args) {
        System.out.println("Sistema de Vendas - M.Sales \n");

        Scanner sc = new Scanner(System.in);
        ArrayList<Encomenda> encomendas = new ArrayList<>();

        System.out.println("Insira a quantidade de encomendas a fazer");
        int quantidadeEncomendas = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < quantidadeEncomendas; i++) {
            Encomenda encomenda = new Encomenda();
            System.out.println("Insira a quantidade de produtos a comprar entre 1-10 para a encomenda " + (i + 1));
            int quantidadeProdutos = sc.nextInt();
            sc.nextLine();

            for (int j = 0; j < quantidadeProdutos; j++) {
                System.out.print("\nProduto " + (j + 1) + " Nome: ");
                String nomeProduto = sc.nextLine();

                System.out.print("Preço: ");
                double precoProduto = sc.nextDouble();
                sc.nextLine();

                Produto produto = new Produto(nomeProduto, precoProduto);
                encomenda.adicionarProdutos(produto);
            }

            encomendas.add(encomenda);
        }

        System.out.println("\nResumo das Encomendas:");
        for (int i = 0; i < encomendas.size(); i++) {
            System.out.println("Encomenda " + (i + 1) + ":\n" + encomendas.get(i));
        }
    }
}

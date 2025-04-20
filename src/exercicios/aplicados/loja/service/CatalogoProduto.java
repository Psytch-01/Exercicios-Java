package src.exercicios.aplicados.loja.service;

import src.exercicios.aplicados.loja.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CatalogoProduto {

    private List<Produto> produtos;

    public CatalogoProduto() {
        this.produtos = new ArrayList<Produto>();
    }

    public void addProduct(String name, int quantityOnStorage, double price, String category) {
        produtos.add(new Produto(name, quantityOnStorage, price, category ));
    }

    public void printCatalogo() {
        System.out.println(produtos);
    }

    public void printTotalStorageValue() {
        double total = 0d;
       if (!produtos.isEmpty()) {
           for (Produto produto : produtos) {
               total += produto.getQuantityOnStorage() * produto.getPrice();
           }
       }
       System.out.println("Valor total do estoque: " + total);
    }


    public void searchByLowQuantity() {
        List<Produto> listaPorBaixaQuantidade = produtos.stream()
                .filter(p -> p.getQuantityOnStorage() <= 5)
                .collect(Collectors.toList());

        System.out.println(listaPorBaixaQuantidade);
    }

    public void searchByCategory(String category) {
        List<Produto> listaPorCategoria = produtos.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());

        System.out.println(listaPorCategoria);
    }
}

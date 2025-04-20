package src.exercicios.aplicados.loja.application;

import src.exercicios.aplicados.loja.model.Produto;
import src.exercicios.aplicados.loja.service.CatalogoProduto;

public class main {
    public static void main(String[] args) {
        CatalogoProduto catalogo = new CatalogoProduto();
        catalogo.addProduct("batatinha frita", 2, 10.00, "Comida");
        catalogo.addProduct("Marreta", 5, 35.00, "Ferramentas");

        catalogo.searchByCategory("Ferramentas");
        catalogo.searchByLowQuantity();
    }
}

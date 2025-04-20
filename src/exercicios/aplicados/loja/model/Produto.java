package src.exercicios.aplicados.loja.model;

public class Produto {

    private String name;
    private String category;
    private double price;
    private int quantityOnStorage;

    public Produto(String name, int quantityOnStorage, double price, String category) {
        this.name = name;
        this.quantityOnStorage = quantityOnStorage;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityOnStorage() {
        return quantityOnStorage;
    }

    public void setQuantityOnStorage(int quantityOnStorage) {
        this.quantityOnStorage = quantityOnStorage;
    }

    @Override
    public String toString() {
        return  name +
                ", categoria: " + category +
                ", preço: " + price +
                ", quantidade em Estoque: " + quantityOnStorage + " |";
    }
}

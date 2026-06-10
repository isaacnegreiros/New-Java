package Atividade9_Exercício_Fixação_Poliformismo.Entities;

public class Product {
    private String name;
    private double preço;

    public Product(String name, Double preço) {
        this.name = name;
        this.preço = preço;
    }

    public String getName() {
        return name;
    }

    public double getPreço() {
        return preço;
    }

    public String priceTag() {
        return name + " $ " + String.format("%.2f", preço);

    }
}

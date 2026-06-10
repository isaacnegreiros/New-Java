package Atividade9_Exercício_Fixação_Poliformismo.Entities;

public class Importedproduct extends Product {
    private Double customsFee;

    public Importedproduct(String name, Double preço, Double customsFee) {
        super(name, preço);
        this.customsFee = customsFee;

    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return getPreço() + customsFee;
    }

    @Override
    public String priceTag() {
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", customsFee)
                + ")";

    }
}


package Atividade9_Exercício_Fixação_Poliformismo.Applications;

import Atividade9_Exercício_Fixação_Poliformismo.Entities.Product;
import Atividade9_Exercício_Fixação_Poliformismo.Entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Product #" + i + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double preço = sc.nextDouble();

            if (type == 'i') {

                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();


            } else if (type == 'u') {

                sc.nextLine();

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.nextLine();

                LocalDate manufactureDate = LocalDate.parse(date, fmt);

                list.add(new UsedProduct(name, preço, manufactureDate));

            } else {

                list.add(new Product(name, preço));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");

        for (Product p : list) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }

    private record ImportedProduct(String name, double preço, double customsFee) {
    }
}


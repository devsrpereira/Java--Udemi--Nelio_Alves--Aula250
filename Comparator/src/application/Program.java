package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println();
        System.out.println("******* Comparator obj em Classe Externa *******");
        List<Product> products = new ArrayList<>();

        products.add(new Product("TV",900.0));
        products.add(new Product("Notebook",1200.0));
        products.add(new Product("Tablet",450.0));

        products.sort(new MyComparator());

        for (Product x : products) {
            System.out.println(x);
        }

        System.out.println();
        System.out.println("******* Comparator obj em uma Interna (anonima) *******");
        List<Product> products2 = new ArrayList<>();
        products2.add(new Product("Radio",900.0));
        products2.add(new Product("Mouse",1200.0));
        products2.add(new Product("iPhone",450.0));
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
           public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };
        products2.sort(comp);
        for (Product x : products2) {
            System.out.println(x);
        }

        System.out.println();
        System.out.println("******* Comparator obj Lambda com {} *******");
        List<Product> products3 = new ArrayList<>();
        products3.add(new Product("Feijão",1200.0));
        products3.add(new Product("Quiabo",450.0));
        products3.add(new Product("Arroz",900.0));
        Comparator<Product> comp2 = (p1, p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };
        products3.sort(comp);
        for (Product x : products3) {
            System.out.println(x);
        }


        System.out.println();
        System.out.println("******* Comparator obj Lambda sem {} *******");
        List<Product> products4 = new ArrayList<>();
        products4.add(new Product("Gás",1200.0));
        products4.add(new Product("Energia",450.0));
        products4.add(new Product("Feira",900.0));
        Comparator<Product> comp3 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        products4.sort(comp3);
        for (Product x : products4) {
            System.out.println(x);
        }


        System.out.println();
        System.out.println("******* Comparator Lambda direto no argumento *******");
        List<Product> products5 = new ArrayList<>();
        products5.add(new Product("Uva",1200.0));
        products5.add(new Product("Manga",450.0));
        products5.add(new Product("Goiaba",900.0));
        products5.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
        for (Product x : products5) {
            System.out.println(x);
        }


    }
}

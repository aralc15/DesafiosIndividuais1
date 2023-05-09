package Mercadinho1;

import Modelo.Produto;

import java.util.ArrayList;

public class Lista {

    private static ArrayList <Produto> lanches = new ArrayList<>();

    public static void main(String[] args) {
        lanches = new ArrayList<>();
        String nome = "Cheetos";
        Double preco = 4.5;
        String nome2 = "Rufles";
        Double preco2 = 6.5;
        String nome3 = "Fofura";
        Double preco3 = 2.5;
        String nome4 = "Foleado de carne";
        Double preco4 = 5.5;
        String nome5 = "Doritos";
        Double preco5 = 4.5;
        Produto lanche = new Produto(nome, preco, nome2, preco2, nome3, preco3, nome4, preco4, nome5, preco5);
        lanches.add(lanche);
        for (Produto p : lanches)
        System.out.println(p);



    }




}

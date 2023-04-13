package Mercadinho;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class CadastroProduto {

    public static void main(String[] args) {
        Collection Produto = new ArrayList();


        ProdutoClass p1 = new ProdutoClass();
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("  //*********************************//\n // BEM-VINDO AO MERCADO ARAÚJO     //" +
                "\n//*********************************//");

        System.out.println("\n");
        System.out.println("\n");


        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 4) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                    Olá quem é você?
                    1 - Cliente
                    2 - Trabalhador
                    3 - Listar Produtos
                    4 - EXIT
                    """));
            switch (opcao) {
                case 1 -> {
                    System.out.println("\n");
                    System.out.println("\n");
                    System.out.println("  //*********************************//\n // BEM-VINDO CLIENTE               //" +
                            "\n//*********************************//");

                    System.out.println("\n");
                    System.out.println("\n");


                }

            }
        /*try (Scanner entrada = new Scanner(System.in)) {
            String continuar = "s";
            while ("s".equalsIgnoreCase(continuar)) {
                System.out.print("SKU: ");
                String sku = entrada.nextLine();

                System.out.print("Nome: ");
                String nome = entrada.nextLine();

               // if (Produto.contains(p1)) {
               //     System.err.println("Esse produto já foi adicionado. Utilize outro SKU!");
               // } else {
               //     Produto.add(p1);
               //     System.out.println("Produto adicionado.");
                //}

               // System.out.print("Deseja adicionar mais algum produto? (s/n) ");

                //continuar = entrada.nextLine();


            }


        }

    } */
        }
    }

}

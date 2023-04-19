package Mercadinho;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Mercadinho {

    public static void main(String[] args) {
        ArrayList Produto = new ArrayList();


        MercadinhoClass m1 = new MercadinhoClass();
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
                    int escolha = 0;
                    while (escolha != 11) {
                        escolha = Integer.parseInt(JOptionPane.showInputDialog("""
                                Em qual setor está o procuto que deseja comprar?
                                1 -- Lanches e balas
                                2 -- Limpeza e Higiene
                                3 -- Bebidas
                                4 -- Frios e Açogue
                                5 -- Legumes e frutas
                                6 -- Padaria
                                7 -- Enlatados
                                8 -- Cereais
                                9 -- Continuar comprando
                                10 -- Finalizar Compra
                                11 -- Voltar
                                """));
                        switch (escolha) {
                            case 1 -> {
                                System.out.println(m1.produtosEsco1());
                            }
                            case 2 -> {
                                System.out.println(m1.produtosEsco2());

                            }
                            case 10 -> {
                                System.out.println(m1.pagamento());


                            }

                        }





                    }

                }



            }
        }

    }
}

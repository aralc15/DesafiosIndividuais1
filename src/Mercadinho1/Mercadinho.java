package Mercadinho1;

import Modelo.Produto;
import Utils.utils;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Mercadinho {
    private static Scanner entrada = new Scanner(System.in);

    private static ArrayList <Produto> produtos;
    private static HashMap<Produto, Integer> carrinho;

    public static void main(String[] args) {
        produtos = new ArrayList<>();
        carrinho = new HashMap<>();
        menu();

    }
    private static void menu() {
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                    |-----------------------------------------------------------------------------------------------|
                    |------------------------- WELCOME TO ARAUJO´S MARKET --------------------|
                    |-----------------------------------------------------------------------------------------------|
                    |************** SELECIONE QUE OPERAÇÃO DESEJA FAZER ************|
                    |-----------------------------------------------------------------------------------------------|
                    Olá quem é você?
                    1 - Cliente 
                    2 - Trabalhador
                    3 - Listar Produtos
                    4 - EXIT
                    """));
            switch (opcao) {
                case 1:
                    Cliente();
                    break;

                case 2:
                    funcaoFuncionario();
                    break;

                case 3:
                    listarProdutos();
                    break;

                case 4:
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("---------- ATÉ MAIS, ARAUJO´S MARKET AGRADEÇE A PREFERÊNCIA ;D ----------");
                    System.out.println("-------------------------------------------------------------------------");
                    System.exit(0);
                    break;

                default:
                    System.out.println("EPA ESSA OPÇÃO É INVALIDA ;D");
                    menu();
                    break;
            }

    }

    private static void Cliente(){
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("""
            |-----------------------------------------------------------------------------------------------|
            |------------------------- WELCOME TO ARAUJO´S MARKET --------------------|
            |-----------------------------------------------------------------------------------------------|
            Em qual setor está o procuto que deseja comprar?
            |  1 -- Listar Produtos   |
            |  2 -- Comprar           |
            |  3 -- Ver Carrinho      |
            |  4 -- Voltar            |
            """));
            switch (escolha) {
                case 1:
                    listarProdutos();
                    break;

                case 2:
                    compraProdutos();

                    case 3:
                   verCarrinho();

                case 4:
                    menu();

            }







    }
    private static void listarProdutos() {

        if (produtos.size() > 0) {
            System.out.println("---------- LISTA DE PRODUTOS: ---------- \n");
            for (Produto p : produtos) {
                System.out.println(p);
                System.out.println("\n");
            }

        } else {
            System.out.println(" Nenhum Produto Cadastrado \n");
        }

    }

    private static void verCarrinho(){
        System.out.println("---------- Produtos no seu carrinho ---------- \n");
        if (carrinho.size() > 0){
            for (Produto p : carrinho.keySet()) {
                System.out.println("Produto: " + p + "\nQuantidade: " + carrinho.get(p));
            }
        } else {
            System.out.println("---------- CARRINHO VAZIO ---------- \n");
        }
        menu();
    }

    private static void funcaoFuncionario(){
        String login = JOptionPane.showInputDialog("Qual é o seu Login? ");
        String senha = JOptionPane.showInputDialog("Qual é a sua senha");

        if(senha.equals("admin2023")){
                System.out.printf("\nUsuário %s logado com sucesso. \n", login);
                System.out.println("|-------------------------------------------------------------------------|");
                System.out.println("|------------------------- WELCOME TO ARAUJO´S MARKET --------------------|");
                System.out.println("|-------------------------------------------------------------------------|");
                System.out.println("|****************** SELECIONE QUE OPERAÇÃO DESEJA FAZER ******************|");
                System.out.println("|-------------------------------------------------------------------------|");
                System.out.println("|  Opção 1 - Cadastrar Produto         |");
                System.out.println("|  Opção 2 - Listar                    |");
                System.out.println("|  Opção 3 - Voltar |");
                System.out.println("|  Opção 4 - Sair |");
            int esco2 = entrada.nextInt();
               switch (esco2){
                    case 1 :
                        cadastrarProduto();

                    case 2 :
                        listarProdutosFuncionario();

                   case 3 :
                       menu();

                   case 4 :
                       System.out.println("-------------------------------------------------------------------------");
                       System.out.println("---------- ATÉ MAIS, ARAUJO´S MARKET AGRADEÇE A PREFERÊNCIA ;D ----------");
                       System.out.println("-------------------------------------------------------------------------");
                       System.exit(0);

                   default:
                       System.out.println("EPA ESSA OPÇÃO É INVALIDA ;D");
                       menu();
                       break;


                }

            }else{
                System.out.println("Login ou senha inválidos!\n");
                funcaoFuncionario();

            }

    }

    private static void listarProdutosFuncionario() {
        if (produtos.size() > 0) {
            System.out.println("---------- LISTA DE PRODUTOS: ---------- \n");
            for (Produto p : produtos) {
                System.out.println(p);
                System.out.println("\n");
            }

        } else {
            System.out.println(" Nenhum Produto Cadastrado \n");
        }
        funcaoFuncionario();

    }


    private static void cadastrarProduto() {
        System.out.println("Qual o nome do produto: ");
        String nome = entrada.next();

        System.out.println("Qual o preço do produto: ");
        Double preco = entrada.nextDouble();

        Produto produto = new Produto(nome, preco);
        produtos.add(produto);

        System.out.println(produto.getNome() + " casdastrado com sucesso!! \n ");
        funcaoFuncionario();
    }


    private static void compraProdutos() {
        if (produtos.size() > 0) {

            System.out.println("---------- Produtos Disponíveis ---------- \n");
            for (Produto p : produtos) {
                System.out.println(p + "\n");

            }
            System.out.println("Código do produto: \n");
            int id = entrada.nextInt();
            boolean isPresente = false;

            for (Produto p : produtos) {
                if (produtos.size() >= id) {
                    int qtd;
                    try { //
                        p = produtos.get(id -1);
                        qtd = carrinho.get(p);
                        //se o produto ja estiver no carrinho incrementar a quantidade
                        carrinho.put(p, qtd + 1);
                    }catch (NullPointerException e){
                        // se o estiver sendo adcionado pela primeira vez
                        carrinho.put(p, 1);
                    }
                    System.out.println(p.getNome() + " Adcionado ao carrinho.");
                    isPresente = true;

                    if (isPresente) {
                        System.out.println("Deseja comtinuar comprando? ");
                        System.out.println("Digite 1 para continuar comprando, 0 para finalizar compra atual ou 2 ");
                        int esco = Integer.parseInt(entrada.next());
                        if (esco == 1) {
                            compraProdutos();
                        } else if (esco == 0 ) {
                            finalizarCompra();
                        }

                    }
                } else {
                    System.out.println("Esse Produto Não foi Encontrado");
                    menu();
                }

            }
        } else {
            System.out.println("Este produto não esta cadastrado no nosso mercado");
            menu();
        }

    }

    private static void finalizarCompra(){
        double valorCompra = 0.0;
        System.out.println("Seus Produtos: ");

        for (Produto p : carrinho.keySet()) {
            int qtd = carrinho.get(p);
            valorCompra += p.getPreco() * qtd;
            System.out.println("------------------------");
            System.out.println("| "    + p  +        " |");
            System.out.println("| Quantidade: "+ qtd +"|");
            System.out.println("------------------------");
            System.out.println("\n");

        }
        System.out.println("O valor da sua Compra é de: " + utils.doubleToString(valorCompra));
        carrinho.clear();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("---------- ATÉ MAIS, ARAUJO´S MARKET AGRADEÇE A PREFERÊNCIA ;D ----------");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\n");
        menu();
    }




}

 package Mercadinho;

 import javax.swing.*;

 public class MercadinhoClass {

    String sku; // sku é um codigo que identifica unicamente o produto (vamos criar um conversão pro sku)
    String nome; // nome é

    // getters e setters: Os
    // métodos GET e SET são técnicas padronizadas para gerenciamento sobre o acesso dos atributos.

    public String produtosEsco1() {
        System.out.println(" // Estes são nossos Produtos em estoque //");
        int esco = Integer.parseInt(JOptionPane.showInputDialog("""
                        -- 1 Cheetos REQUEJÃO 115G R$ 04,50
                        -- 2 Cheetos REQUEJÃO 280G R$ 08,50
                        -- 3 Rufles Tradicional 115G R$ 05,50
                        -- 4 Rufles Tradicional 280G R$ 10,50
                        -- 5 Doritos Tradicional 115G R$ 06,00
                        -- 6 Doritos Tradicional 280G R$ 12,50
                        """));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("//# " +
                "Em qual quantidade você deseja comprar este item #//"));
        switch (esco){
            case 1 -> {
                double valor = quantidade * 4.5;
                System.out.println(" Você quer comprar: " + quantidade + " Cheetos de 115g , isso vai dar um total de: " +
                        valor);
            }
            case 2 ->{
                double valor = quantidade * 8.5;
                System.out.println(" Você quer comprar: " + quantidade + " Cheetos de 280g , isso vai dar um total de: " +
                        valor);
            }
            case 3 ->{
                double valor = quantidade * 5.5;
                System.out.println(" Você quer comprar: " + quantidade + " Rufles de 115g , isso vai dar um total de: " +
                        valor);

            }
            case 4-> {
                double valor = quantidade * 10.5;
                System.out.println(" Você quer comprar: " + quantidade + " Rufles de 280g , isso vai dar um total de: " +
                        valor);

            }
            case 5 -> {
                double valor = quantidade * 6;
                System.out.println(" Você quer comprar: " + quantidade + " Doritos de 115g , isso vai dar um total de: " +
                        valor);
            }
            case 6 -> {
                double valor = quantidade * 12.50;
                System.out.println(" Você quer comprar: " + quantidade + " Doritos de 280g , isso vai dar um total de: " +
                        valor);
            }


        }

        return null;
    }
}



















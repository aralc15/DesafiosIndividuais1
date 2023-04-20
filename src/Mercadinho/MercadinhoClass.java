 package Mercadinho;

 import javax.swing.*;
 import java.util.Arrays;
 import java.util.Scanner;

 public class MercadinhoClass {
     Scanner entrada = new Scanner(System.in);

     String sku; // sku é um codigo que identifica unicamente o produto (vamos criar um conversão pro sku)
     String nome; // nome é
     double valor1;
     double valor2;
     String totalpagar;

     // getters e setters: Os
     // métodos GET e SET são técnicas padronizadas para gerenciamento sobre o acesso dos atributos.


     public String produtosEsco1() {
         System.out.println(" // Estes são nossos Produtos em estoque //");
         int esco1 = Integer.parseInt(JOptionPane.showInputDialog("""
                 -- 1 Cheetos REQUEJÃO 115G R$ 04,50
                 -- 2 Cheetos REQUEJÃO 280G R$ 08,50
                 -- 3 Rufles Tradicional 115G R$ 05,50
                 -- 4 Rufles Tradicional 280G R$ 10,50
                 -- 5 Doritos Tradicional 115G R$ 06,00
                 -- 6 Doritos Tradicional 280G R$ 12,50
                 """));
         int quantidade = Integer.parseInt(JOptionPane.showInputDialog("//# " +
                 "Em qual quantidade você deseja comprar este item #//"));
         switch (esco1) {
             case 1 -> {
                 double valor1 = quantidade * 4.5;
                 System.out.println(" Você quer comprar: " + quantidade + " Cheetos de 115g , isso vai dar um total de: " +
                         valor1);
             }
             case 2 -> {
                 double valor1 = quantidade * 8.5;
                 System.out.println(" Você quer comprar: " + quantidade + " Cheetos de 280g , isso vai dar um total de: " +
                         valor1);
             }
             case 3 -> {
                 double valor1 = quantidade * 5.5;
                 System.out.println(" Você quer comprar: " + quantidade + " Rufles de 15g , isso vai dar um total de: " +
                         valor1);

             }
             case 4 -> {
                 double valor1 = quantidade * 10.5;
                 System.out.println(" Você quer comprar: " + quantidade + " Rufles de 280g , isso vai dar um total de: " +
                         valor1);

             }
             case 5 -> {
                 double valor1 = quantidade * 6;
                 System.out.println(" Você quer comprar: " + quantidade + " Doritos de 115g , isso vai dar um total de: " +
                         valor1);
             }
             case 6 -> {
                 double valor1 = quantidade * 12.50;
                 System.out.println(" Você quer comprar: " + quantidade + " Doritos de 280g , isso vai dar um total de: " +
                         valor1);
             }

         }
         double valor = Double.parseDouble(pagamento());

         return null;
     }

     public String produtosEsco2() {
         System.out.println(" // Estes são nossos Produtos em estoque //");
         System.out.println("\n");

         int esco2 = Integer.parseInt(JOptionPane.showInputDialog("""
                 -- 1 Sabonete Lux Botanicals 85 G Orquídea Negra R$ 02,50
                 -- 2 Detergente Capim Limão 500 Ml - Ypê R$ 03,50
                 -- 3 Sabão em pó Brilhante concentrado Limpeza Total 1,6 Kg R$ 22,50
                 -- 4 Kit Dove Reconstrução Completa Shampoo + Condicionador 200ml R$ 27,50
                 -- 5 Pomada Para Assaduras Babymed 45g R$ 06,00
                 -- 6 Água Sanitaria YPÉ 5l R$ 12,25
                 """));
         int quantidade = Integer.parseInt(JOptionPane.showInputDialog("//# " +
                 "Em qual quantidade você deseja comprar este item #//"));
         double[] [] notasDaTurma = new double[esco2] [quantidade];

         switch (esco2) {
             case 1 -> {
                 double valor2 = quantidade * 2.5;
                 System.out.println(" Você quer comprar: " + quantidade + " Sabonte Lux 85G , isso vai dar um total de: " +
                         valor2);
             }
             case 2 -> {
                 double valor2 = quantidade * 3.5;
                 System.out.println(" Você quer comprar: " + quantidade + " Detergente Ypé 500 ml, isso vai dar um total de: " +
                         valor2);
             }
             case 3 -> {
                 double valor2 = quantidade * 22.5;
                 System.out.println(" Você quer comprar: " + quantidade + " Sabão em Pó BRILHANTE 1,6 Kg , isso vai dar um total de: " +
                         valor2);

             }
             case 4 -> {
                 double valor2 = quantidade * 27.5;
                 System.out.println(" Você quer comprar: " + quantidade + " Kit Dove , isso vai dar um total de: " +
                         valor2);

             }
             case 5 -> {
                 double valor2 = quantidade * 6;
                 System.out.println(" Você quer comprar: " + quantidade + " Pomada Babymed , isso vai dar um total de: " +
                         valor2);
             }
             case 6 -> {
                 double valor2 = quantidade * 12.25;
                 System.out.println(" Você quer comprar: " + quantidade + " Água Sanitaria YPÉ , isso vai dar um total de: " +
                         valor2);
             }



         }


         return null;
     }

     public Double valortotal() {
         double valortotal = valor1 + valor2;
         return valortotal;
     }

     public String pagamento() {
         System.out.println("Ok, vamos finalizar sua compra: ");
         System.out.println("O total da sua conta é de :" + valortotal());
         int pag = Integer.parseInt(JOptionPane.showInputDialog("""
                  1 -- CARTÃO
                  2 -- DINHEIRO
                 """));
         switch (pag) {
             case 1 -> {
                 int debCred = Integer.parseInt("""
                         1 -- Débito
                         2 -- Crédito""");
                 switch (debCred){
                     case 1 -> {
                         double pagdeb = Integer.parseInt(JOptionPane.showInputDialog("Quando deseja passar?"));
                         for (int i = 0; i < 0; i++) {
                             if (pagdeb == 0 ) {
                                 System.out.println("Sua conta ja está quitada");
                             } else {
                                 System.out.println("Você ainda está devendo ;D");
                             }


                         }
                     }

                 }

             }
         }
         return null;
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














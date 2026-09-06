package application;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Entre com as informaçoes do cliente");
        System.out.print("Nome : ");
        String nome = ler.nextLine();
        System.out.print("Email : ");
        String email = ler.nextLine();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        String dataNacimento = ler.nextLine();
        Cliente cliente = new Cliente(nome,email,LocalDate.parse(dataNacimento,fmt));
        System.out.println("Coloque os dados do Pedido : ");
        System.out.print("Status: ");
        String status = ler.nextLine();
        StatusPedido statusP = StatusPedido.valueOf(status);
        System.out.print("Quantos itens vao nesse pedido ? ");
        int itens = ler.nextInt();
        ler.nextLine();
        LocalDateTime momento = LocalDateTime.now();
        List<ItemPedido> listaP = new ArrayList<>();
        Pedido pedido = new Pedido(momento,listaP,statusP,cliente);
        for(int i = 0; i<itens;i++){
            System.out.println("Coloque o #"+(i+1)+" item");
            System.out.print("Nome do produto : ");
            String nomeProduto = ler.nextLine();
            System.out.print("Preço do produto : ");
            double precoProduto = ler.nextDouble();
            System.out.print("Quantidade : ");
            int quantidadeProduto = ler.nextInt();
            ler.nextLine();
            Produto produto = new Produto(nomeProduto,precoProduto);
            ItemPedido itempedido = new ItemPedido(produto,produto.getPreco(),quantidadeProduto);
            pedido.addItem(itempedido);
        }
        System.out.println("\nSumario do Pedido: ");
        System.out.println(cliente);
        System.out.println(pedido);
        System.out.println("\nItens do Pedido");
        for(ItemPedido item : listaP){
            System.out.println(item);
        }
        System.out.println("Preco total do Pedido : "+pedido.totalPedido());




    }
}
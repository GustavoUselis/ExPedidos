package application;

import entities.Cliente;
import entities.Pedido;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        System.out.print("Quantos itens vao nesse pedido ? ");
        int itens = ler.nextInt();



    }
}
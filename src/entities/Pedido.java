package entities;

import entities.enums.StatusPedido;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDateTime momento;
    private StatusPedido statusPedido;
    private List<ItemPedido> listaPedido = new ArrayList<>();
    private Cliente cliente;

    public Pedido(LocalDateTime momento, List<ItemPedido> listaPedido, StatusPedido statusPedido,Cliente cliente) {
        this.momento = momento;
        this.listaPedido = listaPedido;
        this.statusPedido = statusPedido;
        this.cliente = cliente;
    }
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public void addItem(ItemPedido itemPedido){
        listaPedido.add(itemPedido);
    }
    public void RemoveItem(ItemPedido itemPedido){
        listaPedido.remove(itemPedido);
    }
    public Double totalPedido(){
        double valor = 0;
        for(ItemPedido itemPedido: listaPedido){
            valor += itemPedido.valorTotal();
        }
        return valor;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do Pedido "+momento.format(fmt)+"\n");
        sb.append("Status do Pedido: "+ statusPedido+"\n");
        return sb.toString();
    }
}

package entities;

import entities.enums.StatusPedido;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private LocalDateTime momento;
    private StatusPedido statusPedido;
    private List<ItemPedido> listaPedido = new ArrayList<>();

    public Pedido(LocalDateTime momento, List<ItemPedido> listaPedido, StatusPedido statusPedido) {
        this.momento = momento;
        this.listaPedido = listaPedido;
        this.statusPedido = statusPedido;
    }
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
}

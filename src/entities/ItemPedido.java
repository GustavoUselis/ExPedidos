package entities;

public class ItemPedido {
    private Produto produto;
    private Integer quantidade;
    private Double preco;

    public ItemPedido(Produto produto, Double preco, Integer quantidade) {
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Double valorTotal(){
        return quantidade*preco;
    }
}

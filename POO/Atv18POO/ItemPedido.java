package Atv18POO;

import Atv02POO.Produto;

public class ItemPedido {
    private int quantidade;
    private Produto produto;
    
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}

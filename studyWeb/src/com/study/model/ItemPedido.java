package com.study.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ItemPedido implements Serializable{
	
	private static final long serialVersionUID = -7219910508960248688L;
	
	private BigDecimal quantidade;
	private BigDecimal valorUnitario;
	private BigDecimal valorTotal;
	private Pedido pedido;
	private Produto produto;
	
	
	
	public ItemPedido(Pedido pedido, Produto produto) {
		this.pedido = pedido;
		this.produto = produto;
	}
	
	
	
	public ItemPedido() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
}

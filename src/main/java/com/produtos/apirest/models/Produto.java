package com.produtos.apirest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_PRODUTO")
public class Produto {
	
	private static final long serialVersionUID = 1;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codProduto;
	
	private String nomeProduto;	
	private Double qtdProduto;
	private Double valorProduto;
	
	
	public Integer getCodProduto() {
		return codProduto;
	}
	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public Double getQtdProduto() {
		return qtdProduto;
	}
	public void setQtdProduto(Double qtdProduto) {
		this.qtdProduto = qtdProduto;
	}
	public Double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(Double valorProduto) {
		this.valorProduto = valorProduto;
	}
}
package br.com.prog3.trabalho4.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dependente")
public class Dependente implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="cpfEmpregado")//codigo
	private Integer cpfEmpregado;
	
	@Column(name="nome")//descricao
	private String nome;
	
	@Column(name="grauParentesco")//artigoviolado
	private String grauParentesco;
	
	@ManyToOne @JoinColumn(name="cpf")//placa
	private Empregado empregado;
	

	public Empregado getEmpregado() {
		return empregado;
	}

	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}

	public Integer getCpfEmpregado() {
		return cpfEmpregado;
	}

	public void setCpfEmpregado(Integer cpfEmpregado) {
		this.cpfEmpregado = cpfEmpregado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGrauParentesco() {
		return grauParentesco;
	}

	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}
	
	
}
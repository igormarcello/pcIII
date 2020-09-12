package br.com.prog3.trabalho4.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "empregado")
public class Empregado implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="cpf")
	private String cpf;
	
	@Column(name="idade")
	private Integer idade;
	
	@Column(name="salario")
	private Integer salario;
	
	@Column(name="nome")
	private String nome;
	
	@OneToMany (mappedBy="empregado", targetEntity=Dependente.class,
			cascade=CascadeType.ALL, fetch=FetchType.EAGER)
			private List<Dependente> dependentes;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}
	
	
	
}
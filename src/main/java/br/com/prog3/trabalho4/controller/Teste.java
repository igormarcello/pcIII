package br.com.prog3.trabalho4.controller;

import java.util.List;

import br.com.prog3.trabalho4.model.Empregado;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HibernateUtil.getSessionFactory();
		/*
		 * // incluir Empregado v = new Empregado(); EmpregadoController vc = new
		 * EmpregadoController(); v.setCpf("883.910.350-34"); v.setIdade(21);
		 * v.setSalario(1000); v.setNome("Hugo Benjamin Augusto Pereira"); vc.incluir(v)
		 * //alterar
		 * 
		 * Empregado v = new Empregado(); EmpregadoController vc = new
		 * EmpregadoController(); v.setCpf("883.910.350-34"); v.setIdade(23);
		 * v.setSalario(1005); v.setNome("Hugo Benjamin Augusto Pereira");
		 * vc.alterar(v);
		 * 
		 * //excluir
		 * 
		 * Empregado v = new Empregado(); EmpregadoController vc = new
		 * EmpregadoController(); v.setCpf("883.910.350-34"); vc.excluir(v);
		 * 
		 * 
		 * Empregado v = new Empregado(); EmpregadoController vc = new
		 * EmpregadoController(); v.setCpf("883.910.350-34"); v.setIdade(21);
		 * v.setSalario(1000); v.setNome("Hugo Benjamin Augusto Pereira");
		 * vc.incluir(v);
		 * 
		 * v.setCpf("694.903.450-40"); v.setIdade(30); v.setSalario(2500);
		 * v.setNome("Leonardo Manoel Costa"); vc.incluir(v);
		 * 
		 * v.setCpf("502.608.243-21"); v.setIdade(28); v.setSalario(1350);
		 * v.setNome("Nicole Rosa Novaes"); vc.incluir(v);
		 * 
		 * v.setCpf("488.819.012-77"); v.setIdade(30); v.setSalario(1000);
		 * v.setNome("Danilo Pedro Silva"); vc.incluir(v);
		 * 
		 * v.setCpf("127.255.235-75"); v.setIdade(34); v.setSalario(1345);
		 * v.setNome("Filipe Benjamin Assunção"); vc.incluir(v);
		 * 
		 * v.setCpf("237.551.153-01"); v.setIdade(32); v.setSalario(2479);
		 * v.setNome("Marina Sophie Elaine Assunção"); vc.incluir(v);
		 * 
		 * 
		 * 
		 * EmpregadoController vc = new EmpregadoController(); List<Empregado> lista =
		 * vc.listarTodos(); if (lista != null) { for (Empregado ve : lista) {
		 * System.out.println("CPF: " + ve.getCpf()); System.out.println("Nome: " +
		 * ve.getNome()); } }
		 

		EmpregadoController vc = new EmpregadoController();
		Empregado ve = vc.buscarPeloCPF("127.255.235-75");
		if (ve != null) {
			System.out.println("CPF: " + ve.getCpf());
			System.out.println("Nome: " + ve.getNome());
			System.out.println("Idade: " + ve.getIdade());
		}*/
	}

}

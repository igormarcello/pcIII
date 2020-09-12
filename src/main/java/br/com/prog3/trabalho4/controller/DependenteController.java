package br.com.prog3.trabalho4.controller;

import java.util.List;

import br.com.prog3.trabalho4.model.Dependente;
import br.com.prog3.trabalho4.model.Empregado;
import br.com.prog3.trabalho4.persistence.DendenteDaoImp;

public class DependenteController {

	public void incluir(Dependente dependente) {
		DendenteDaoImp md = new DendenteDaoImp();
		md.incluir(dependente);
	}

	public void alterar(Dependente dependente) {
		DendenteDaoImp md = new DendenteDaoImp();
		md.alterar(dependente);
	}

	public void excluir(Dependente dependente) {
		DendenteDaoImp md = new DendenteDaoImp();
		md.excluir(dependente);
	}

	public List<Dependente> listarTodos() {
		DendenteDaoImp md = new DendenteDaoImp();
		return md.listarTodos();
	}

	public Dependente buscarPelocpfEmpregadogo(int cpfEmpregado) {
		DendenteDaoImp md = new DendenteDaoImp();
		return md.buscarPelocpfEmpregadogo(cpfEmpregado);
	}

	public List<Dependente> buscarPeloEmpregado(Empregado empregado) {
		DendenteDaoImp md = new DendenteDaoImp();
		return md.buscarPeloEmpregado(empregado);
	}

}

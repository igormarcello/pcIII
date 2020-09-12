package br.com.prog3.trabalho4.persistence;

import java.util.List;

import br.com.prog3.trabalho4.model.Dependente;
import br.com.prog3.trabalho4.model.Empregado;

public interface DependenteDao {
	public void incluir(Dependente dependente);

	public void alterar(Dependente dependente);

	public void excluir(Dependente dependente);

	public List<Dependente> listarTodos();

	public Dependente buscarPelocpfEmpregadogo(int cpfEmpregado);

	public List<Dependente> buscarPeloEmpregado(Empregado empregado);

}

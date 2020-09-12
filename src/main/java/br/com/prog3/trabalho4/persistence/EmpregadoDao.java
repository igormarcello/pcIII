package br.com.prog3.trabalho4.persistence;

import java.util.List;

import br.com.prog3.trabalho4.model.Empregado;

public interface EmpregadoDao {
	public void incluir(Empregado empregado);

	public void alterar(Empregado empregado);

	public void excluir(Empregado empregado);

	public List<Empregado> listarTodos();

	public Empregado buscarPeloCPF(String cpf);
}
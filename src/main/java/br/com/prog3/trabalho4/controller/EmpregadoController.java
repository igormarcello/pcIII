package br.com.prog3.trabalho4.controller;

import java.util.List;

import br.com.prog3.trabalho4.model.Empregado;
import br.com.prog3.trabalho4.persistence.EmpregadoDaoImp;

public class EmpregadoController {
	
	public void incluir(Empregado empregado){
		EmpregadoDaoImp vd = new EmpregadoDaoImp();
		vd.incluir(empregado);
		}
	
	public void alterar(Empregado empregado){
		EmpregadoDaoImp vd = new EmpregadoDaoImp();
		vd.alterar(empregado);
		}
	
	public void excluir(Empregado empregado){
		EmpregadoDaoImp vd = new EmpregadoDaoImp();
		vd.excluir(empregado);
		}
	
	public List<Empregado> listarTodos(){
		EmpregadoDaoImp vd = new EmpregadoDaoImp();
		return vd.listarTodos();
		}
	
	public Empregado buscarPeloCPF(String cpf){
		EmpregadoDaoImp vd = new EmpregadoDaoImp();
		return vd.buscarPeloCPF(cpf);
		}

}

package br.com.cursojsf.dao;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.cursojsf.entities.Pessoa;

@Named
public class PessoaDAO {
	
	@Inject
	private EntityManager entityManager;
	
	public void salvar(Pessoa pessoa) {
		entityManager.persist(pessoa);
	}

}

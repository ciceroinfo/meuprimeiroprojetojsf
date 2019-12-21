package br.com.cursojsf.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ApplicationScoped
@ManagedBean
public class ExemploApplicationScoped implements Serializable {
	
	private static final long serialVersionUID = 5059902998314029785L;

	private static final Logger logger = Logger.getLogger(ExemploApplicationScoped.class.getName());

	private String nome;
	private List<String> nomes;
	
	private int count = 0;

	@PostConstruct
	public void setup() {
		nomes = new ArrayList<>();
	}

	public String addNome() {
		
		logger.info("Nome ".concat(nome));

		nomes.add(nome);

		/* retorno vazio vai para a mesma pagina */
		return "";
	}
	
	public String addNome(String nome) {
		
		logger.info("Nome ".concat(nome).concat(" Count: ").concat(++count+""));

		nomes.add(nome);

		/* retorno vazio vai para a mesma pagina */
		return "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getNomes() {
		return nomes;
	}

	public void setNomes(List<String> nomes) {
		this.nomes = nomes;
	}

}

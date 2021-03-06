package br.com.cursojsf.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.bean.NoneScoped;
import javax.faces.bean.ManagedBean;

@NoneScoped
@ManagedBean
public class ExemploNoneScoped {
	
	private static final Logger logger = Logger.getLogger(ExemploNoneScoped.class.getName());

	private String nome;
	private List<String> nomes;

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

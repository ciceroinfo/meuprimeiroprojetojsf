package br.com.cursojsf.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

@SessionScoped
@ManagedBean
public class ExemploSessionScopedPlusApplicationScoped implements Serializable {

	private static final long serialVersionUID = 8629823531131624669L;

	private static final Logger logger = LoggerFactory
			.getLogger(ExemploSessionScopedPlusApplicationScoped.class.getName());

	private String nome;
	private List<String> nomes;
	
	private int count = 0;

	@ManagedProperty(value = "#{exemploApplicationScoped}")
	private ExemploApplicationScoped exemploApplicationScoped;

	public ExemploApplicationScoped getExemploApplicationScoped() {
		return exemploApplicationScoped;
	}

	public void setExemploApplicationScoped(ExemploApplicationScoped exemploApplicationScoped) {
		this.exemploApplicationScoped = exemploApplicationScoped;
	}

	@PostConstruct
	public void setup() {
		MDC.put("TRANS_ID", UUID.randomUUID().toString());
		nomes = new ArrayList<>();
	}

	public String addNome() {

		logger.info("Nome ".concat(nome));

		nomes.add(nome);
		
		exemploApplicationScoped.addNome("Test sessionScoped " + (++count));

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

package br.com.cursojsf.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

@SessionScoped
@ManagedBean
public class ExemploSessionScoped {
	
	private static final Logger logger = LoggerFactory.getLogger(ExemploSessionScoped.class.getName());

	private String nome;
	private List<String> nomes;

	@PostConstruct
	public void setup() {
		MDC.put("TRANS_ID", UUID.randomUUID().toString());
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

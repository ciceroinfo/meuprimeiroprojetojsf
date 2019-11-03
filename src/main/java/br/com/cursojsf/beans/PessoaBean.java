package br.com.cursojsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequestScoped
@ManagedBean(name = "pessoaBean")
public class PessoaBean {
	
	private static final Logger logger = LoggerFactory.getLogger(PessoaBean.class.getName());

	private String nome, sobrenome, nomeCompleto;
	
	public String motrarNomeCompleto() {
		
		nomeCompleto = nome.concat(" ").concat(sobrenome);
		
		logger.info("Nome Completo ".concat(nomeCompleto));
		
		/* retorno vazio vai para a mesma pagina */
		return "";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

}

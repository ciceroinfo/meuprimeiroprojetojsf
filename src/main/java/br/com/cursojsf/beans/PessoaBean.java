package br.com.cursojsf.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean(name = "pessoaBean")
public class PessoaBean {

	private String nome, sobrenome, nomeCompleto;
	
	public String motrarNomeCompleto() {
		
		nomeCompleto = nome.concat(" ").concat(sobrenome);
		
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

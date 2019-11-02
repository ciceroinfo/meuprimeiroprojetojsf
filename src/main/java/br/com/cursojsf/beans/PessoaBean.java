package br.com.cursojsf.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PessoaBean {

	private String nome, sobrenome;

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

}

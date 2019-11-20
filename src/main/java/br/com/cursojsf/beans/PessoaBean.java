package br.com.cursojsf.beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.cursojsf.entities.Pessoa;

@RequestScoped
@ManagedBean(name = "pessoaBean")
public class PessoaBean {
	
	private static final Logger logger = LoggerFactory.getLogger(PessoaBean.class.getName());

	private String nome, sobrenome, nomeCompleto;
	
	private Pessoa pessoa;
	
	private static int count;
	
	@PersistenceContext(unitName = "meuprimeiroprojetojsf")
	private EntityManager entityManager;
	
	@PostConstruct
	public void setup() {
		pessoa = new Pessoa();
	}
	
	public String salvar() {
		entityManager.persist(pessoa);
		pessoa = new Pessoa();
		return null;
	}
	
	public String motrarNomeCompleto() {
		
		nomeCompleto = nome.concat(" ").concat(sobrenome);
		
		logger.info("Nome Completo ".concat(nomeCompleto));
		
		/* retorno vazio vai para a mesma pagina */
		return "";
	}
	
	public void ajaxMethod() {
		count++;
		logger.info(nome + " Médoto AJAX foi chamado [" + count + "]");
		nome = "nome alterado via ajax [" + count + "]";
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

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}

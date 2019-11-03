package br.com.cursojsf.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ViewScoped
@ManagedBean
public class ExemploViewScoped {
	
	private static final Logger logger = LoggerFactory.getLogger(ExemploViewScoped.class.getName());

	private String nome;
	private List<String> nomes;
	
	private HtmlCommandButton bindingCommandButton;

	@PostConstruct
	public void setup() {
		nomes = new ArrayList<>();
	}

	public String addNome() {
		
		logger.info("Nome ".concat(nome));

		nomes.add(nome);
		
		if (nomes.size() > 3) {
			bindingCommandButton.setDisabled(true);
		}

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

	public HtmlCommandButton getBindingCommandButton() {
		return bindingCommandButton;
	}

	public void setBindingCommandButton(HtmlCommandButton bindingCommandButton) {
		this.bindingCommandButton = bindingCommandButton;
	}

}

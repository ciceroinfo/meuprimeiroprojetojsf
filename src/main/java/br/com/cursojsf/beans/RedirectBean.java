package br.com.cursojsf.beans;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
@ManagedBean
public class RedirectBean {

	private static final Logger logger = LoggerFactory.getLogger(RedirectBean.class.getName());

	private int token;

	@PostConstruct
	public void setup() {
		logger.info("setup");
		token++;
	}

	public void check() throws IOException {
		logger.info("check" + token%2);
		if (token%2 == 0)
			FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
		else
			FacesContext.getCurrentInstance().getExternalContext().redirect("primeirapagina.xhtml");
		token++;
	}

	public int getToken() {
		return token;
	}

	public void setToken(int token) {
		this.token = token;
	}

}

package br.com.dominio.controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("msg")
@ViewScoped
public class ConfirmMsg implements Serializable {
	private static final long serialVersionUID = 1L;
	

	public void cadastrar() {
       FacesMessage message = new FacesMessage("Cadastrado com sucesso!");
       FacesContext.getCurrentInstance().addMessage(null, message);
    }
	public void atualizar() {
        FacesMessage message = new FacesMessage("Atualizado com sucesso!");
        FacesContext.getCurrentInstance().addMessage(null, message);
     }
	
	public void excluir() {
	       FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Excluído com sucesso!", null);
	       FacesContext.getCurrentInstance().addMessage(null, message);
	    }

    public void erro() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro ao cadastrar cliente!", null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

  
}

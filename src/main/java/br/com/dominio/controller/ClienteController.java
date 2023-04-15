package br.com.dominio.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.dominio.model.Cliente;

@Named("bean")
@SessionScoped
public class ClienteController implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Cliente cliente;
	
	
	private List<Cliente> clientes = new ArrayList<>();
	
	
	
	
	public String adicionar() {
		
		clientes.add(cliente);
		
		cliente = new Cliente();
		
		return null;
	}
	
	public String excluir(Cliente clienteExcluir) {
	    clientes.remove(clienteExcluir);
	    return null;
	}
	
	
	public String atualizar() {
	    for (int i = 0; i < clientes.size(); i++) {
	        if (clientes.get(i).getNome().equals(cliente.getNome())) {
	            clientes.set(i, cliente);
	            break;
	        }
	    }
	    cliente = new Cliente();
	    return null;
	}

	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	

}

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
public class ClienteController implements Serializable {
	private static final long serialVersionUID = 1L;

	private String novoNome;
	private String novoEmail;
	private String novoEndereco;
	private String novoTelefone;
	private String novoCpf;

	@Inject
	private Cliente cliente;

	private List<Cliente> clientes = new ArrayList<>();

	private List<Cliente> newClientes = new ArrayList<>();

	public List<Cliente> getNewClientes() {
		return newClientes;
	}
	

	public void setNewClientes(List<Cliente> newClientes) {
		this.newClientes = newClientes;
	}

	private static Integer proximoId = 1;

	public static Integer getNextClienteId() {
		Integer idAtual = proximoId;
		proximoId++;
		return idAtual;
	}
	

	public String adicionar() {

		cliente.setId(getNextClienteId());
		clientes.add(cliente);
	
		System.out.println("Novo ID gerado: " + cliente.getId());
		
		cliente = new Cliente();

		
		return null;
	}

	public String excluir(Cliente clienteExcluir) {
		clientes.remove(clienteExcluir);
		return null;
	}

	public String atualizar() {
		
		System.out.println("id: " + cliente.getId());
		
			Cliente clientenovo = clientes.get(cliente.getId());
			System.out.println("id cliente novo: " + clientenovo);
			
			
			System.out.println("Índice: " + cliente.getId());
			System.out.println("ID: " + clientenovo.getId());
			System.out.println("Nome: " + clientenovo.getNome());
			System.out.println("Email: " + clientenovo.getEmail());
			System.out.println("Endereço: " + clientenovo.getEndereco());
			System.out.println("Telefone: " + clientenovo.getTelefone());
			System.out.println("CPF: " + clientenovo.getCpf());
			System.out.println("---------------------------------------");

				clientenovo.setNome(novoNome);
				clientenovo.setEmail(novoEmail);
				clientenovo.setEndereco(novoEndereco);
				clientenovo.setTelefone(novoTelefone);
				clientenovo.setCpf(novoCpf);
				
				clientes.set(cliente.getId(), clientenovo);

				System.out.println("Nome: " + clientenovo.getNome());

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

	public String getNovoNome() {
		return novoNome;
	}

	public void setNovoNome(String novoNome) {
		this.novoNome = novoNome;
	}

	public String getNovoEmail() {
		return novoEmail;
	}

	public void setNovoEmail(String novoEmail) {
		this.novoEmail = novoEmail;
	}

	public String getNovoEndereco() {
		return novoEndereco;
	}

	public void setNovoEndereco(String novoEndereco) {
		this.novoEndereco = novoEndereco;
	}

	public String getNovoTelefone() {
		return novoTelefone;
	}

	public void setNovoTelefone(String novoTelefone) {
		this.novoTelefone = novoTelefone;
	}

	public String getNovoCpf() {
		return novoCpf;
	}

	public void setNovoCpf(String novoCpf) {
		this.novoCpf = novoCpf;
	}

}

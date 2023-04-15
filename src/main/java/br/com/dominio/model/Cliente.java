package br.com.dominio.model;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;

	@NotBlank(message = "O nome não pode está em branco")
	private String nome;

	@Email(message = "O email deve ser válido")
	private String email;

	@NotBlank(message = "O endereço não pode está em branco")
	private String endereco;

	@NotBlank(message = "O endereço não pode está em branco")
	private String telefone;
	
	@NotBlank(message = "O endereço não pode está em branco")
	private String cpf;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}

}

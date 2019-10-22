package com.fatec.scel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

@Entity(name = "Aluno")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NaturalId
	@Column(nullable = false, length = 13)
	@NotEmpty(message="O ra deve ser preenchido") //o atributo nao pode ser nulo e o tamanho deve ser maior que zero
	private String ra;
	
	@Column(nullable = false, length = 100)
	@NotEmpty(message="O nome deve ser preenchido")
	private String nome;
	
	@Column(nullable = false)
	@NotNull(message="Email invalido")
    @Size(min = 1, max = 50, message="O email deve ter entre 1 e 50 caracteres")
	private String email;
	
	public Aluno() {
	}

	public Aluno(String r, String n, String e) {
		this.ra = r;
		this.nome = n;
		this.email = e;
	}
	
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}

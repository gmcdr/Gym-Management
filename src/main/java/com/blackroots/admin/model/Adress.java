package com.blackroots.admin.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Adress {
	
	@Id
	private Long idAdress;
	
	private String cep;
	
	private String rua;
	
	private String bairro;
	
	@OneToMany
	private List<Student> students;

	public Adress(Long idAdress, String cep, String rua, String bairro) {
		this.idAdress = idAdress;
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Long getIdAdress() {
		return idAdress;
	}

	public void setIdAdress(Long idAdress) {
		this.idAdress = idAdress;
	}
	
	
	
}

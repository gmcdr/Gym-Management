package com.blackroots.admin.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.blackroots.admin.enums.Sexo;

@Entity
public class Student implements Serializable {
		
	private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long codAluno;
		
		private String nome;
		
		private String sobrenome;
		
		private String faixa;
		
		private String data_nasc;
		
		private String email;
		
		private String tel;
		
		private Sexo sexo;
		
		private String cpf;
		
		private String altura;
		
		private String peso;
		
		@ManyToOne
		private Adress adress;
		
		@ManyToOne
		private Payment payment;
		
		public Student(Long codAluno, String nome, String sobrenome, String faixa, String data_nasc, String email,
				String tel, Sexo sexo, String cpf, String altura, String peso) {
			this.codAluno = codAluno;
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.faixa = faixa;
			this.data_nasc = data_nasc;
			this.email = email;
			this.tel = tel;
			this.sexo = sexo;
			this.cpf = cpf;
			this.altura = altura;
			this.peso = peso;
		}

		public Long getCodAluno() {
			return codAluno;
		}

		public void setCodAluno(Long codAluno) {
			this.codAluno = codAluno;
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

		public String getFaixa() {
			return faixa;
		}

		public void setFaixa(String faixa) {
			this.faixa = faixa;
		}

		public String getData_nasc() {
			return data_nasc;
		}

		public void setData_nasc(String data_nasc) {
			this.data_nasc = data_nasc;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public Sexo getSexo() {
			return sexo;
		}

		public void setSexo(Sexo sexo) {
			this.sexo = sexo;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getAltura() {
			return altura;
		}

		public void setAltura(String altura) {
			this.altura = altura;
		}

		public String getPeso() {
			return peso;
		}

		public void setPeso(String peso) {
			this.peso = peso;
		}
		

		public Adress getAdress() {
			return adress;
		}

		public void setAdress(Adress adress) {
			this.adress = adress;
		}

		@Override
		public String toString() {
			return "Student [codAluno=" + codAluno + ", nome=" + nome + ", sobrenome=" + sobrenome + ", faixa=" + faixa
					+ ", data_nasc=" + data_nasc + ", email=" + email + ", tel=" + tel + ", sexo=" + sexo + ", cpf="
					+ cpf + ", altura=" + altura + ", peso=" + peso + "]";
		}
		
	
}

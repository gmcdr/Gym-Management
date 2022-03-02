package com.blackroots.admin.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

import com.blackroots.admin.enums.FormaPagemento;

@Entity
public class Payment {
	
	@Id
	private Long idPayment;
	
	@CreationTimestamp
	private LocalDateTime local;
	
	private FormaPagemento pagemento;
	
	@OneToMany
	private List<Student> students;
	
	public Payment(Long idPayment, LocalDateTime local, FormaPagemento pagemento) {
		this.idPayment = idPayment;
		this.local = local;
		this.pagemento = pagemento;
	}

	public Long getIdPayment() {
		return idPayment;
	}

	public void setIdPayment(Long idPayment) {
		this.idPayment = idPayment;
	}

	public LocalDateTime getLocal() {
		return local;
	}

	public void setLocal(LocalDateTime local) {
		this.local = local;
	}

	public FormaPagemento getPagemento() {
		return pagemento;
	}

	public void setPagemento(FormaPagemento pagemento) {
		this.pagemento = pagemento;
	}
	
	
		
}

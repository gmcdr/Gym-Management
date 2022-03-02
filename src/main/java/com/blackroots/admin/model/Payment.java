package com.blackroots.admin.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import org.hibernate.annotations.CreationTimestamp;

import com.blackroots.admin.enums.FormaPagemento;

@Entity
public class Payment {
		
	@CreationTimestamp
	private LocalDateTime local;
	
	private FormaPagemento pagemento;

	public Payment(LocalDateTime local, FormaPagemento pagemento) {
		this.local = local;
		this.pagemento = pagemento;
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

package com.blackroots.admin.enums;

public enum FormaPagemento {
		DINHEIRO("Dinheiro"),
		CARTAO_DEBITO("Cartão de Débito"),
		CARTAO_CREDITO("Cartão de Crédito"),
		PIX("Pix");
	
		private String displayValue;

		private FormaPagemento(String displayValue) {
			this.displayValue = displayValue;
		}

		public String getDisplayValue() {
			return displayValue;
		}		
		
}

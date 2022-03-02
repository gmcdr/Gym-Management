package com.blackroots.admin.enums;

public enum Sexo {
		
		MASCULINO("Masculino"),
		FEMININO("Feminino"),
		OUTRO("Outro");
		
		private String displayValue;
		
		private Sexo(String displayValue) {
			this.displayValue = displayValue;
		}

		public String getDisplayValue() {
			return displayValue;
		}
		
}

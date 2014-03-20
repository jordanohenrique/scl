package br.com.scl.PO;

import java.sql.Date;

public final class POExame {

	 private int ExaId;
     private int DesId;
     private Date ExaData;
     private String ExaReagente; 
     private String ExaResultado;
	public int getExaId() {
		return ExaId;
	}
	public void setExaId(int exaId) {
		ExaId = exaId;
	}
	public int getDesId() {
		return DesId;
	}
	public void setDesId(int desId) {
		DesId = desId;
	}
	public Date getExaData() {
		return ExaData;
	}
	public void setExaData(Date exaData) {
		ExaData = exaData;
	}
	public String getExaReagente() {
		return ExaReagente;
	}
	public void setExaReagente(String exaReagente) {
		ExaReagente = exaReagente;
	}
	public String getExaResultado() {
		return ExaResultado;
	}
	public void setExaResultado(String exaResultado) {
		ExaResultado = exaResultado;
	}  
     
     
}

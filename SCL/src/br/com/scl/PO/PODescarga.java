package br.com.scl.PO;

import java.sql.Date;

public final class PODescarga {

	 private int DesId;
     private int ViaId;      
     private Date DesData;
     private String DesNumero;
     private double DesQuantidade;
     private double DesQtdePrevista;
     private double DesDiferenca;
     private Date DesDataFim;
     private String DesDataFimStr;
	public int getDesId() {
		return DesId;
	}
	public void setDesId(int desId) {
		DesId = desId;
	}
	public int getViaId() {
		return ViaId;
	}
	public void setViaId(int viaId) {
		ViaId = viaId;
	}
	public Date getDesData() {
		return DesData;
	}
	public void setDesData(Date desData) {
		DesData = desData;
	}
	public String getDesNumero() {
		return DesNumero;
	}
	public void setDesNumero(String desNumero) {
		DesNumero = desNumero;
	}
	public double getDesQuantidade() {
		return DesQuantidade;
	}
	public void setDesQuantidade(double desQuantidade) {
		DesQuantidade = desQuantidade;
	}
	public double getDesQtdePrevista() {
		return DesQtdePrevista;
	}
	public void setDesQtdePrevista(double desQtdePrevista) {
		DesQtdePrevista = desQtdePrevista;
	}
	public double getDesDiferenca() {
		return DesDiferenca;
	}
	public void setDesDiferenca(double desDiferenca) {
		DesDiferenca = desDiferenca;
	}
	public Date getDesDataFim() {
		return DesDataFim;
	}
	public void setDesDataFim(Date desDataFim) {
		DesDataFim = desDataFim;
	}
	public String getDesDataFimStr() {
		return DesDataFimStr;
	}
	public void setDesDataFimStr(String desDataFimStr) {
		DesDataFimStr = desDataFimStr;
	}    
     
     
}

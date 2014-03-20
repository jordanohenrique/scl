package br.com.scl.PO;

import java.sql.Date;

public final class POAnalise {

    private int FazId;
    private Date AnaData;
    private Date AnaPercentualGordura;
    private int AnaCrioscopia;
    private Double AnaTemperatura;
    private int AnaCCS;
    private int AnaUFC;
    private Double AnaPercentualProteina;
    private String Fazenda;
    
    
	public int getFazId() {
		return FazId;
	}
	public void setFazId(int fazId) {
		FazId = fazId;
	}
	public Date getAnaData() {
		return AnaData;
	}
	public void setAnaData(Date anaData) {
		AnaData = anaData;
	}
	public Date getAnaPercentualGordura() {
		return AnaPercentualGordura;
	}
	public void setAnaPercentualGordura(Date anaPercentualGordura) {
		AnaPercentualGordura = anaPercentualGordura;
	}
	public int getAnaCrioscopia() {
		return AnaCrioscopia;
	}
	public void setAnaCrioscopia(int anaCrioscopia) {
		AnaCrioscopia = anaCrioscopia;
	}
	public Double getAnaTemperatura() {
		return AnaTemperatura;
	}
	public void setAnaTemperatura(Double anaTemperatura) {
		AnaTemperatura = anaTemperatura;
	}
	public int getAnaCCS() {
		return AnaCCS;
	}
	public void setAnaCCS(int anaCCS) {
		AnaCCS = anaCCS;
	}
	public int getAnaUFC() {
		return AnaUFC;
	}
	public void setAnaUFC(int anaUFC) {
		AnaUFC = anaUFC;
	}
	public Double getAnaPercentualProteina() {
		return AnaPercentualProteina;
	}
	public void setAnaPercentualProteina(Double anaPercentualProteina) {
		AnaPercentualProteina = anaPercentualProteina;
	}
	public String getFazenda() {
		return Fazenda;
	}
	public void setFazenda(String fazenda) {
		Fazenda = fazenda;
	}
    
    
}

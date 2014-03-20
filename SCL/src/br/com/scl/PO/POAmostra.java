package br.com.scl.PO;

import java.sql.Date;

public final class POAmostra {

	 private int AmoId;     
     private int FazId;
     private Date AmoData;
     private Date AmoHora;
     private String AmoRebanho;
     private String AmoOrigemAmostra;
     private Double AmoTemperatura;
     private String AmoIdentificacao;
     private String AmoCodigo;
     private int ProId;
     // Lookups
     private String Fazenda;
     private String Produtor;
     private String AmoExportada;
     
     
	public int getAmoId() {
		return AmoId;
	}
	public void setAmoId(int amoId) {
		AmoId = amoId;
	}
	public int getFazId() {
		return FazId;
	}
	public void setFazId(int fazId) {
		FazId = fazId;
	}
	public Date getAmoData() {
		return AmoData;
	}
	public void setAmoData(Date amoData) {
		AmoData = amoData;
	}
	public Date getAmoHora() {
		return AmoHora;
	}
	public void setAmoHora(Date amoHora) {
		AmoHora = amoHora;
	}
	public String getAmoRebanho() {
		return AmoRebanho;
	}
	public void setAmoRebanho(String amoRebanho) {
		AmoRebanho = amoRebanho;
	}
	public String getAmoOrigemAmostra() {
		return AmoOrigemAmostra;
	}
	public void setAmoOrigemAmostra(String amoOrigemAmostra) {
		AmoOrigemAmostra = amoOrigemAmostra;
	}
	public Double getAmoTemperatura() {
		return AmoTemperatura;
	}
	public void setAmoTemperatura(Double amoTemperatura) {
		AmoTemperatura = amoTemperatura;
	}
	public String getAmoIdentificacao() {
		return AmoIdentificacao;
	}
	public void setAmoIdentificacao(String amoIdentificacao) {
		AmoIdentificacao = amoIdentificacao;
	}
	public String getAmoCodigo() {
		return AmoCodigo;
	}
	public void setAmoCodigo(String amoCodigo) {
		AmoCodigo = amoCodigo;
	}
	public int getProId() {
		return ProId;
	}
	public void setProId(int proId) {
		ProId = proId;
	}
	public String getFazenda() {
		return Fazenda;
	}
	public void setFazenda(String fazenda) {
		Fazenda = fazenda;
	}
	public String getProdutor() {
		return Produtor;
	}
	public void setProdutor(String produtor) {
		Produtor = produtor;
	}
	public String getAmoExportada() {
		return AmoExportada;
	}
	public void setAmoExportada(String amoExportada) {
		AmoExportada = amoExportada;
	}
     
     
}

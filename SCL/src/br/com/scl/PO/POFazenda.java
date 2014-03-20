package br.com.scl.PO;

import java.sql.Date;

public final class POFazenda {

    private int FazId;
    private int LinId;
    private int ProId;
    private String FazCodigo;
    private String FazNome;
    private String FazEndereco;                        
    private int FazNumero;      
    private String FazBairro;
    private String FazMunicipio;
    private Double FazProducao;
    private String FazUF;
    private String FazFone;
    private int FazOrdemLinha;
    private String FazCep;
    private Date FazHoraColeta;      
    private String FazNumeroPR;                  
    private int FazFrequenciaColeta;                         
    private Date FazUltimaColeta;
    private Double FazQtdeColetada;
    // Lookups
    private String Produtor;
	public int getFazId() {
		return FazId;
	}
	public void setFazId(int fazId) {
		FazId = fazId;
	}
	public int getLinId() {
		return LinId;
	}
	public void setLinId(int linId) {
		LinId = linId;
	}
	public int getProId() {
		return ProId;
	}
	public void setProId(int proId) {
		ProId = proId;
	}
	public String getFazCodigo() {
		return FazCodigo;
	}
	public void setFazCodigo(String fazCodigo) {
		FazCodigo = fazCodigo;
	}
	public String getFazNome() {
		return FazNome;
	}
	public void setFazNome(String fazNome) {
		FazNome = fazNome;
	}
	public String getFazEndereco() {
		return FazEndereco;
	}
	public void setFazEndereco(String fazEndereco) {
		FazEndereco = fazEndereco;
	}
	public int getFazNumero() {
		return FazNumero;
	}
	public void setFazNumero(int fazNumero) {
		FazNumero = fazNumero;
	}
	public String getFazBairro() {
		return FazBairro;
	}
	public void setFazBairro(String fazBairro) {
		FazBairro = fazBairro;
	}
	public String getFazMunicipio() {
		return FazMunicipio;
	}
	public void setFazMunicipio(String fazMunicipio) {
		FazMunicipio = fazMunicipio;
	}
	public Double getFazProducao() {
		return FazProducao;
	}
	public void setFazProducao(Double fazProducao) {
		FazProducao = fazProducao;
	}
	public String getFazUF() {
		return FazUF;
	}
	public void setFazUF(String fazUF) {
		FazUF = fazUF;
	}
	public String getFazFone() {
		return FazFone;
	}
	public void setFazFone(String fazFone) {
		FazFone = fazFone;
	}
	public int getFazOrdemLinha() {
		return FazOrdemLinha;
	}
	public void setFazOrdemLinha(int fazOrdemLinha) {
		FazOrdemLinha = fazOrdemLinha;
	}
	public String getFazCep() {
		return FazCep;
	}
	public void setFazCep(String fazCep) {
		FazCep = fazCep;
	}
	public Date getFazHoraColeta() {
		return FazHoraColeta;
	}
	public void setFazHoraColeta(Date fazHoraColeta) {
		FazHoraColeta = fazHoraColeta;
	}
	public String getFazNumeroPR() {
		return FazNumeroPR;
	}
	public void setFazNumeroPR(String fazNumeroPR) {
		FazNumeroPR = fazNumeroPR;
	}
	public int getFazFrequenciaColeta() {
		return FazFrequenciaColeta;
	}
	public void setFazFrequenciaColeta(int fazFrequenciaColeta) {
		FazFrequenciaColeta = fazFrequenciaColeta;
	}
	public Date getFazUltimaColeta() {
		return FazUltimaColeta;
	}
	public void setFazUltimaColeta(Date fazUltimaColeta) {
		FazUltimaColeta = fazUltimaColeta;
	}
	public Double getFazQtdeColetada() {
		return FazQtdeColetada;
	}
	public void setFazQtdeColetada(Double fazQtdeColetada) {
		FazQtdeColetada = fazQtdeColetada;
	}
	public String getProdutor() {
		return Produtor;
	}
	public void setProdutor(String produtor) {
		Produtor = produtor;
	}
    
    
}

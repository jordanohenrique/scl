package br.com.scl.PO;

import java.sql.Date;


public final class POColeta {

	 private int ColId;
     private int ViaId;
     private int FazId;
     private String ColCodigo;
     private Date ColData;
     private boolean ColAcido;
     private Double ColTemperatura;
     private Double ColMedidaRegua;
     private String ColNumeroAmostra;
     private Double ColQuantidade;
     // Lookups
     private int ProId;
     private String Produtor;
     private String Fazenda;
     private boolean ColTanqueDest1;
     private boolean ColTanqueDest2;
     private boolean ColTanqueDest3;
     private boolean ColTanqueDest4;
     private String ColExportada;
	public int getColId() {
		return ColId;
	}
	public void setColId(int colId) {
		ColId = colId;
	}
	public int getViaId() {
		return ViaId;
	}
	public void setViaId(int viaId) {
		ViaId = viaId;
	}
	public int getFazId() {
		return FazId;
	}
	public void setFazId(int fazId) {
		FazId = fazId;
	}
	public String getColCodigo() {
		return ColCodigo;
	}
	public void setColCodigo(String colCodigo) {
		ColCodigo = colCodigo;
	}
	public Date getColData() {
		return ColData;
	}
	public void setColData(Date colData) {
		ColData = colData;
	}
	public boolean isColAcido() {
		return ColAcido;
	}
	public void setColAcido(boolean colAcido) {
		ColAcido = colAcido;
	}
	public Double getColTemperatura() {
		return ColTemperatura;
	}
	public void setColTemperatura(Double colTemperatura) {
		ColTemperatura = colTemperatura;
	}
	public Double getColMedidaRegua() {
		return ColMedidaRegua;
	}
	public void setColMedidaRegua(Double colMedidaRegua) {
		ColMedidaRegua = colMedidaRegua;
	}
	public String getColNumeroAmostra() {
		return ColNumeroAmostra;
	}
	public void setColNumeroAmostra(String colNumeroAmostra) {
		ColNumeroAmostra = colNumeroAmostra;
	}
	public Double getColQuantidade() {
		return ColQuantidade;
	}
	public void setColQuantidade(Double colQuantidade) {
		ColQuantidade = colQuantidade;
	}
	public int getProId() {
		return ProId;
	}
	public void setProId(int proId) {
		ProId = proId;
	}
	public String getProdutor() {
		return Produtor;
	}
	public void setProdutor(String produtor) {
		Produtor = produtor;
	}
	public String getFazenda() {
		return Fazenda;
	}
	public void setFazenda(String fazenda) {
		Fazenda = fazenda;
	}
	public boolean isColTanqueDest1() {
		return ColTanqueDest1;
	}
	public void setColTanqueDest1(boolean colTanqueDest1) {
		ColTanqueDest1 = colTanqueDest1;
	}
	public boolean isColTanqueDest2() {
		return ColTanqueDest2;
	}
	public void setColTanqueDest2(boolean colTanqueDest2) {
		ColTanqueDest2 = colTanqueDest2;
	}
	public boolean isColTanqueDest3() {
		return ColTanqueDest3;
	}
	public void setColTanqueDest3(boolean colTanqueDest3) {
		ColTanqueDest3 = colTanqueDest3;
	}
	public boolean isColTanqueDest4() {
		return ColTanqueDest4;
	}
	public void setColTanqueDest4(boolean colTanqueDest4) {
		ColTanqueDest4 = colTanqueDest4;
	}
	public String getColExportada() {
		return ColExportada;
	}
	public void setColExportada(String colExportada) {
		ColExportada = colExportada;
	}
     
    //collinha
    private String LinCodigo;
    private String LinNome;
    private Double ColQtde;
    
    
    
    public String getLinCodigo() {
		return LinCodigo;
	}
	public void setLinCodigo(String linCodigo) {
		LinCodigo = linCodigo;
	}
	public String getLinNome() {
		return LinNome;
	}
	public void setLinNome(String linNome) {
		LinNome = linNome;
	}
	public Double getColQtde() {
		return ColQtde;
	}
	public void setColQtde(Double colQtde) {
		ColQtde = colQtde;
	}

	// POColTanque
    private int ColTanque1;
    private int ColTanque2;
    private int ColTanque3;
    private int ColTanque4;
    private Double ColQtde1;
    private Double ColQtde2;
    private Double ColQtde3;    
    private Double ColQtde4;
	public int getColTanque1() {
		return ColTanque1;
	}
	public void setColTanque1(int colTanque1) {
		ColTanque1 = colTanque1;
	}
	public int getColTanque2() {
		return ColTanque2;
	}
	public void setColTanque2(int colTanque2) {
		ColTanque2 = colTanque2;
	}
	public int getColTanque3() {
		return ColTanque3;
	}
	public void setColTanque3(int colTanque3) {
		ColTanque3 = colTanque3;
	}
	public int getColTanque4() {
		return ColTanque4;
	}
	public void setColTanque4(int colTanque4) {
		ColTanque4 = colTanque4;
	}
	public Double getColQtde1() {
		return ColQtde1;
	}
	public void setColQtde1(Double colQtde1) {
		ColQtde1 = colQtde1;
	}
	public Double getColQtde2() {
		return ColQtde2;
	}
	public void setColQtde2(Double colQtde2) {
		ColQtde2 = colQtde2;
	}
	public Double getColQtde3() {
		return ColQtde3;
	}
	public void setColQtde3(Double colQtde3) {
		ColQtde3 = colQtde3;
	}
	public Double getColQtde4() {
		return ColQtde4;
	}
	public void setColQtde4(Double colQtde4) {
		ColQtde4 = colQtde4;
	} 

}

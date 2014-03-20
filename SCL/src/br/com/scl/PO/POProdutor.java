package br.com.scl.PO;

import android.database.Cursor;


public final class POProdutor {

	private long ProId;
	private String ProCodigo;
	private String ProNome;
	private String ProEndereco;
	private int ProNumero;
	private String ProBairro;
	private String ProMunicipio;
	private String ProEstado;
	private String ProUF;
	private String ProCep;
	private String ProFoneResidencial;
	private String ProFoneComercial;
	private String ProCelular;
	private String ProCPFCNPJ;
	private String ProIE;
	private String ProEmail;
	private String ProGuid;
      
    
    public POProdutor(Cursor cursor) {
    	
        this.ProId = cursor.getLong(cursor.getColumnIndex("ProId"));
        this.ProCodigo = cursor.getString(cursor.getColumnIndex("ProCodigo")); 
        this.ProNome = cursor.getString(cursor.getColumnIndex(""));
        this.ProEndereco = cursor.getString(cursor.getColumnIndex(""));
        this.ProNumero = cursor.getInt(cursor.getColumnIndex(""));
        this.ProBairro = cursor.getString(cursor.getColumnIndex(""));
        this.ProMunicipio = cursor.getString(cursor.getColumnIndex(""));
        this.ProEstado = cursor.getString(cursor.getColumnIndex(""));
        this.ProUF = cursor.getString(cursor.getColumnIndex(""));
        this.ProCep = cursor.getString(cursor.getColumnIndex(""));
        this.ProFoneResidencial = cursor.getString(cursor.getColumnIndex(""));
        this.ProFoneComercial = cursor.getString(cursor.getColumnIndex(""));
        this.ProCelular = cursor.getString(cursor.getColumnIndex(""));
        this.ProCPFCNPJ = cursor.getString(cursor.getColumnIndex(""));
        this.ProIE = cursor.getString(cursor.getColumnIndex(""));
        this.ProEmail = cursor.getString(cursor.getColumnIndex(""));
        this.ProGuid = cursor.getString(cursor.getColumnIndex(""));
	}
    
    public POProdutor() {
		
	}
      
	public long getProId() {
		return ProId;
	}
	public void setProId(long proId) {
		ProId = proId;
	}
	public String getProCodigo() {
		return ProCodigo;
	}
	public void setProCodigo(String proCodigo) {
		ProCodigo = proCodigo;
	}
	public String getProNome() {
		return ProNome;
	}
	public void setProNome(String proNome) {
		ProNome = proNome;
	}
	public String getProEndereco() {
		return ProEndereco;
	}
	public void setProEndereco(String proEndereco) {
		ProEndereco = proEndereco;
	}
	public int getProNumero() {
		return ProNumero;
	}
	public void setProNumero(int proNumero) {
		ProNumero = proNumero;
	}
	public String getProBairro() {
		return ProBairro;
	}
	public void setProBairro(String proBairro) {
		ProBairro = proBairro;
	}
	public String getProMunicipio() {
		return ProMunicipio;
	}
	public void setProMunicipio(String proMunicipio) {
		ProMunicipio = proMunicipio;
	}
	public String getProEstado() {
		return ProEstado;
	}
	public void setProEstado(String proEstado) {
		ProEstado = proEstado;
	}
	public String getProUF() {
		return ProUF;
	}
	public void setProUF(String proUF) {
		ProUF = proUF;
	}
	public String getProCep() {
		return ProCep;
	}
	public void setProCep(String proCep) {
		ProCep = proCep;
	}
	public String getProFoneResidencial() {
		return ProFoneResidencial;
	}
	public void setProFoneResidencial(String proFoneResidencial) {
		ProFoneResidencial = proFoneResidencial;
	}
	public String getProFoneComercial() {
		return ProFoneComercial;
	}
	public void setProFoneComercial(String proFoneComercial) {
		ProFoneComercial = proFoneComercial;
	}
	public String getProCelular() {
		return ProCelular;
	}
	public void setProCelular(String proCelular) {
		ProCelular = proCelular;
	}
	public String getProCPFCNPJ() {
		return ProCPFCNPJ;
	}
	public void setProCPFCNPJ(String proCPFCNPJ) {
		ProCPFCNPJ = proCPFCNPJ;
	}
	public String getProIE() {
		return ProIE;
	}
	public void setProIE(String proIE) {
		ProIE = proIE;
	}
	public String getProEmail() {
		return ProEmail;
	}
	public void setProEmail(String proEmail) {
		ProEmail = proEmail;
	}
	public String getProGuid() {
		return ProGuid;
	}
	public void setProGuid(String proGuid) {
		ProGuid = proGuid;
	}        
      

	
}

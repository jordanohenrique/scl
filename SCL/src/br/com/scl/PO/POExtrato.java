package br.com.scl.PO;

import java.sql.Date;

public final class POExtrato {

    private int ExtId;     
    private int FazId;
    private Date ExtDataColeta;
    private Double ExtVolumeColeta;
    private Double ExtTemperatura;
    private int ColId;
    // Lookups
    private String Fazenda;
    private int AnaId;
	public int getExtId() {
		return ExtId;
	}
	public void setExtId(int extId) {
		ExtId = extId;
	}
	public int getFazId() {
		return FazId;
	}
	public void setFazId(int fazId) {
		FazId = fazId;
	}
	public Date getExtDataColeta() {
		return ExtDataColeta;
	}
	public void setExtDataColeta(Date extDataColeta) {
		ExtDataColeta = extDataColeta;
	}
	public Double getExtVolumeColeta() {
		return ExtVolumeColeta;
	}
	public void setExtVolumeColeta(Double extVolumeColeta) {
		ExtVolumeColeta = extVolumeColeta;
	}
	public Double getExtTemperatura() {
		return ExtTemperatura;
	}
	public void setExtTemperatura(Double extTemperatura) {
		ExtTemperatura = extTemperatura;
	}
	public int getColId() {
		return ColId;
	}
	public void setColId(int colId) {
		ColId = colId;
	}
	public String getFazenda() {
		return Fazenda;
	}
	public void setFazenda(String fazenda) {
		Fazenda = fazenda;
	}
	public int getAnaId() {
		return AnaId;
	}
	public void setAnaId(int anaId) {
		AnaId = anaId;
	}
    
    
}

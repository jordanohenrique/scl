package br.com.scl.PO;

import java.sql.Date;

public final class POViagem {

	 private int ViaId;
     private int TraId;
     private int RotId;
     private Date ViaData;
     private Date ViaDataFim;
     private int ViaKmInicial;
     private int ViaKmFinal;
     private int ViaKmPercorridos;
     private int ViaTanques; 
     private String ViaEstadoTanques;
     private String ViaStatus;
     // Lookups
     private String Rota;
     private String Transportador;
     
     
	public int getViaId() {
		return ViaId;
	}
	public void setViaId(int viaId) {
		ViaId = viaId;
	}
	public int getTraId() {
		return TraId;
	}
	public void setTraId(int traId) {
		TraId = traId;
	}
	public int getRotId() {
		return RotId;
	}
	public void setRotId(int rotId) {
		RotId = rotId;
	}
	public Date getViaData() {
		return ViaData;
	}
	public void setViaData(Date viaData) {
		ViaData = viaData;
	}
	public Date getViaDataFim() {
		return ViaDataFim;
	}
	public void setViaDataFim(Date viaDataFim) {
		ViaDataFim = viaDataFim;
	}
	public int getViaKmInicial() {
		return ViaKmInicial;
	}
	public void setViaKmInicial(int viaKmInicial) {
		ViaKmInicial = viaKmInicial;
	}
	public int getViaKmFinal() {
		return ViaKmFinal;
	}
	public void setViaKmFinal(int viaKmFinal) {
		ViaKmFinal = viaKmFinal;
	}
	public int getViaKmPercorridos() {
		return ViaKmPercorridos;
	}
	public void setViaKmPercorridos(int viaKmPercorridos) {
		ViaKmPercorridos = viaKmPercorridos;
	}
	public int getViaTanques() {
		return ViaTanques;
	}
	public void setViaTanques(int viaTanques) {
		ViaTanques = viaTanques;
	}
	public String getViaEstadoTanques() {
		return ViaEstadoTanques;
	}
	public void setViaEstadoTanques(String viaEstadoTanques) {
		ViaEstadoTanques = viaEstadoTanques;
	}
	public String getViaStatus() {
		return ViaStatus;
	}
	public void setViaStatus(String viaStatus) {
		ViaStatus = viaStatus;
	}
	public String getRota() {
		return Rota;
	}
	public void setRota(String rota) {
		Rota = rota;
	}
	public String getTransportador() {
		return Transportador;
	}
	public void setTransportador(String transportador) {
		Transportador = transportador;
	}
     
     
}

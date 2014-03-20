package br.com.scl.PO;

import java.sql.Date;

public final class POArmazenamento {

	  private int ArmId;
      private int DesId;
      private int ArmBalao;
      private double ArmQtde;
      private Date ArmData;
      
      
	public int getArmId() {
		return ArmId;
	}
	public void setArmId(int armId) {
		ArmId = armId;
	}
	public int getDesId() {
		return DesId;
	}
	public void setDesId(int desId) {
		DesId = desId;
	}
	public int getArmBalao() {
		return ArmBalao;
	}
	public void setArmBalao(int armBalao) {
		ArmBalao = armBalao;
	}
	public double getArmQtde() {
		return ArmQtde;
	}
	public void setArmQtde(double armQtde) {
		ArmQtde = armQtde;
	}
	public Date getArmData() {
		return ArmData;
	}
	public void setArmData(Date armData) {
		ArmData = armData;
	}
      
      
}

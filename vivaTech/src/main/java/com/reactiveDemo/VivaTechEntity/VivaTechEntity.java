package com.reactiveDemo.VivaTechEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VivaTechEntity {
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	public int vivaId;
	public String vivaEmpName;
	public String vivaMail;
	public int getVivaId() {
		return vivaId;
	}
	public void setVivaId(int vivaId) {
		this.vivaId = vivaId;
	}
	public String getVivaEmpName() {
		return vivaEmpName;
	}
	public void setVivaEmpName(String vivaEmpName) {
		this.vivaEmpName = vivaEmpName;
	}
	public String getVivaMail() {
		return vivaMail;
	}
	public void setVivaMail(String vivaMail) {
		this.vivaMail = vivaMail;
	}
	@Override
	public String toString() {
		return "VivaTechEntity [vivaId=" + vivaId + ", vivaEmpName=" + vivaEmpName + ", vivaMail=" + vivaMail + "]";
	}
	public VivaTechEntity(int vivaId, String vivaEmpName, String vivaMail) {
		super();
		this.vivaId = vivaId;
		this.vivaEmpName = vivaEmpName;
		this.vivaMail = vivaMail;
	}
	public VivaTechEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}

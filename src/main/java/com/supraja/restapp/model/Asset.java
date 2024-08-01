package com.supraja.restapp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "assetproducts")
public class Asset {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	@Column
	private String assname;
    @Column
    private String asstype;
    @Column
    private String assvalue;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAssname() {
		return assname;
	}
	public void setAssname(String assname) {
		this.assname = assname;
	}
	public String getAsstype() {
		return asstype;
	}
	public void setAsstype(String asstype) {
		this.asstype = asstype;
	}
	public String getAssvalue() {
		return assvalue;
	}
	public void setAssvalue(String assvalue) {
		this.assvalue = assvalue;
	}
	public Asset(int aid, String assname, String asstype, String assvalue) {
		super();
		this.aid = aid;
		this.assname = assname;
		this.asstype = asstype;
		this.assvalue = assvalue;
	}
	public Asset() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
 package org.malak.employes.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEmp;
	private String nom;
	private String prenom;
	private String CIN;
	private String service;
	@JsonFormat(pattern="yyyy-MM-dd")
	private String dateNaiss;
	
	@ManyToOne
	private Societe societe;
	
	public Employee() {
		super();
	}

	public Employee(String nom, String prenom, String cIN, String service, String date) {
		super();
		this.nom =nom;
		this.prenom = prenom;
		CIN = cIN;
		this.service = service;
		this.dateNaiss = date;
	}

	
	public Long getIdEmp() {
		return idEmp;
	}

	public void setIdEmp(Long idEmp) {
		this.idEmp = idEmp;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCIN() {
		return CIN;
	}

	public void setCIN(String cIN) {
		CIN = cIN;
	}
	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}


	public String getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(String dateNaiss) {
		this.dateNaiss = dateNaiss;
	}

	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	@Override
	public String toString() {
		return "Employee idEmp=" + idEmp + ", nom=" + nom + ", prenom=" + prenom + ", CIN=" + CIN + ", service="
				+ service + ", dateNaiss=" + dateNaiss + ", societe=" + societe.getIdSociete();
	}
	
	
}

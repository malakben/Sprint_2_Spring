package org.malak.employes.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Societe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSociete;
	private String nomS;
	private	String description;
	@OneToMany(mappedBy = "societe")
	@JsonIgnore
	private List<Employee> employes;
	public Societe(Long idSociete, String nomS, String description, List<Employee> employes) {
		super();
		this.idSociete = idSociete;
		this.nomS = nomS;
		this.description = description;
		this.employes = employes;
	}
	public Societe() {
		super();
	}
	public Long getIdSociete() {
		return idSociete;
	}
	public void setIdSociete(Long idSociete) {
		this.idSociete = idSociete;
	}
	public String getNomS() {
		return nomS;
	}
	public void setNomS(String nomS) {
		this.nomS = nomS;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Employee> getEmployes() {
		return employes;
	}
	public void setEmployes(List<Employee> employes) {
		this.employes = employes;
	}
	@Override
	public String toString() {
		return "Societe [idSociete=" + idSociete + ", nomS=" + nomS + ", description=" + description + ", employes="
				+ employes + "]";
	}
	
	
	
}

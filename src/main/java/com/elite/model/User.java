package com.elite.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	@Column(nullable = false)
private String nom_complet;
@Column(nullable = false)
@Min(value = 18,message = "l'age doit être > 18")
private int age;

private String adresse;
@Column(nullable = false)
private String telephone;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNom_complet() {
	return nom_complet;
}
public void setNom_complet(String nom_complet) {
	this.nom_complet = nom_complet;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getTelephone() {
	return telephone;
}
public void setTelephone(String telephone) {
	this.telephone = telephone;
}





}

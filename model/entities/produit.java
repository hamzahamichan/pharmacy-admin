package model.entities;

public class produit {
 private int id;
 private String designation;
 private double prix;
 private int quantite;
 
public long getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return designation;
}
public void setName(String name) {
	this.designation = name;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
public int getQuantité() {
	return quantite;
}
public void setQuantité(int quantité) {
	this.quantite = quantité;
}
public produit(String designation, double prix, int quantité) {
	super();
	this.designation = designation;
	this.prix = prix;
	this.quantite = quantité;
}
public produit() {

}
}

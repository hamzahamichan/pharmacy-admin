package dao;

import java.util.List;

import model.entities.produit;

public interface IProduitDeo {
List<produit> getAllProduit();
List<produit>getProduitsParMC(String mc);
void ajouterProduit(produit p);
void supprimerProduit(int id);
}

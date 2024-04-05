package dao;

import java.sql.*;
import java.util.List;

import model.entities.produit;

public class ProduitDao implements IProduitDeo{

	@Override
	public List<produit> getAllProduit() {
		Connection con=SingletonConnection.getConnection();
		PreparedStatement ps;
		
		ps= con.prepareStatement("SELECT * FROM class.les_medicament");
		return null;
	}

	@Override
	public List<produit> getProduitsParMC(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterProduit(produit p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerProduit(int id) {
		// TODO Auto-generated method stub
		
	}

}

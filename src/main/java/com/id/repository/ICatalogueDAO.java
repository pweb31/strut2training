package com.id.repository;

import java.util.List;

import com.id.entites.Produit;

public interface ICatalogueDAO {
	public void ajouterProduit(Produit p);
	public List<Produit> listProduit();
	public Produit recupererProduit(String ref);
	public void supprimerProduit(String ref);
	public void miseAjourProduit(Produit p);
}

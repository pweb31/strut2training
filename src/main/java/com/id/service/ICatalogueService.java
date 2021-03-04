package com.id.service;

import java.util.List;

import com.id.entites.Produit;

public interface ICatalogueService {
	public void ajouterProduit(Produit p);
	public List<Produit> listProduit();
	public Produit recupererProduit(String ref);
	public void supprimerProduit(String ref);
	public void miseAjourProduit(Produit p);
}

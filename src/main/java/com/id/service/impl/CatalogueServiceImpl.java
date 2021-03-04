package com.id.service.impl;

import java.util.List;

import com.id.entites.Produit;
import com.id.repository.ICatalogueDAO;
import com.id.service.ICatalogueService;

public class CatalogueServiceImpl implements ICatalogueService {
	private ICatalogueDAO dao;
	
	
	public void setDao(ICatalogueDAO dao) {
		this.dao = dao;
	}

	@Override
	public void ajouterProduit(Produit p) {
		dao.ajouterProduit(p);

	}

	@Override
	public List<Produit> listProduit() {
		return dao.listProduit();
	}

	@Override
	public Produit recupererProduit(String ref) {
		return dao.recupererProduit(ref);
	}

	@Override
	public void supprimerProduit(String ref) {
		dao.supprimerProduit(ref);

	}

	@Override
	public void miseAjourProduit(Produit p) {
		dao.miseAjourProduit(p);

	}

}

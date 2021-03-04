package com.id.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.id.entites.Produit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CatalogueDAOImpl implements ICatalogueDAO {

	private Map<String, Produit> produits = new HashMap<String,Produit>();
	Logger log = LogManager.getLogger(this.getClass());
	@Override
	public void ajouterProduit(Produit p) {
		produits.put(p.getReference(), p);

	}

	@Override
	public List<Produit> listProduit() {
		return new ArrayList<Produit>(produits.values());
	}

	@Override
	public Produit recupererProduit(String ref) {
		// TODO Auto-generated method stub
		return produits.get(ref);
	}

	@Override
	public void supprimerProduit(String ref) {
		produits.remove(ref);

	}

	@Override
	public void miseAjourProduit(Produit p) {
		produits.put(p.getReference(),p);

	}
	
	public void initialisation() {
		ajouterProduit(new Produit("AB","AB",9800,5,true));
		ajouterProduit(new Produit("CD","EF",7500,3,true));
		ajouterProduit(new Produit("IJ","KL",3500,5,true));
		ajouterProduit(new Produit("LM","OP",1747,8,true));
		log.info("Initialisation des produits");
	}

}

package com.id.web;

import java.util.List;

import org.modelmapper.ModelMapper;

import com.id.dto.ProduitDto;
import com.id.entites.Produit;
import com.id.service.ICatalogueService;
import com.id.service.SingletonService;
import com.opensymphony.xwork2.ActionSupport;

//Dans Struts le ModelAction(les actions) hérite de la classe ActionSupport
public class ProduitAction extends ActionSupport {
	private ProduitDto produitDto = new ProduitDto();
	private Produit produit = new Produit();
	private List<Produit> produits;
	private String ref;
	private boolean editMode = false;
	private ICatalogueService service = SingletonService.getService();

	/*
	 * ModelMapper modelMapper = new ModelMapper(); produit =
	 * modelMapper.map(produitDto, Produit.class);
	 */
	public String index( ) {
		//SUCCESS est une constante héritée de ACtionSupport
		produits = service.listProduit();
		return SUCCESS;
	}
	
	public String save() {
		if(editMode == false) 
		service.ajouterProduit(produit);
		else
		service.miseAjourProduit(produit);
		produits = service.listProduit();
		return SUCCESS;
	}
	
	public String delete() {
		service.supprimerProduit(ref);
		produits = service.listProduit();
		return SUCCESS;
	}
	
	public String edit() {
		editMode = true;
		produit = service.recupererProduit(ref);
		service.miseAjourProduit(produit);
		produits = service.listProduit();
		return SUCCESS;
	}
	
	public Produit getProduit() {
		return produit;
	}
	
	
	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}



	public List<Produit> getProduits() {
		return produits;
	}


	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}


	public ProduitDto getProduitDto() {
		return produitDto;
	}
	public void setProduitDto(ProduitDto produitDto) {
		this.produitDto = produitDto;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
	
	

}

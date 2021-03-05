package com.id.web;

import com.opensymphony.xwork2.ActionSupport;

//Dans Struts le ModelAction(les actions) hérite de la classe ActionSupport
public class ProduitAction extends ActionSupport {
	public String index( ) {
		//SUCCESS est une constante héritée de ACtionSupport
		return SUCCESS;
	}

}

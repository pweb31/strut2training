package com.id.service;

import com.id.repository.CatalogueDAOImpl;
import com.id.service.impl.CatalogueServiceImpl;

public class SingletonService {
private static CatalogueServiceImpl service;
static {
	CatalogueDAOImpl dao = new CatalogueDAOImpl();
	dao.initialisation();
	service = new CatalogueServiceImpl();
	service.setDao(dao);
}
public static CatalogueServiceImpl getService() {
	return service;
}

}

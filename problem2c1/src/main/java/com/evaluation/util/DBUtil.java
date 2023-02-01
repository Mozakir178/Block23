package com.evaluation.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	
	static EntityManagerFactory emf ;
	static {
		emf = Persistence.createEntityManagerFactory("productUnit");
	}
	
	public static EntityManager getConnection() {
		return emf.createEntityManager() ;
	}

}

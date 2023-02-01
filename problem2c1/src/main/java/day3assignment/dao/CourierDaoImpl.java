package day3assignment.dao;

import javax.persistence.EntityManager;


import day3assignment.model.Courier;
import day3assignment.util.DBUtil;

public class CourierDaoImpl implements CourierDao{

	
	@Override
	public Courier findCourier(int id) {

		EntityManager em = DBUtil.getConnection();
		em.getTransaction().begin();
		Courier courier = em.find(Courier.class , id);
		em.getTransaction().commit();
		em.close();
		return courier ;
	}

	@Override
	public Courier createCourier(Courier courier) {
		EntityManager em = DBUtil.getConnection();
		em.getTransaction().begin();
		em.persist(courier);
		em.getTransaction().commit();
		em.close();
		if(courier == null) throw new RuntimeException("No courier found") ;
		return courier ;
	}

	@Override
	public Courier deleteCourier(int id) {
		EntityManager em = DBUtil.getConnection();
		em.getTransaction().begin();
		Courier courier = em.find(Courier.class , id);
		
		if(courier != null) {
			em.remove(courier);
		}
		else throw new RuntimeException("courier not found");
		em.getTransaction().commit();
		em.close();
		return courier ;
	}

	@Override
	public Courier updateCourier(int id, String content, double weight, String address) {
		EntityManager em = DBUtil.getConnection();
		em.getTransaction().begin();
		Courier courier = em.find(Courier.class , id);
		
		if(courier != null) {
			courier.setContent(content);
			courier.setWeight(weight);
			courier.setRecipientAddress(address);
			em.merge(courier) ;
		}
		else throw new RuntimeException("courier not found");
		em.getTransaction().commit();
		em.close();
		return courier ;
	}

}

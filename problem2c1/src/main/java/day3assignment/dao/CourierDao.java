package day3assignment.dao;

import day3assignment.model.Courier;

public interface CourierDao {
	
	public Courier findCourier(int id);
	public Courier createCourier(Courier courier);
	public Courier deleteCourier(int id);
	public Courier updateCourier(int id , String content, double weight , String address);
	
	

}

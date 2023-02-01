package com.evaluation.dao;

import com.evaluation.model.Courier;

public interface CourierDao {
	
	public Courier findCourier(int id);
	public Courier createCourier(Courier courier);
	public Courier deleteCourier(int id);
	public Courier updateCourier(int id , String content, double weight , String address);
	
	

}

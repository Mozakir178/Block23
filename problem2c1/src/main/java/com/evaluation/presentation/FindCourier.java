package com.evaluation.presentation;

import com.evaluation.dao.CourierDao;
import com.evaluation.dao.CourierDaoImpl;
import com.evaluation.model.Courier;

public class FindCourier {

	public static void main(String[] args) {
		CourierDao pDao = new CourierDaoImpl();
		Courier courier = pDao.findCourier(1);
		System.out.println(courier);
	}
}

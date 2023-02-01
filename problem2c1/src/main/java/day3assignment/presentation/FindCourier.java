package day3assignment.presentation;

import day3assignment.dao.CourierDao;
import day3assignment.dao.CourierDaoImpl;
import day3assignment.model.Courier;

public class FindCourier {

	public static void main(String[] args) {
		CourierDao pDao = new CourierDaoImpl();
		Courier courier = pDao.findCourier(1);
		System.out.println(courier);
	}
}

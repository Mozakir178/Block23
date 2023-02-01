package day3assignment.presentation;

import day3assignment.dao.CourierDaoImpl;
import day3assignment.model.Courier;

public class DeleteCourier {
	public static void main(String[] args) {
		CourierDaoImpl cdao = new CourierDaoImpl();
		Courier courier = cdao.deleteCourier(1) ;
		System.out.println(courier);
	}

}

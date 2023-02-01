package day3assignment.presentation;

import day3assignment.dao.CourierDaoImpl;
import day3assignment.model.Courier;

public class UpdateCourier {

	public static void main(String[] args) {
		CourierDaoImpl cdao = new CourierDaoImpl();
		Courier courier2 = cdao.updateCourier(1,"Vegetable" , 6.0 , "Amravati");
		System.out.println(courier2);
	}
}

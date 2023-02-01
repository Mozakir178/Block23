package day3assignment.presentation;

import day3assignment.dao.CourierDaoImpl;
import day3assignment.model.Courier;

public class InsertCourier {
	public static void main(String[] args) {
		CourierDaoImpl cdao = new CourierDaoImpl();
		Courier courier = new Courier("Ab123", "Vegetable Basket", 4.5, "K 28, Green Park Extn, New Delhi","Akshya Nagar 1st Block, Rammurthy nagar, Bangalore", null);
		Courier courier2 = cdao.createCourier(courier);
		System.out.println(courier2);
	}

}

package com.evaluation.presentation;

import com.evaluation.dao.CourierDaoImpl;
import com.evaluation.model.Courier;

public class UpdateCourier {

	public static void main(String[] args) {
		CourierDaoImpl cdao = new CourierDaoImpl();
		Courier courier2 = cdao.updateCourier(1,"Vegetable" , 6.0 , "Amravati");
		System.out.println(courier2);
	}
}

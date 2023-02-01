package com.evaluation.presentation;

import com.evaluation.dao.CourierDaoImpl;
import com.evaluation.model.Courier;

public class DeleteCourier {
	public static void main(String[] args) {
		CourierDaoImpl cdao = new CourierDaoImpl();
		Courier courier = cdao.deleteCourier(1) ;
		System.out.println(courier);
	}

}

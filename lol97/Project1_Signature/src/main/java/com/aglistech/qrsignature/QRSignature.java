package com.aglistech.qrsignature;

import com.aglistech.qrsignature.controllers.UserController;

public class QRSignature {
	public static void main(String[] args) {
		try {
			UserController userController = new UserController();
			String res = userController.getUser(1);
			System.out.println(res);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
		
	}
}

package com.jspiders.main;

import com.jspiders.structural.UserService;

public class UserMain {

	public static void main(String[] args) {

		UserService userService = new UserService();
		userService.signUp();
		userService.logIn();

	}

}

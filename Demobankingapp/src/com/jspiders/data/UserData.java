package com.jspiders.data;

import com.jspiders.entity.User;

public interface UserData {

	void addUser(User user);

	void deleteUser(int securityPin);

	void updateUser(int securityPin);

	void findUser(int securityPin);

}


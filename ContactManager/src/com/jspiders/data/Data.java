package com.jspiders.data;

import com.jspiders.entity.Contact;

public interface Data {

	void addContact(Contact contact);

	void deleteContact(int id);
	
	Contact findContactById(int id);

	Contact[] findAllContacts();

}


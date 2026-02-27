/******************************************************************************
 * Author:       Matthew R. Wood
 * Course:       CS-320 Software Test, Auto & QA
 * Project:      Project One - Contact Service
 * File:         ContactService.java
 * Description:  The service layer for managing contacts. Handles in-memory 
 * storage, unique ID verification, and CRUD operations.
 ******************************************************************************/

package edu.snhu.cs320.contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contact == null || contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Duplicate or null contact");
        }
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String id) {
        if (!contacts.containsKey(id)) {
            throw new IllegalArgumentException("Contact not found");
        }
        contacts.remove(id);
    }

    public void updateContact(String id, String first, String last, String phone, String address) {
        Contact c = contacts.get(id);
        if (c == null) throw new IllegalArgumentException("Contact not found");
        c.setFirstName(first);
        c.setLastName(last);
        c.setPhone(phone);
        c.setAddress(address);
    }

    // Needed for JUnit Verification
    protected Map<String, Contact> getContacts() {
        return contacts;
    }
}
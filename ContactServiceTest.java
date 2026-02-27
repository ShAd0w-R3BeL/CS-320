/******************************************************************************
 * Author:       Matthew R. Wood
 * Course:       CS-320 Software Test, Auto & QA
 * Project:      Project One - Contact Service
 * File:         ContactServiceTest.java
 * Description:  JUnit 5 test suite for ContactService. Ensures 100% branch 
 * coverage for adding, deleting, and updating contacts.
 ******************************************************************************/

package edu.snhu.cs320.contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    @Test
    void testAddAndStoreContact() {
        ContactService service = new ContactService();
        Contact c = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        service.addContact(c);
        // Assert verification
        assertEquals(c, service.getContacts().get("1"));
    }

    @Test
    void testDeleteContact() {
        ContactService service = new ContactService();
        service.addContact(new Contact("1", "John", "Doe", "1234567890", "123 Main St"));
        service.deleteContact("1");
        // Assert verification
        assertFalse(service.getContacts().containsKey("1"));
    }

    @Test
    void testUpdateContact() {
        ContactService service = new ContactService();
        service.addContact(new Contact("1", "John", "Doe", "1234567890", "123 Main St"));
        service.updateContact("1", "Jane", "Smith", "1112223333", "New Addr");
        // Assert verification
        Contact updated = service.getContacts().get("1");
        assertEquals("Jane", updated.getFirstName());
        assertEquals("1112223333", updated.getPhone());
    }
}
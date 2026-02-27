/******************************************************************************
 * Author:       Matthew R. Wood
 * Course:       CS-320 Software Test, Auto & QA
 * Project:      Project One - Contact Service
 * File:         ContactTest.java
 * Description:  JUnit 5 test suite for the Contact class. Validates 
 * constructor constraints and boundary value analysis.
 ******************************************************************************/

package edu.snhu.cs320.contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    void testContactCreationSuccess() {
        Contact contact = new Contact("12345", "Matthew", "Wood", "1234567890", "123 State St");
        assertAll("Contact State",
            () -> assertEquals("12345", contact.getContactId()),
            () -> assertEquals("Matthew", contact.getFirstName()),
            () -> assertEquals("Wood", contact.getLastName()),
            () -> assertEquals("1234567890", contact.getPhone()),
            () -> assertEquals("123 State St", contact.getAddress())
        );
    }

    @Test
    void testContactIdValidation() {
        // Requirement: ID not null and <= 10 characters
        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Matt", "Wood", "1234567890", "Addr"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "Matt", "Wood", "1234567890", "Addr"));
    }

    @Test
    void testFirstNameValidation() {
        Contact contact = new Contact("1", "Matt", "Wood", "1234567890", "Addr");
        // Requirement: First Name not null and <= 10 characters
        assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(null));
        assertThrows(IllegalArgumentException.class, () -> contact.setFirstName("MoreThanTenChars"));
    }

    @Test
    void testLastNameValidation() {
        Contact contact = new Contact("1", "Matt", "Wood", "1234567890", "Addr");
        // Requirement: Last Name not null and <= 10 characters
        assertThrows(IllegalArgumentException.class, () -> contact.setLastName(null));
        assertThrows(IllegalArgumentException.class, () -> contact.setLastName("MoreThanTenChars"));
    }

    @Test
    void testPhoneValidation() {
        Contact contact = new Contact("1", "Matt", "Wood", "1234567890", "Addr");
        // Requirement: Exactly 10 digits, not null
        assertThrows(IllegalArgumentException.class, () -> contact.setPhone(null));
        assertThrows(IllegalArgumentException.class, () -> contact.setPhone("12345")); // Too short
        assertThrows(IllegalArgumentException.class, () -> contact.setPhone("12345678901")); // Too long
        assertThrows(IllegalArgumentException.class, () -> contact.setPhone("ABC4567890")); // Non-numeric
    }

    @Test
    void testAddressValidation() {
        Contact contact = new Contact("1", "Matt", "Wood", "1234567890", "Addr");
        // Requirement: Address not null and <= 30 characters
        assertThrows(IllegalArgumentException.class, () -> contact.setAddress(null));
        assertThrows(IllegalArgumentException.class, () -> contact.setAddress("This address is way too long for the thirty char limit"));
    }
}
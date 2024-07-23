package hutly.contacts_api.service;


import hutly.contacts_api.dto.ContactDTO;
import hutly.contacts_api.entities.Contact;

import java.util.List;

public interface IContact {
    Contact saveContact(ContactDTO contactDTO);

    Contact deleteContact(String id);

    List<Contact> getAllContacts();
}

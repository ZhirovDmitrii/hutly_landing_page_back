package hutly.contacts_api.service;

import hutly.contacts_api.dto.ContactDTO;
import hutly.contacts_api.entities.Contact;
import hutly.contacts_api.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService implements IContact {
    private final ContactRepository contactRepository;
    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public Contact saveContact(ContactDTO contactDTO) {
        Contact contact = new Contact();
        contact.setFirstName(contactDTO.getFirstName());
        contact.setLastName(contactDTO.getLastName());
        contact.setEmail(contactDTO.getEmail());
        contact.setPhone(contactDTO.getPhone());
        contact.setMessage(contactDTO.getMessage());

        return contactRepository.save(contact);
    }

    @Override
    public Contact deleteContact(String id) {
        Optional<Contact> optionalContact = contactRepository.findById(id);
        if (optionalContact.isPresent()) {
            Contact contact = optionalContact.get();
            contactRepository.deleteById(id);
            return contact;
        } else {
            throw new RuntimeException("Contact " + "'" + id + "'" + " not found");
        }
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

}

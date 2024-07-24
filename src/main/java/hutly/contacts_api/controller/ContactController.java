package hutly.contacts_api.controller;

import hutly.contacts_api.dto.ContactDTO;
import hutly.contacts_api.entities.Contact;
import hutly.contacts_api.service.ContactService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
@CrossOrigin(origins = "https://hutly-landing-page-back.onrender.com")
public class ContactController {
    private final ContactService contactService;
    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public ResponseEntity<List<Contact>> getAllContacts() {
        List<Contact> contacts = contactService.getAllContacts();
        return ResponseEntity.ok(contacts);
    }

    @PostMapping
    public ResponseEntity<Contact> createContact(@Valid @RequestBody ContactDTO contactDTO) {
        Contact contact = contactService.saveContact(contactDTO);
        return ResponseEntity.ok(contact);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Contact> deleteContact(@PathVariable String id) {
        Contact contact = contactService.deleteContact(id);
        return ResponseEntity.ok(contact);
    }
}

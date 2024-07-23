package hutly.contacts_api.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "contacts")
public class Contact {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String message;
}

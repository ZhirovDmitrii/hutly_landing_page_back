package hutly.contacts_api.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ContactDTO {
    @NotBlank(message = "First name is mandatory")
    @Size(min = 3, max = 20, message = "First name must be between 2 and 50 characters")
    private String firstName;

    @NotBlank(message = "Second name is mandatory")
    @Size(min = 3, max = 20, message = "Last name must be between 2 and 50 characters")
    private String lastName;

    @NotBlank(message = "Phone number is mandatory")
    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
    private String phone;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email must be valid")
    private String email;

    @NotBlank(message = "Message is mandatory")
    @Size(min = 10, max = 1000, message = "Message must be between 2 and 50 characters")
    private String message;
}

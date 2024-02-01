package ch.copiiinux.awesomespringboot.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.UUID;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"email"})})
public class User {
    @Id
    @UUID
    @GeneratedValue(strategy = GenerationType.UUID)
    private java.util.UUID id;
    @Email
    @NotNull
    @Size(max = 255)
    private String email;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String firstname;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String lastname;
}

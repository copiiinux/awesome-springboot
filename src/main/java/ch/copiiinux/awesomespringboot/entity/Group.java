package ch.copiiinux.awesomespringboot.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.UUID;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})})
public class Group {
    @Id
    @UUID
    @GeneratedValue(strategy = GenerationType.UUID)
    private java.util.UUID id;
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String name;
}

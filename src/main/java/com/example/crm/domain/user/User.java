package com.example.crm.domain.user;

import com.example.crm.domain.employer.Role;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(unique = true)
    private String username;

    @NotNull
    @Length(min = 8)
    private String password;

    @NotNull
    @Email(regexp = ".+@.+")
    private String email;

    @CollectionTable(name = "authorities")
    @ElementCollection(targetClass = Role.class)
    private Set<GrantedAuthority> authorities;

    private boolean active;

    private Date activatedAt;

    private String activationCode;

    private Date changeActivationCodeAt;

    public void setActive(boolean active) {
        this.active = active;
        if (active) {
            activatedAt = new Date();
        }
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
        this.changeActivationCodeAt = new Date();
    }
}

package com.beblink.h2.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * The type User.
 */
@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    /** The id. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** The firstName. */
    private String firstName;

    /** The lastName. */
    private String lastName;

    /** The email. */
    private String email;
}

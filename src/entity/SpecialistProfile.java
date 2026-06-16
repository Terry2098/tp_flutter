<<<<<<< HEAD
package com.app.platform.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class SpecialistProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String specialite;
    private String biographie;
    private String adresse;
    private String telephone;
    private Double tarif;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
=======
package com.app.platform.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class SpecialistProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String specialite;
    private String biographie;
    private String adresse;
    private String telephone;
    private Double tarif;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
>>>>>>> 61a1cc0 (Premier commit)
}
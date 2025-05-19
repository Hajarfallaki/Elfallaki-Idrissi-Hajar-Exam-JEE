package org.sid.examen_final_jee.entites;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("PERSONNEL")
public class CreditPersonnel extends Credit {
    private String motif;

    // Getters et Setters
}

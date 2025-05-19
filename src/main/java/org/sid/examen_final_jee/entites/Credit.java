package org.sid.examen_final_jee.entites;

import jakarta.persistence.*;
import org.sid.examen_final_jee.enumerations.StatutCredit;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_credit")
public abstract class Credit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dateDemande;

    @Enumerated(EnumType.STRING)
    private StatutCredit statut;

    private LocalDate dateAcceptation;
    private Double montant;
    private Integer dureeRemboursement;
    private Double tauxInteret;

    @ManyToOne
    private Client client;

    // Getters et Setters
}

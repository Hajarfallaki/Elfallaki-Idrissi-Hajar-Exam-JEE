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

    // Constructeur vide
    public Credit() {
    }

    // Constructeur complet
    public Credit(LocalDate dateDemande, StatutCredit statut, LocalDate dateAcceptation,
                  Double montant, Integer dureeRemboursement, Double tauxInteret, Client client) {
        this.dateDemande = dateDemande;
        this.statut = statut;
        this.dateAcceptation = dateAcceptation;
        this.montant = montant;
        this.dureeRemboursement = dureeRemboursement;
        this.tauxInteret = tauxInteret;
        this.client = client;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(LocalDate dateDemande) {
        this.dateDemande = dateDemande;
    }

    public StatutCredit getStatut() {
        return statut;
    }

    public void setStatut(StatutCredit statut) {
        this.statut = statut;
    }

    public LocalDate getDateAcceptation() {
        return dateAcceptation;
    }

    public void setDateAcceptation(LocalDate dateAcceptation) {
        this.dateAcceptation = dateAcceptation;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Integer getDureeRemboursement() {
        return dureeRemboursement;
    }

    public void setDureeRemboursement(Integer dureeRemboursement) {
        this.dureeRemboursement = dureeRemboursement;
    }

    public Double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(Double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "id=" + id +
                ", dateDemande=" + dateDemande +
                ", statut=" + statut +
                ", dateAcceptation=" + dateAcceptation +
                ", montant=" + montant +
                ", dureeRemboursement=" + dureeRemboursement +
                ", tauxInteret=" + tauxInteret +
                ", client=" + (client != null ? client.getId() : null) +
                '}';
    }
}

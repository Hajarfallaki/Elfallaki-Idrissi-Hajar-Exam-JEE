package org.sid.examen_final_jee.entites;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import org.sid.examen_final_jee.enumerations.StatutCredit;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("PERSONNEL")
public class CreditPersonnel extends Credit {

    private String motif;

    public CreditPersonnel() {
        super();
    }

    public CreditPersonnel(LocalDate dateDemande, StatutCredit statut, LocalDate dateAcceptation,
                           Double montant, Integer dureeRemboursement, Double tauxInteret,
                           Client client, String motif) {
        super(dateDemande, statut, dateAcceptation, montant, dureeRemboursement, tauxInteret, client);
        this.motif = motif;
    }

    @Override
    public void setClient(Client client) {
        super.setClient(client);
    }

    // Tu peux retirer cette méthode si tu veux, car elle est déjà définie dans la classe parent
    @Override
    public void setDateAcceptation(LocalDate dateAcceptation) {
        super.setDateAcceptation(dateAcceptation);
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }
}

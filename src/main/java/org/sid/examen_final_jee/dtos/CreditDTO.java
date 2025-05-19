package org.sid.examen_final_jee.dtos;

import lombok.Data;
import java.util.Date;

@Data
public class CreditDTO {
    private Long id;
    private Date dateDemande;
    private String statut;
    private Date dateAcception;
    private double montant;
    private int dureeRemboursement;
    private double tauxInteret;
    private Long clientId;  // ID du client associé
}
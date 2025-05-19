package org.sid.examen_final_jee.mappers;



import org.sid.examen_final_jee.dtos.*;
import org.sid.examen_final_jee.entites.*;
import org.sid.examen_final_jee.enumerations.StatutCredit;

public class CreditMapper {

    public static CreditPersonnelDTO toCreditPersonnelDTO(CreditPersonnel credit) {
        CreditPersonnelDTO dto = new CreditPersonnelDTO();
        dto.setId(credit.getId());

        dto.setStatut(credit.getStatut().name());

        dto.setMontant(credit.getMontant());
        dto.setDureeRemboursement(credit.getDureeRemboursement());
        dto.setTauxInteret(credit.getTauxInteret());
        dto.setMotif(credit.getMotif());
        dto.setClientId(credit.getClient().getId());
        return dto;
    }

    public static CreditPersonnel fromCreditPersonnelDTO(CreditPersonnelDTO dto) {
        CreditPersonnel credit = new CreditPersonnel();
        credit.setId(dto.getId());

        credit.setStatut(StatutCredit.valueOf(dto.getStatut()));

        credit.setMontant(dto.getMontant());
        credit.setDureeRemboursement(dto.getDureeRemboursement());
        credit.setTauxInteret(dto.getTauxInteret());
        credit.setMotif(dto.getMotif());
        return credit;
    }
}

package org.sid.examen_final_jee.services;



import org.sid.examen_final_jee.dtos.CreditPersonnelDTO;

import java.util.List;

public interface CreditService {
    CreditPersonnelDTO createCreditPersonnel(CreditPersonnelDTO dto);
    List<CreditPersonnelDTO> getAllCreditPersonnel();
    CreditPersonnelDTO getCreditPersonnelById(Long id);
    void deleteCreditPersonnel(Long id);
}

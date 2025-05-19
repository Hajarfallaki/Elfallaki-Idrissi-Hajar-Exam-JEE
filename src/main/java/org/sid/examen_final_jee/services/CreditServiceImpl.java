package org.sid.examen_final_jee.services;

package org.sid.examen_final_jee.services;

import org.sid.examen_final_jee.dtos.CreditPersonnelDTO;
import org.sid.examen_final_jee.entites.Client;
import org.sid.examen_final_jee.entites.CreditPersonnel;
import org.sid.examen_final_jee.mappers.CreditMapper;
import org.sid.examen_final_jee.repositories.ClientRepository;
import org.sid.examen_final_jee.repositories.CreditPersonnelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CreditServiceImpl implements CreditService {

    private final CreditPersonnelRepository creditRepo;
    private final ClientRepository clientRepo;

    @Override
    public CreditPersonnelDTO createCreditPersonnel(CreditPersonnelDTO dto) {
        CreditPersonnel credit = CreditMapper.fromCreditPersonnelDTO(dto);
        Client client = clientRepo.findById(dto.getClientId()).orElseThrow(() ->
                new IllegalArgumentException("Client non trouvé avec l'ID : " + dto.getClientId()));
        credit.setClient(client);
        return CreditMapper.toCreditPersonnelDTO(creditRepo.save(credit));
    }

    @Override
    public List<CreditPersonnelDTO> getAllCreditPersonnel() {
        return creditRepo.findAll()
                .stream()
                .map(CreditMapper::toCreditPersonnelDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CreditPersonnelDTO getCreditPersonnelById(Long id) {
        return creditRepo.findById(id)
                .map(CreditMapper::toCreditPersonnelDTO)
                .orElseThrow(() ->
                        new IllegalArgumentException("Crédit personnel non trouvé avec l'ID : " + id));
    }

    @Override
    public void deleteCreditPersonnel(Long id) {
        if (!creditRepo.existsById(id)) {
            throw new IllegalArgumentException("Aucun crédit personnel avec l'ID : " + id);
        }
        creditRepo.deleteById(id);
    }
}


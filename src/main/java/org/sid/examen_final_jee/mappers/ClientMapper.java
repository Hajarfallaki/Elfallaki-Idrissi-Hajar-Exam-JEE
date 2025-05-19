package org.sid.examen_final_jee.mappers;

import org.sid.examen_final_jee.dtos.ClientDTO;
import org.sid.examen_final_jee.entites.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {

    public ClientDTO toDTO(Client client) {
        ClientDTO dto = new ClientDTO();
        dto.setId(client.getId());
        dto.setNom(client.getNom());
        dto.setEmail(client.getEmail());
        return dto;
    }

    public Client toEntity(ClientDTO dto) {
        Client client = new Client();
        client.setNom(dto.getNom());
        client.setEmail(dto.getEmail());
        return client;
    }
}


package org.sid.examen_final_jee.services;

import org.sid.examen_final_jee.dtos.ClientDTO;

import java.util.List;

public interface ClientService {
    List<ClientDTO> getAllClients();
    ClientDTO getClientById(Long id);
    ClientDTO createClient(ClientDTO clientDTO);
    void deleteClient(Long id);
}

package org.sid.examen_final_jee.web;

import org.sid.examen_final_jee.dtos.ClientDTO;
import org.sid.examen_final_jee.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<ClientDTO> getAllClients() {
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public ClientDTO getClientById(@PathVariable Long id) {
        return clientService.getClientById(id);
    }

    @PostMapping
    public ClientDTO createClient(@RequestBody ClientDTO clientDTO) {
        return clientService.createClient(clientDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}

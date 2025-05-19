package org.sid.examen_final_jee.repositories;

import org.sid.examen_final_jee.entites.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    // Méthodes personnalisées si nécessaire
}

package org.sid.examen_final_jee;

import org.sid.examen_final_jee.entites.Client;
import org.sid.examen_final_jee.entites.CreditPersonnel;
import org.sid.examen_final_jee.enumerations.StatutCredit;
import org.sid.examen_final_jee.repositories.ClientRepository;
import org.sid.examen_final_jee.repositories.CreditPersonnelRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class ExamenFinalJeeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenFinalJeeApplication.class, args);
    }

    // Bean CommandLineRunner pour initialiser la base de données
    @Bean
    CommandLineRunner initData(ClientRepository clientRepo, CreditPersonnelRepository creditRepo) {
        return args -> {
            // Création de clients
            Client client1 = new Client(null, "Dupont", "dupont@example.com");
            Client client2 = new Client(null, "Martin", "martin@example.com");
            clientRepo.save(client1);
            clientRepo.save(client2);

            // Création de crédits personnels
            CreditPersonnel credit1 = new CreditPersonnel();
            credit1.setClient(client1);
            credit1.setDateDemande(LocalDate.now().minusDays(10));
            credit1.setStatut(StatutCredit.EN_COURS);
            credit1.setMontant(15000.0);
            credit1.setDureeRemboursement(36);
            credit1.setTauxInteret(4.5);
            credit1.setMotif("Achat voiture");

            CreditPersonnel credit2 = new CreditPersonnel();
            credit2.setClient(client2);
            credit2.setDateDemande(LocalDate.now().minusDays(20));
            credit2.setStatut(StatutCredit.ACCEPTE);
            credit2.setMontant(8000.0);
            credit2.setDureeRemboursement(24);
            credit2.setTauxInteret(3.8);
            credit2.setMotif("Travaux maison");

            creditRepo.save(credit1);
            creditRepo.save(credit2);
        };
    }
}

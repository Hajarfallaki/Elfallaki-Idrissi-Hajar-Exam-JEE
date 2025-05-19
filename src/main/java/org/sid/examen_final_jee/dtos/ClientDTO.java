package org.sid.examen_final_jee.dtos;

public class ClientDTO {
    private Long id;
    private String nom;
    private String email;

    // Constructeur vide
    public ClientDTO() {
    }

    // Constructeur avec tous les champs
    public ClientDTO(Long id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
    }

    // Getter pour id
    public Long getId() {
        return id;
    }

    // Setter pour id
    public void setId(Long id) {
        this.id = id;
    }

    // Getter pour nom
    public String getNom() {
        return nom;
    }

    // Setter pour nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter pour email
    public String getEmail() {
        return email;
    }

    // Setter pour email
    public void setEmail(String email) {
        this.email = email;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "ClientDTO{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

package com.issam.clubsportif.entity;

// Issam : Imports JPA et formatage des dates
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import java.util.List;

/**
 * Issam : Entité Membre - Représente un membre du club sportif
 * Auteur : Issam ABOUSSAKKINE
 */
@Entity
public class Membre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String categorie;

    @Column(name = "date_adhesion")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateAdhesion;

    // Issam : Relation OneToMany avec Inscription
    @OneToMany(mappedBy = "membre", cascade = CascadeType.ALL)
    private List<Inscription> inscriptions;

    public Membre() {
    }

    // Issam : Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getCategorie() { return categorie; }
    public void setCategorie(String categorie) { this.categorie = categorie; }

    public LocalDate getDateAdhesion() { return dateAdhesion; }
    public void setDateAdhesion(LocalDate dateAdhesion) { this.dateAdhesion = dateAdhesion; }

    public List<Inscription> getInscriptions() { return inscriptions; }
    public void setInscriptions(List<Inscription> inscriptions) { this.inscriptions = inscriptions; }
}
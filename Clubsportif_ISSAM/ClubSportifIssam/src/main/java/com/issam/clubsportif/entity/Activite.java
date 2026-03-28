package com.issam.clubsportif.entity;

// Issam : Imports JPA
import jakarta.persistence.*;
import java.util.List;

/**
 * Issam : Entité Activité - Représente une activité sportive du club
 * Auteur : Issam ABOUSSAKKINE
 */
@Entity
public class Activite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String niveau;
    private Integer capacite;

    // Issam : Relation OneToMany avec Inscription
    // Issam : mappedBy = "activite" signifie que la relation est gérée par l'entité Inscription
    @OneToMany(mappedBy = "activite", cascade = CascadeType.ALL)
    private List<Inscription> inscriptions;

    // Issam : Constructeur par défaut
    public Activite() {
    }

    // Issam : Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getNiveau() { return niveau; }
    public void setNiveau(String niveau) { this.niveau = niveau; }

    public Integer getCapacite() { return capacite; }
    public void setCapacite(Integer capacite) { this.capacite = capacite; }

    public List<Inscription> getInscriptions() { return inscriptions; }
    public void setInscriptions(List<Inscription> inscriptions) { this.inscriptions = inscriptions; }
}
package com.issam.clubsportif.entity;

// Issam : Imports JPA et formatage des dates
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

/**
 * Issam : Entité Inscription - Lie un membre à une activité
 * Auteur : Issam ABOUSSAKKINE
 */
@Entity
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    private String statut; // Issam : ex: Payé, En attente, Annulé
    private Double montant;

    // Issam : Relation ManyToOne avec Activite
    @ManyToOne
    @JoinColumn(name = "activite_id")
    private Activite activite;

    // Issam : Relation ManyToOne avec Membre
    @ManyToOne
    @JoinColumn(name = "membre_id")
    private Membre membre;

    public Inscription() {
    }

    // Issam : Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }

    public Double getMontant() { return montant; }
    public void setMontant(Double montant) { this.montant = montant; }

    public Activite getActivite() { return activite; }
    public void setActivite(Activite activite) { this.activite = activite; }

    public Membre getMembre() { return membre; }
    public void setMembre(Membre membre) { this.membre = membre; }
}
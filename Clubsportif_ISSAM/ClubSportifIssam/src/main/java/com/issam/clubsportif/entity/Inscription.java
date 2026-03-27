package com.issam.clubsportif.entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

/**
 * @author Issam ABOUSSAKKINE
 */
@Entity
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private String statut; // ex: Payé, En attente, Annulé
    private Double montant;

    @ManyToOne
    @JoinColumn(name = "activite_id")
    private Activite activite;

    @ManyToOne
    @JoinColumn(name = "membre_id")
    private Membre membre;

    public Inscription() {
    }

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

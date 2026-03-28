package com.issam.clubsportif.repository;

// Issam : Imports
import com.issam.clubsportif.entity.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Issam : Repository pour l'entité Inscription
 * Auteur : Issam ABOUSSAKKINE
 */
@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
    // Issam : Hérite des méthodes CRUD de JpaRepository
}
package com.issam.clubsportif.repository;

// Issam : Imports
import com.issam.clubsportif.entity.Activite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Issam : Repository pour l'entité Activite
 * Auteur : Issam ABOUSSAKKINE
 */
@Repository
public interface ActiviteRepository extends JpaRepository<Activite, Long> {
    // Issam : Hérite des méthodes CRUD de JpaRepository
}
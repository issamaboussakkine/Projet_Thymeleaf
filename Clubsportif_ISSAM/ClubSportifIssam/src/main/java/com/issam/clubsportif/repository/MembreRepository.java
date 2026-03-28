package com.issam.clubsportif.repository;

// Issam : Imports
import com.issam.clubsportif.entity.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Issam : Repository pour l'entité Membre
 * Auteur : Issam ABOUSSAKKINE
 */
@Repository
public interface MembreRepository extends JpaRepository<Membre, Long> {
    // Issam : Hérite des méthodes CRUD de JpaRepository
}
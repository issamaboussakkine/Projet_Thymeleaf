package com.issam.clubsportif.service;

// Issam : Imports
import com.issam.clubsportif.entity.Inscription;
import com.issam.clubsportif.repository.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Issam : Service pour la gestion des inscriptions
 * Auteur : Issam ABOUSSAKKINE
 */
@Service
public class InscriptionService {

    @Autowired
    private InscriptionRepository inscriptionRepository;

    /**
     * Issam : Récupère toutes les inscriptions
     */
    public List<Inscription> getAllInscriptions() {
        return inscriptionRepository.findAll();
    }

    /**
     * Issam : Récupère une inscription par son ID
     */
    public Inscription getInscriptionById(Long id) {
        return inscriptionRepository.findById(id).orElse(null);
    }

    /**
     * Issam : Sauvegarde une inscription
     */
    public void saveInscription(Inscription inscription) {
        inscriptionRepository.save(inscription);
    }

    /**
     * Issam : Supprime une inscription par son ID
     */
    public void deleteInscription(Long id) {
        inscriptionRepository.deleteById(id);
    }
}
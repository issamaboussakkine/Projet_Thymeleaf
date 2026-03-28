package com.issam.clubsportif.service;

// Issam : Imports
import com.issam.clubsportif.entity.Membre;
import com.issam.clubsportif.repository.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Issam : Service pour la gestion des membres
 * Auteur : Issam ABOUSSAKKINE
 */
@Service
public class MembreService {

    @Autowired
    private MembreRepository membreRepository;

    /**
     * Issam : Récupère tous les membres
     */
    public List<Membre> getAllMembres() {
        return membreRepository.findAll();
    }

    /**
     * Issam : Récupère un membre par son ID
     */
    public Membre getMembreById(Long id) {
        return membreRepository.findById(id).orElse(null);
    }

    /**
     * Issam : Sauvegarde un membre
     */
    public void saveMembre(Membre membre) {
        membreRepository.save(membre);
    }

    /**
     * Issam : Supprime un membre par son ID
     */
    public void deleteMembre(Long id) {
        membreRepository.deleteById(id);
    }
}
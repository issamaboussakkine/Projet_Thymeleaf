package com.issam.clubsportif.service;

// Issam : Imports
import com.issam.clubsportif.entity.Activite;
import com.issam.clubsportif.repository.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Issam : Service pour la gestion des activités
 * Auteur : Issam ABOUSSAKKINE
 */
@Service
public class ActiviteService {

    @Autowired
    private ActiviteRepository activiteRepository;

    /**
     * Issam : Récupère toutes les activités
     * @return Liste de toutes les activités
     */
    public List<Activite> getAllActivites() {
        return activiteRepository.findAll();
    }

    /**
     * Issam : Récupère une activité par son ID
     * @param id Identifiant de l'activité
     * @return Activité trouvée ou null
     */
    public Activite getActiviteById(Long id) {
        return activiteRepository.findById(id).orElse(null);
    }

    /**
     * Issam : Sauvegarde une activité (création ou modification)
     * @param activite Activité à sauvegarder
     */
    public void saveActivite(Activite activite) {
        activiteRepository.save(activite);
    }

    /**
     * Issam : Supprime une activité par son ID
     * @param id Identifiant de l'activité à supprimer
     */
    public void deleteActivite(Long id) {
        activiteRepository.deleteById(id);
    }
}
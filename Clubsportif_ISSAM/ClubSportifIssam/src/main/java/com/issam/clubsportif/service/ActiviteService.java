package com.issam.clubsportif.service;

import com.issam.clubsportif.entity.Activite;
import com.issam.clubsportif.repository.ActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Issam ABOUSSAKKINE
 */
@Service
public class ActiviteService {

    @Autowired
    private ActiviteRepository activiteRepository;

    public List<Activite> getAllActivites() {
        return activiteRepository.findAll();
    }

    public Activite getActiviteById(Long id) {
        return activiteRepository.findById(id).orElse(null);
    }

    public void saveActivite(Activite activite) {
        activiteRepository.save(activite);
    }

    public void deleteActivite(Long id) {
        activiteRepository.deleteById(id);
    }
}

package com.issam.clubsportif.service;

import com.issam.clubsportif.entity.Inscription;
import com.issam.clubsportif.repository.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Issam ABOUSSAKKINE
 */
@Service
public class InscriptionService {

    @Autowired
    private InscriptionRepository inscriptionRepository;

    public List<Inscription> getAllInscriptions() {
        return inscriptionRepository.findAll();
    }

    public Inscription getInscriptionById(Long id) {
        return inscriptionRepository.findById(id).orElse(null);
    }

    public void saveInscription(Inscription inscription) {
        inscriptionRepository.save(inscription);
    }

    public void deleteInscription(Long id) {
        inscriptionRepository.deleteById(id);
    }
}

package com.issam.clubsportif.service;

import com.issam.clubsportif.entity.Membre;
import com.issam.clubsportif.repository.MembreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Issam ABOUSSAKKINE
 */
@Service
public class MembreService {

    @Autowired
    private MembreRepository membreRepository;

    public List<Membre> getAllMembres() {
        return membreRepository.findAll();
    }

    public Membre getMembreById(Long id) {
        return membreRepository.findById(id).orElse(null);
    }

    public void saveMembre(Membre membre) {
        membreRepository.save(membre);
    }

    public void deleteMembre(Long id) {
        membreRepository.deleteById(id);
    }
}

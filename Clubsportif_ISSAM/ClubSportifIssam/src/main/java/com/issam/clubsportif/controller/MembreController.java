package com.issam.clubsportif.controller;

// Issam : Imports
import com.issam.clubsportif.entity.Membre;
import com.issam.clubsportif.service.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Issam : Contrôleur pour la gestion des membres
 * Auteur : Issam ABOUSSAKKINE
 */
@Controller
@RequestMapping("/membres")
public class MembreController {

    @Autowired
    private MembreService membreService;

    /**
     * Issam : Affiche la liste de tous les membres
     */
    @GetMapping
    public String listeMembres(Model model) {
        model.addAttribute("membres", membreService.getAllMembres());
        return "membres/liste";
    }

    /**
     * Issam : Affiche le formulaire de création d'un membre
     */
    @GetMapping("/nouveau")
    public String afficherFormulaireCreation(Model model) {
        model.addAttribute("membre", new Membre());
        return "membres/form";
    }

    /**
     * Issam : Sauvegarde un membre (création ou modification)
     */
    @PostMapping("/sauvegarder")
    public String sauvegarderMembre(@ModelAttribute("membre") Membre membre) {
        membreService.saveMembre(membre);
        return "redirect:/membres";
    }

    /**
     * Issam : Affiche le formulaire de modification d'un membre
     */
    @GetMapping("/modifier/{id}")
    public String afficherFormulaireModification(@PathVariable("id") Long id, Model model) {
        Membre membre = membreService.getMembreById(id);
        if(membre == null) return "redirect:/membres";
        model.addAttribute("membre", membre);
        return "membres/form";
    }

    /**
     * Issam : Supprime un membre par son ID
     */
    @GetMapping("/supprimer/{id}")
    public String supprimerMembre(@PathVariable("id") Long id) {
        membreService.deleteMembre(id);
        return "redirect:/membres";
    }
}
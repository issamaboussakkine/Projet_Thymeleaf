package com.issam.clubsportif.controller;

import com.issam.clubsportif.entity.Membre;
import com.issam.clubsportif.service.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author Issam ABOUSSAKKINE
 */
@Controller
@RequestMapping("/membres")
public class MembreController {

    @Autowired
    private MembreService membreService;

    @GetMapping
    public String listeMembres(Model model) {
        model.addAttribute("membres", membreService.getAllMembres());
        return "membres/liste";
    }

    @GetMapping("/nouveau")
    public String afficherFormulaireCreation(Model model) {
        model.addAttribute("membre", new Membre());
        return "membres/form";
    }

    @PostMapping("/sauvegarder")
    public String sauvegarderMembre(@ModelAttribute("membre") Membre membre) {
        membreService.saveMembre(membre);
        return "redirect:/membres";
    }

    @GetMapping("/modifier/{id}")
    public String afficherFormulaireModification(@PathVariable("id") Long id, Model model) {
        Membre membre = membreService.getMembreById(id);
        if(membre == null) return "redirect:/membres";
        model.addAttribute("membre", membre);
        return "membres/form";
    }

    @GetMapping("/supprimer/{id}")
    public String supprimerMembre(@PathVariable("id") Long id) {
        membreService.deleteMembre(id);
        return "redirect:/membres";
    }
}

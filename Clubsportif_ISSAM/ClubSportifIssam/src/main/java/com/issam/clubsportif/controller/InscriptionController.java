package com.issam.clubsportif.controller;

import com.issam.clubsportif.entity.Inscription;
import com.issam.clubsportif.service.ActiviteService;
import com.issam.clubsportif.service.InscriptionService;
import com.issam.clubsportif.service.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author Issam ABOUSSAKKINE
 */
@Controller
@RequestMapping("/inscriptions")
public class InscriptionController {

    @Autowired
    private InscriptionService inscriptionService;
    
    @Autowired
    private ActiviteService activiteService;
    
    @Autowired
    private MembreService membreService;

    @GetMapping
    public String listeInscriptions(Model model) {
        model.addAttribute("inscriptions", inscriptionService.getAllInscriptions());
        return "inscriptions/liste";
    }

    @GetMapping("/nouveau")
    public String afficherFormulaireCreation(Model model) {
        Inscription i = new Inscription();
        i.setMembre(new com.issam.clubsportif.entity.Membre());
        i.setActivite(new com.issam.clubsportif.entity.Activite());
        model.addAttribute("inscription", i);
        model.addAttribute("activites", activiteService.getAllActivites());
        model.addAttribute("membres", membreService.getAllMembres());
        return "inscriptions/form";
    }

    @PostMapping("/sauvegarder")
    public String sauvegarderInscription(@ModelAttribute("inscription") Inscription inscription) {
        inscriptionService.saveInscription(inscription);
        return "redirect:/inscriptions";
    }

    @GetMapping("/modifier/{id}")
    public String afficherFormulaireModification(@PathVariable("id") Long id, Model model) {
        Inscription inscription = inscriptionService.getInscriptionById(id);
        if(inscription == null) return "redirect:/inscriptions";
        
        model.addAttribute("inscription", inscription);
        model.addAttribute("activites", activiteService.getAllActivites());
        model.addAttribute("membres", membreService.getAllMembres());
        return "inscriptions/form";
    }

    @GetMapping("/supprimer/{id}")
    public String supprimerInscription(@PathVariable("id") Long id) {
        inscriptionService.deleteInscription(id);
        return "redirect:/inscriptions";
    }
}

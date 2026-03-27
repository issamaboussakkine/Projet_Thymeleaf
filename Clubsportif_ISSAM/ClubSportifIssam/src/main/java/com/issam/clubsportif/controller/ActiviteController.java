package com.issam.clubsportif.controller;

import com.issam.clubsportif.entity.Activite;
import com.issam.clubsportif.service.ActiviteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author Issam ABOUSSAKKINE
 */
@Controller
@RequestMapping("/activites")
public class ActiviteController {

    @Autowired
    private ActiviteService activiteService;

    @GetMapping
    public String listeActivites(Model model) {
        model.addAttribute("activites", activiteService.getAllActivites());
        return "activites/liste";
    }

    @GetMapping("/nouveau")
    public String afficherFormulaireCreation(Model model) {
        model.addAttribute("activite", new Activite());
        return "activites/form";
    }

    @PostMapping("/sauvegarder")
    public String sauvegarderActivite(@ModelAttribute("activite") Activite activite) {
        activiteService.saveActivite(activite);
        return "redirect:/activites";
    }

    @GetMapping("/modifier/{id}")
    public String afficherFormulaireModification(@PathVariable("id") Long id, Model model) {
        Activite activite = activiteService.getActiviteById(id);
        if (activite == null) return "redirect:/activites";
        model.addAttribute("activite", activite);
        return "activites/form";
    }

    @GetMapping("/supprimer/{id}")
    public String supprimerActivite(@PathVariable("id") Long id) {
        activiteService.deleteActivite(id);
        return "redirect:/activites";
    }
}

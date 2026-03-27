package com.issam.clubsportif.controller;

import com.issam.clubsportif.service.ActiviteService;
import com.issam.clubsportif.service.InscriptionService;
import com.issam.clubsportif.service.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Issam ABOUSSAKKINE
 */
@Controller
public class StatistiquesController {

    @Autowired
    private ActiviteService activiteService;
    
    @Autowired
    private MembreService membreService;
    
    @Autowired
    private InscriptionService inscriptionService;

    @GetMapping("/")
    public String home() {
        return "redirect:/statistiques";
    }

    @GetMapping("/statistiques")
    public String afficherStatistiques(Model model) {
        long totalActivites = activiteService.getAllActivites().size();
        long totalMembres = membreService.getAllMembres().size();
        long totalInscriptions = inscriptionService.getAllInscriptions().size();
        
        model.addAttribute("totalActivites", totalActivites);
        model.addAttribute("totalMembres", totalMembres);
        model.addAttribute("totalInscriptions", totalInscriptions);
        
        // Frequencing by activity (simple calculation)
        model.addAttribute("activites", activiteService.getAllActivites());

        return "statistiques";
    }
}

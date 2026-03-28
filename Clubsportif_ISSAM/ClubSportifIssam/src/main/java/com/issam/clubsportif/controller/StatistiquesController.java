package com.issam.clubsportif.controller;

// Issam : Imports
import com.issam.clubsportif.service.ActiviteService;
import com.issam.clubsportif.service.InscriptionService;
import com.issam.clubsportif.service.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Issam : Contrôleur pour les statistiques du club sportif
 * Auteur : Issam ABOUSSAKKINE
 */
@Controller
public class StatistiquesController {

    @Autowired
    private ActiviteService activiteService;

    @Autowired
    private MembreService membreService;

    @Autowired
    private InscriptionService inscriptionService;

    /**
     * Issam : Redirection de la racine vers la page des statistiques
     */
    @GetMapping("/")
    public String home() {
        return "redirect:/statistiques";
    }

    /**
     * Issam : Affiche la page des statistiques
     * Issam : Calcule le nombre total d'activités, membres et inscriptions
     */
    @GetMapping("/statistiques")
    public String afficherStatistiques(Model model) {
        // Issam : Récupération des totaux
        long totalActivites = activiteService.getAllActivites().size();
        long totalMembres = membreService.getAllMembres().size();
        long totalInscriptions = inscriptionService.getAllInscriptions().size();

        // Issam : Envoi des données à la vue
        model.addAttribute("totalActivites", totalActivites);
        model.addAttribute("totalMembres", totalMembres);
        model.addAttribute("totalInscriptions", totalInscriptions);

        // Issam : Liste des activités pour afficher les détails
        model.addAttribute("activites", activiteService.getAllActivites());

        return "statistiques";
    }
}
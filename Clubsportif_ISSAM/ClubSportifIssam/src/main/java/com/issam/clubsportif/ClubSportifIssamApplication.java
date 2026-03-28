package com.issam.clubsportif;

// Issam : Imports Spring Boot
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Issam : Application principale du Club Sportif
 * Auteur : Issam ABOUSSAKKINE
 */
@SpringBootApplication
public class ClubSportifIssamApplication {

	public static void main(String[] args) {
		// Issam : Lancement de l'application
		SpringApplication.run(ClubSportifIssamApplication.class, args);

		// Issam : Message de confirmation dans la console
		System.out.println("=====================================");
		System.out.println("Club Sportif - Application démarrée");
		System.out.println("Auteur : Issam ABOUSSAKKINE");
		System.out.println("=====================================");
	}

}
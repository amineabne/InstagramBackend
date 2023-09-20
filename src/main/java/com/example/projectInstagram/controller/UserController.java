package com.example.projectInstagram.controller;

import com.example.projectInstagram.entities.User;
import com.example.projectInstagram.repository.UserRepository;
import com.example.projectInstagram.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/utilisateurs")
public class UserController {


    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/inscription")
    public ResponseEntity<?> inscription(@RequestBody User user) {
        // Implémentez la logique d'inscription, par exemple, en vérifiant les doublons d'e-mail, en hachant le mot de passe, et en enregistrant l'utilisateur dans la base de données.
        return ResponseEntity.ok("Inscription réussie");
    }

    @PostMapping("/connexion")
    public ResponseEntity<?> connexion(@RequestBody User user) {
        // Recherchez l'utilisateur par email dans la base de données
        User existingUser = userRepository.findByEmail(user.getEmail());

        if (existingUser == null) {
            // L'utilisateur n'existe pas, renvoyez une réponse JSON avec un code d'erreur (HTTP 400 - Bad Request)
            // et un message d'erreur.
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("L'utilisateur n'existe pas.");
        }

        // Vérifiez le mot de passe
        if (!existingUser.getMotDePasse().equals(user.getMotDePasse())) {
            // Mot de passe incorrect, renvoyez une réponse JSON avec un code d'erreur (HTTP 400 - Bad Request)
            // et un message d'erreur.
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Mot de passe incorrect.");
        }

        // Si les informations d'identification sont correctes, vous pouvez considérer l'utilisateur comme connecté.
        // Renvoyez une réponse JSON indiquant le succès de la connexion.
        return ResponseEntity.ok("Connexion réussie");
    }
}
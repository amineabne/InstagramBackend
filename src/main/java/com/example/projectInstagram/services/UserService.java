package com.example.projectInstagram.services;

import com.example.projectInstagram.entities.User;
import com.example.projectInstagram.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException; // Pour gérer les erreurs d'intégrité de données
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User inscrire(User user) {
        try {
            // Logique d'inscription simplifiée : Enregistrez l'utilisateur dans la base de données.
            return userRepository.save(user);
        } catch (DataIntegrityViolationException e) {
            // Gérez les exceptions liées à l'intégrité des données, par exemple, si l'e-mail est déjà utilisé.
            throw new IllegalArgumentException("L'e-mail est déjà utilisé.");
        }
    }

    public User connecter(String email, String motDePasse) {
        // Logique de connexion simplifiée : Vérifiez les informations d'identification et retournez l'utilisateur connecté.
        User users = userRepository.findByEmailAndMotDePasse(email, motDePasse);
        if (users == null) {
            throw new IllegalArgumentException("Les informations d'identification sont incorrectes.");
        }
        return users ;
    }
}

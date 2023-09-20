package com.example.projectInstagram.repository;

import com.example.projectInstagram.entities.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {
    // Ajoutez des méthodes personnalisées pour les requêtes de likes si nécessaire.
}

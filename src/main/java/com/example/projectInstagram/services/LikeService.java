package com.example.projectInstagram.services;

import com.example.projectInstagram.entities.Like;
import com.example.projectInstagram.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService {

    @Autowired
    private LikeRepository likeRepository;

    public Like likerPost(Like like) {
        // Logique de like simplifiée : Enregistrez le like dans la base de données.
        return likeRepository.save(like);
    }
}

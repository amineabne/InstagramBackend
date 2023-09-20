package com.example.projectInstagram.services;

import com.example.projectInstagram.entities.Comment;
import com.example.projectInstagram.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment ajouterCommentaire(Comment commentaire) {
        //Enregistrez le commentaire dans la base de données.
        return commentRepository.save(commentaire);
    }
}

package com.example.projectInstagram.controller;

import com.example.projectInstagram.entities.Comment;
import com.example.projectInstagram.entities.Like;
import com.example.projectInstagram.services.CommentService;
import com.example.projectInstagram.services.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts/{postId}")
public class InteractionController {

    @Autowired
    private LikeService likeService;

    @Autowired
    private CommentService commentService;

    @PostMapping("/like")
    public ResponseEntity<?> likerPost(@PathVariable Long postId, @RequestBody Like like) {
        // Implémentez la logique pour permettre à un utilisateur de liker un post en utilisant le postId pour identifier le post.
        return ResponseEntity.ok("Like ajouté avec succès");
    }

    @PostMapping("/commentaire")
    public ResponseEntity<?> ajouterCommentaire(@PathVariable Long postId, @RequestBody Comment comment ) {
        // Implémentez la logique pour permettre à un utilisateur d'ajouter un commentaire à un post en utilisant le postId pour identifier le post.
        return ResponseEntity.ok("Commentaire ajouté avec succès");
    }
}

package com.example.projectInstagram.controller;

import com.example.projectInstagram.entities.Post;
import com.example.projectInstagram.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/publication")
    public ResponseEntity<?> publierPost(@RequestBody Post post) {
        // Implémentez la logique de publication de post, par exemple, en enregistrant le post dans la base de données.
        return ResponseEntity.ok("Publication réussie");
    }

    @PutMapping("/{postId}")
    public ResponseEntity<?> editerPost(@PathVariable Long postId, @RequestBody Post post) {
        // Implémentez la logique d'édition de post en utilisant le postId pour identifier le post à éditer.
        return ResponseEntity.ok("Édition réussie");
    }

    @DeleteMapping("/{postId}")
    public ResponseEntity<?> supprimerPost(@PathVariable Long postId) {
        // Implémentez la logique de suppression de post en utilisant le postId pour identifier le post à supprimer.
        return ResponseEntity.ok("Suppression réussie");
    }
}

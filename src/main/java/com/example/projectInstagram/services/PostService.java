package com.example.projectInstagram.services;

import com.example.projectInstagram.entities.Post;
import com.example.projectInstagram.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post publierPost(Post post) {
        // Logique de publication de post simplifiée : Enregistrez le post dans la base de données.
        return postRepository.save(post);
    }

    public Post editerPost(Long postId, Post post) {
        // Logique d'édition de post simplifiée : Mettez à jour le post identifié par postId.
        Optional<Post> existingPostOptional = postRepository.findById(postId);
        if (existingPostOptional.isPresent()) {
            Post existingPost = existingPostOptional.get();
            existingPost.setContenu(post.getContenu());
            return postRepository.save(existingPost);
        } else {
            throw new IllegalArgumentException("Le post avec l'ID spécifié n'existe pas.");
        }
    }

    public void supprimerPost(Long postId) {
        // Logique de suppression de post simplifiée : Supprimez le post identifié par postId.
        try {
            postRepository.deleteById(postId);
        } catch (EmptyResultDataAccessException e) {
            throw new IllegalArgumentException("Le post avec l'ID spécifié n'existe pas.");
        }
    }
}

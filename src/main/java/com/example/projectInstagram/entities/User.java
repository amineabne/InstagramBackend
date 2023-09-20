package com.example.projectInstagram.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.util.List;

@Entity
@Table(name = "utilisateurs")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String email;
    private String motDePasse;

    // Définissez les getters et setters

    @OneToMany(mappedBy = "utilisateur")
    private List<Post> posts;

    @OneToMany(mappedBy = "utilisateur")
    private List<Like> likes;

    @OneToMany(mappedBy = "utilisateur")
    private List<Comment> comments;
}

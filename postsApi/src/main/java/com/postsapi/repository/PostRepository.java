package com.postsapi.repository;

import com.postsapi.model.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostRepository {

    private final List<Post> posts = List.of(
        new Post(1L, "17 de ago, 2024", "O que é linguagem de programação? Conheça as principais",
                "Uma das mais populares vertentes da tecnologia da informação, a área de programação segue tendo muita demanda de trabalho...", 4),

        new Post(2L, "12 de jul, 2024", "GitHub agora permite fazer login sem precisar de senha",
                "O GitHub anunciou nesta quarta-feira (12) o acesso a partir das passkeys...", 0),

        new Post(3L, "21 de jun, 2024", "Por que os hyperlinks são azuis em sua maioria?",
                "Quem navega na internet certamente já percebeu que hyperlinks são azuis...", 0),

        new Post(4L, "10 de jun, 2024", "Qual a diferença entre frontend, backend e fullstack?",
                "Se você está começando no desenvolvimento web, pode se confundir com esses termos...", 2),

        new Post(5L, "01 de jun, 2024", "O que é React e por que ele é tão usado?",
                "React é uma biblioteca JavaScript criada pelo Facebook que facilita a criação de interfaces de usuário...", 5),

        new Post(6L, "25 de mai, 2024", "Como começar na carreira de Front-End?",
                "O primeiro passo é entender HTML, CSS e JavaScript. Depois, estudar bibliotecas e frameworks...", 3)
    );

    public List<Post> findAll() {
        return posts;
    }
}
